package com.affichage.it21.fpkg.model;

import com.affichage.it21.fpkg.generator.NameSpaceFileOutputWriter;

public interface SchemaBasedVisitor<T> extends ModelVisitor<T>, NameSpaceFileOutputWriter {

    public void generateFor(Pkg pkg, String schema);

}
