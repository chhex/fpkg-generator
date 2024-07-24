package com.affichage.it21.fpkg.model;

public interface ModelVisitor {

    public void visit(Pkg pkg); 
    public void visit(Proc proc); 
    public void visit(Parameter parm); 

}