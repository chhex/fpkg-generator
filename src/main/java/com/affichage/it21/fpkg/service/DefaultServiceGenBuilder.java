package com.affichage.it21.fpkg.service;

import com.affichage.it21.fpkg.model.ModelVisitor;

public class DefaultServiceGenBuilder<T> extends AbstractServiceGenBuilder<T> {

    private Class<? extends ModelVisitor<T>> modelVisitorClass; 

    public FPkgServiceGeneratorBuilder<T> modelVisitorClass(Class<? extends ModelVisitor<T>> modelVisitorClass) {
        this.modelVisitorClass = modelVisitorClass; 
        return this;
    }

    @Override
    public FPkgServiceGenerator<T> build() {
       return new DefaultPkgServiceGenerator<T>(getDaoExtractionFile(),  getDaoExtractionLoader(), modelVisitorClass); 
    } 

    public T buildAndRun(String ...schemas)  {
        return build().generateFor(schemas);
    }

}
