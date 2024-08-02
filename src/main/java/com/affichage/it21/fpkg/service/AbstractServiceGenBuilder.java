package com.affichage.it21.fpkg.service;

import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.XmlSaxModelLoader;

public abstract class AbstractServiceGenBuilder<T> implements FPkgServiceGeneratorBuilder<T> {

    private static String NAME_SPACE_CONVENTION = "com.apgsga.it21.mybatis.services";

    private String rootNameSpace = NAME_SPACE_CONVENTION;

    private String daoExtractionFile; 

    private String targetRootDir; 

    private String templatesRootDir; 

    private ModelLoader daoExtractionLoader = new XmlSaxModelLoader(); 

    @Override
    public FPkgServiceGeneratorBuilder<T> daoExtractionFile(String daoExtractionFile) {
       this.daoExtractionFile = daoExtractionFile; 
       return this; 
    }

    @Override
    public FPkgServiceGeneratorBuilder<T> daoExtractionLoader(ModelLoader modelLoader) {
        this.daoExtractionLoader = modelLoader; 
        return this;
    }

    @Override
    public FPkgServiceGeneratorBuilder<T> rootNameSpace(String rootNameSpace) {
        this.rootNameSpace = rootNameSpace; 
        return this;
    }

    @Override
    public FPkgServiceGeneratorBuilder<T> targetRootDir(String targetRootDir) {
        this.targetRootDir = targetRootDir; 
        return this;
    }

    @Override
    public FPkgServiceGeneratorBuilder<T> templatesRootDir(String templatesRootDir) {
        this.templatesRootDir = templatesRootDir; 
        return this;
    }

    public String getRootNameSpace() {
        return rootNameSpace;
    }

    public String getDaoExtractionFile() {
        return daoExtractionFile;
    }

    public ModelLoader getDaoExtractionLoader() {
        return daoExtractionLoader;
    }

    public String getTargetRootDir() {
        return targetRootDir;
    }

    public String getTemplatesRootDir() {
        return templatesRootDir;
    }

 

    

}
