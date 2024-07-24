package com.affichage.it21.fpkg.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;
import com.apgsga.forms2java.persistence.util.NameConversion;

public class TypesUsedVisitor implements ModelVisitor {

    private Map<String,List<String>> usages = new HashMap<>(); 

    private String lastPkgName;
    private String lastProcName; 

    public Map<String,List<String>>  getResult()  {
        return usages; 
    }

    @Override
    public void visit(Pkg pkg) {
        lastPkgName = pkg.getName(); 
    }

    @Override
    public void visit(Proc proc) {
        lastProcName =  proc.getName(); 
        if (proc.getReturnType() == null) return; 
        var current = lastPkgName + "." + lastProcName; 
        if (usages.containsKey(proc.getReturnType())) {
            usages.get(proc.getReturnType()).add(current); 
        } else {
            var usage = new ArrayList<String>(); 
            usage.add(current); 
            usages.put(proc.getReturnType(), usage); 
        }
    }

    @Override
    public void visit(Parameter parm) {
        var current = lastPkgName + "." + lastProcName +   parm.getName();
        if (usages.containsKey(parm.getType())) {
            usages.get(parm.getType()).add(current); 
        } else {
            var usage = new ArrayList<String>(); 
            usage.add(current); 
            usages.put(parm.getType(), usage); 
        }
    }

}
