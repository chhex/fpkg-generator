package com.affichage.it21.fpkg.service;

import com.affichage.it21.fpkg.model.SchemaBasedVisitor;

public class SchemaPkgServiceGenBuilder<T> extends AbstractServiceGenBuilder<T> {

    private Class<? extends SchemaBasedVisitor<T>> modelVisitorClass;

    public FPkgServiceGeneratorBuilder<T> modelVisitorClass(Class<? extends SchemaBasedVisitor<T>> modelVisitorClass) {
        this.modelVisitorClass = modelVisitorClass;
        return this;
    }

    @Override
    public FPkgServiceGenerator<T> build() {
        return new SchemaPkgServiceGenerator<T>(getRootNameSpace(), getTargetRootDir(), getTemplateDir(),
                getDaoExtractionFile(), getDaoExtractionLoader(), modelVisitorClass);
    }

    public T buildAndRun(String... schemas) {
        return build().generateFor(schemas);
    }

}
