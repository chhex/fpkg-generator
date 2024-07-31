package com.affichage.it21.fpkg.service;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.affichage.it21.fpkg.generator.DefaultNameSpaceFileWriter;
import com.affichage.it21.fpkg.generator.NameSpaceFileOutputWriter;
import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.SchemaBasedVisitor;
import com.apgsga.forms2java.persistence.util.NameConversion;

public class SchemaPkgServiceGenerator<T> implements FPkgServiceGenerator<T> {

    private final String rootNameSpace;

    private final String targetRootDir;

    private final String templateDirPath;

    private final String daoExtractionFile;

    private final ModelLoader daoExtractionLoader;

    private final NameSpaceFileOutputWriter writer = new DefaultNameSpaceFileWriter();

    private final Class<? extends SchemaBasedVisitor<T>> modelVisitorClass;

    public SchemaPkgServiceGenerator(String rootNameSpace, String targetRootDir, String templateDirPath,
            String daoExtractionFile,
            ModelLoader daoExtractionLoader, Class<? extends SchemaBasedVisitor<T>> modelVisitorClass) {
        this.rootNameSpace = rootNameSpace;
        this.targetRootDir = targetRootDir;
        this.templateDirPath = templateDirPath;
        this.daoExtractionFile = daoExtractionFile;
        this.daoExtractionLoader = daoExtractionLoader;
        this.modelVisitorClass = modelVisitorClass;
    }

    @Override
    public T generateFor(String... schemas) {
        writer.initRootNameSpaceDir(targetRootDir, rootNameSpace);
        try {
            var visitor = modelVisitorClass.getDeclaredConstructor(String.class, String.class)
                    .newInstance(rootNameSpace, templateDirPath);
            var pkgs = daoExtractionLoader.loadFromFileForSchemas(new File(daoExtractionFile), Arrays.asList(schemas));
            var pkgssorted = pkgs.stream()
                    .sorted(createPkgComparator())
                    .collect(Collectors.toList());
            Map<String, List<Pkg>> pkgsGrouped = pkgssorted.stream().collect(Collectors.groupingBy(w -> w.getSchema()));
            for (String schema : pkgsGrouped.keySet()) {
                writer.initSchemaNameSpaceDir(schema);
                var pkgsOfSchema = pkgsGrouped.get(schema);
                pkgsOfSchema.forEach(pkg -> {
                    visitor.generateFor(pkg, schema);
                    writer.writeOutputFile("ModelMapper.xml", NameConversion.toJavaName(pkg.getName()).toLowerCase(),
                            visitor.getResult().toString());
                });
            }
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

    public static Comparator<Pkg> createPkgComparator() {
        return Comparator.comparing(Pkg::getSchema)
                .thenComparing(Pkg::getName);
    }

}
