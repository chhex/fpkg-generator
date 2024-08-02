package com.affichage.it21.fpkg.service;

import java.util.ArrayList;
import java.util.List;

import com.affichage.it21.fpkg.model.SchemaBasedVisitor;

public class SchemaPkgServiceGenBuilder<T> extends AbstractServiceGenBuilder<T> {

    private List<Class<? extends SchemaBasedVisitor<T>>> modelVisitorClazzes = new ArrayList<>();

    public SchemaPkgServiceGenBuilder<T> modelVisitorClass(Class<? extends SchemaBasedVisitor<T>> modelVisitorClass) {
        this.modelVisitorClazzes.add(modelVisitorClass);
        return this;
    }

    @Override
    public FPkgServiceGenerator<T> build() {
        return new SchemaPkgServiceGenerator<T>(getRootNameSpace(), getTargetRootDir(), getTemplatesRootDir(),
                getDaoExtractionFile(), getDaoExtractionLoader(), modelVisitorClazzes);
    }

    public T buildAndRun(String... schemas) {
        return build().generateFor(schemas);
    }

}
