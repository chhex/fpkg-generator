package com.affichage.it21.fpkg.model;

public interface SchemaBasedVisitor<T> extends ModelVisitor<T> {

    public void generateFor(Pkg pkg, String schema);

}
