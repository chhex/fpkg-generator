package com.affichage.it21.fpkg.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.print.attribute.standard.MediaSize.NA;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileSystemResourceLoader;
import org.springframework.core.io.Resource;

import com.affichage.it21.fpkg.generator.MyBatisServiceXMLGenerator;
import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.XmlSaxModelLoader;
import com.apgsga.forms2java.persistence.util.NameConversion;
import com.ibm.icu.impl.locale.XCldrStub.FileUtilities;

public class MyBatisFPkgServiceGenerator {

    private static String NAME_SPACE_CONVENTION = "com.apgsga.it21.mybatis.services";

    private ModelLoader modelLoader = new XmlSaxModelLoader();

    public void generateFromFor(File daoExtraction, List<String> schemas) {
        File rootGenDir = new File("src/generated/resources"); 
        var pkgs = modelLoader.loadFromFileForSchemas(daoExtraction, schemas);
        var pkgssorted = pkgs.stream()
                .sorted(createPkgComparator())
                .collect(Collectors.toList());
        Map<String, List<Pkg>> pkgsGrouped = pkgssorted.stream().collect(Collectors.groupingBy(w -> w.getSchema()));
        for (String schema : pkgsGrouped.keySet()) {
            var pkgsOfSchema = pkgsGrouped.get(schema);
            var visitor = new MyBatisServiceXMLGenerator(NAME_SPACE_CONVENTION, "src/main/resources/st/mybatis",
                    schema);
            pkgsOfSchema.forEach(pkg -> {
                visitor.init();
                pkg.accept(visitor);
                try {
                    File outputFile = new File(rootGenDir,
                            String.format("Service%s.xml", NameConversion.toJavaName(pkg.getName())));
                    var outputStream = new FileOutputStream(outputFile);
                    IOUtils.write(visitor.getOutputBuffer(), outputStream);
                } catch (IOException e) {
                    throw new RuntimeException(e); 
                }
            });
        }

    }

    public static Comparator<Pkg> createPkgComparator() {
        return Comparator.comparing(Pkg::getSchema)
                .thenComparing(Pkg::getName);
    }

    public static void main(String[] args) throws IOException {
        var generator = new MyBatisFPkgServiceGenerator();
        var daoExtraction = new File("src/main/resources/dao_extraction.rdbms");
        generator.generateFromFor(daoExtraction, List.of("VK"));

    }

}
