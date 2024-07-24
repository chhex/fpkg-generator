package com.affichage.it21.fpkg.generator;

import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;
import com.apgsga.forms2java.persistence.util.NameConversion;

public class SysoutJavaNameConversionVisitor implements ModelVisitor {

    @Override
    public void visit(Pkg pkg) {
        System.out.println(String.format("*Package name: %s, schema %s", NameConversion.toJavaName(pkg.getName()), pkg.getSchema()));
    }

    @Override
    public void visit(Proc proc) {
        System.out.println(String.format("  >Procedure name: %s, type: %s, returnType: %s", NameConversion.toJavaName(proc.getName()), proc.getType(), proc.getReturnType()));
    }

    @Override
    public void visit(Parameter parm) {
        System.out.println(String.format("   +Parameter name: %s, type: %s",  NameConversion.toJavaName(parm.getName()), parm.getType()));
    }

}

