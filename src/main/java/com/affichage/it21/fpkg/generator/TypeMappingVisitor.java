package com.affichage.it21.fpkg.generator;

import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;

public class TypeMappingVisitor implements ModelVisitor {

    private final TypeMaps typeMaps = new TypeMaps(); 

    @Override
    public void visit(Pkg pkg) {
        System.out.println(String.format("*Package name: %s, schema %s", pkg.getName(), pkg.getSchema()));
    }

    @Override
    public void visit(Proc proc) {
        System.out.println(String.format("  >Procedure name: %s, type: %s, returnType: %s", proc.getName(), proc.getType(), proc.getReturnType()));
        if (proc.getReturnType() == null) return;
        System.out.println(String.format("  > Typemap Oracle 2 Java: %s", typeMaps.ora2java(null, proc.getReturnType())));
        System.out.println(String.format("  > Typemap Oracle 2 MyBatis: %s", typeMaps.ora2MyBatis(null, null, proc.getReturnType())));


    }

    @Override
    public void visit(Parameter parm) {
        System.out.println(String.format("   +Parameter name: %s, type: %s", parm.getName(), parm.getType()));
        System.out.println(String.format("   + Typemap Oracle 2 Java: %s", typeMaps.ora2java(parm.getName(), parm.getType())));
        System.out.println(String.format("   + Typemap Oracle 2 MyBatis: %s", typeMaps.ora2MyBatis(parm.getName(), parm.getParameterType(), parm.getType())));
    }

}
