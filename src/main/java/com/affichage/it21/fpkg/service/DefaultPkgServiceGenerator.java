package com.affichage.it21.fpkg.service;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.ModelVisitor;

public class DefaultPkgServiceGenerator<T> implements FPkgServiceGenerator<T> {

    private String daoExtractionFile;

    private ModelLoader daoExtractionLoader;

    private Class<? extends ModelVisitor<T>> modelVisitorClass;

    public DefaultPkgServiceGenerator(String daoExtractionFile,
            ModelLoader daoExtractionLoader, Class<? extends ModelVisitor<T>> modelVisitorClass) {
        this.daoExtractionFile = daoExtractionFile;
        this.daoExtractionLoader = daoExtractionLoader;
        this.modelVisitorClass = modelVisitorClass;
    }

    @Override
    public T generateFor(String... schema) {
        var pkgs = daoExtractionLoader.loadFromFileForSchemas(new File(daoExtractionFile), Arrays.asList(schema));
        ModelVisitor<T> modelVisitor;
        try {
            modelVisitor = modelVisitorClass.getDeclaredConstructor().newInstance();
            pkgs.forEach(pkg -> {
                pkg.accept(modelVisitor);
            });
            return modelVisitor.getResult();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            new RuntimeException(e);
        }
        throw new RuntimeException("Not really possbile");
    }

}
