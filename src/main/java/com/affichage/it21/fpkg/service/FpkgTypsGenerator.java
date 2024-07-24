package com.affichage.it21.fpkg.service;

import java.io.File;
import java.io.IOException;
import java.util.List;


import com.affichage.it21.fpkg.generator.TypeMappingVisitor;
import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.XmlSaxModelLoader;

public class FpkgTypsGenerator {

    private String targetDir;
    private ModelVisitor visitor = new TypeMappingVisitor();
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
        var generator = new FpkgTypsGenerator();
        var daoExtraction = new File("src/main/resources/dao_extraction.rdbms"); 
        generator.generateFromFor(daoExtraction, List.of("VK")); 
     
    }

}
