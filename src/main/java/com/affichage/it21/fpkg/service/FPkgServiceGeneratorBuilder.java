package com.affichage.it21.fpkg.service;

import com.affichage.it21.fpkg.model.ModelLoader;

public interface FPkgServiceGeneratorBuilder<T> {

    FPkgServiceGeneratorBuilder<T> daoExtractionFile(String daoExtraction); 

    FPkgServiceGeneratorBuilder<T> daoExtractionLoader(ModelLoader modelLoader); 

    FPkgServiceGeneratorBuilder<T> templatesDir(String templatesDir); 

    FPkgServiceGeneratorBuilder<T> targetRootDir(String targetRootDir); 

    FPkgServiceGeneratorBuilder<T> rootNameSpace(String rootNameSpace); 


    FPkgServiceGenerator<T> build(); 

   T buildAndRun(String ...schemas); 
    


}
