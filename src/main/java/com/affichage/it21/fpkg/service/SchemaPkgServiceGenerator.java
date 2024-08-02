package com.affichage.it21.fpkg.service;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.affichage.it21.fpkg.model.ModelLoader;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.SchemaBasedVisitor;

public class SchemaPkgServiceGenerator<T> implements FPkgServiceGenerator<T> {

    private final String rootNameSpace;

    private final String targetRootDir;

    private final String templateDirPath;

    private final String daoExtractionFile;

    private final ModelLoader daoExtractionLoader;

    private final List<Class<? extends SchemaBasedVisitor<T>>> modelVisitorClasses;

    public SchemaPkgServiceGenerator(String rootNameSpace, String targetRootDir, String templateDirPath,
            String daoExtractionFile,
            ModelLoader daoExtractionLoader, List<Class<? extends SchemaBasedVisitor<T>>> modelVisitorClasses) {
        this.rootNameSpace = rootNameSpace;
        this.targetRootDir = targetRootDir;
        this.templateDirPath = templateDirPath;
        this.daoExtractionFile = daoExtractionFile;
        this.daoExtractionLoader = daoExtractionLoader;
        this.modelVisitorClasses = modelVisitorClasses;
        ;
    }

    @Override
    public T generateFor(String... schemas) {

        try {
            for (Class<? extends SchemaBasedVisitor<T>> modelVisitorClass : modelVisitorClasses) {
                var visitor = modelVisitorClass.getDeclaredConstructor(String.class, String.class)
                        .newInstance(rootNameSpace, templateDirPath);
                visitor.initRootNameSpaceDir(targetRootDir, rootNameSpace);
                var pkgs = daoExtractionLoader.loadFromFileForSchemas(new File(daoExtractionFile),
                        Arrays.asList(schemas));
                var pkgssorted = pkgs.stream()
                        .sorted(createPkgComparator())
                        .collect(Collectors.toList());
                Map<String, List<Pkg>> pkgsGrouped = pkgssorted.stream()
                        .collect(Collectors.groupingBy(w -> w.getSchema()));
                for (String schema : pkgsGrouped.keySet()) {
                    visitor.initSchemaNameSpaceDir(schema);
                    var pkgsOfSchema = pkgsGrouped.get(schema);
                    pkgsOfSchema.forEach(pkg -> {
                        visitor.generateFor(pkg, schema);
                    });
                }
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
