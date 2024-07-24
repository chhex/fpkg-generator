package com.affichage.it21.fpkg.generator;

import com.affichage.it21.fpkg.model.AbstractModelVisitor;
import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;

public class SysoutVisitor extends AbstractModelVisitor {

    @Override
    public void visit(Pkg pkg) {
        System.out.println(String.format("*Package name: %s, schema %s", pkg.getName(), pkg.getSchema()));
    }

    @Override
    public void visit(Proc proc) {
        System.out.println(String.format("  >Procedure name: %s, type: %s, returnType: %s", proc.getName(), proc.getType(), proc.getReturnType()));
    }

    @Override
    public void visit(Parameter parm) {
        System.out.println(String.format("   +Parameter name: %s, type: %s", parm.getName(), parm.getType()));
    }

}
