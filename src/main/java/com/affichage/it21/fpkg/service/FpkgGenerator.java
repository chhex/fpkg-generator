package com.affichage.it21.fpkg.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.affichage.it21.fpkg.generator.SysoutJavaNameConversionVisitor;
import com.affichage.it21.fpkg.generator.SysoutVisitor;
import com.affichage.it21.fpkg.generator.TypeMappingVisitor;
import com.affichage.it21.fpkg.generator.TypesUsedVisitor;
import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.XmlSaxModelLoader;

public class FpkgGenerator {

    private String targetDir;
    private ModelVisitor visitor = new SysoutVisitor();
    private ModelLoader modelLoader = new XmlSaxModelLoader();

    public String getTargetDir() {
        return targetDir;
    }

    public void setTargetDir(String targetDir) {
        this.targetDir = targetDir;
    }

    public ModelVisitor getVisitor() {
        return visitor;
    }

    public void setVisitor(ModelVisitor visitor) {
        this.visitor = visitor;
    }

    public ModelLoader getModelLoader() {
        return modelLoader;
    }

    public void setModelLoader(ModelLoader modelLoader) {
        this.modelLoader = modelLoader;
    }

    public void generateFromFor(File daoExtraction, List<String> schemas) {
        var pkgs = modelLoader.loadFromFileForSchemas(daoExtraction, schemas);
        pkgs.forEach(pkg -> {
            pkg.accept(visitor);
        });
    }

 
    public static void main(String[] args) throws IOException {
        var generator = new FpkgGenerator();
        generator.setModelLoader(new XmlSaxModelLoader());
        generator.setVisitor(new SysoutVisitor());
        var daoExtraction = new File("src/main/resources/dao_extraction.rdbms"); 
        generator.generateFromFor(daoExtraction, List.of("VK")); 
        generator.setVisitor(new SysoutJavaNameConversionVisitor());
        generator.generateFromFor(daoExtraction, List.of("VK")); 
        var typesUsedVisitor = new TypesUsedVisitor(); 
        generator.setVisitor(typesUsedVisitor);
        generator.generateFromFor(daoExtraction, List.of("VK")); 
        var result = typesUsedVisitor.getResult(); 
        var types = result.keySet(); 
        for (String type : types) {
            System.out.println(String.format("*Type: %s used in:", type));
            for (String usage : result.get(type)) {
                System.out.println(String.format("  %s", usage));
            }

        }
    }

}
