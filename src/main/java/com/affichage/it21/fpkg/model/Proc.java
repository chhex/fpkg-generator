package com.affichage.it21.fpkg.model;

import java.util.ArrayList;
import java.util.List;

public class Proc {
    private final String name;
    private final String type;
    private final String returnType; 
    private Pkg pkg; 
    private final List<Parameter> paramters = new ArrayList<Parameter>();
    public Proc(String name, String type, String returnType) {
        this.name = name;
        this.type = type;
        this.returnType = returnType;
    }

    public Proc(String name, String type) {
        this.name = name;
        this.type = type;
        this.returnType = "";
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getReturnType() {
        return returnType;
    }
    public List<Parameter> getParamters() {
        return paramters;
    }
    public void add(Parameter parameter) {
        paramters.add(parameter); 
    }
    
    public Pkg getPkg() {
        return pkg;
    }

    public void setPkg(Pkg pkg) {
        this.pkg = pkg;
    } 


    public void accept(ModelVisitor visitor) {
        visitor.visit(this);
        getParamters().forEach(parm ->{ parm.accept(visitor);});
        visitor.postvisit(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Proc other = (Proc) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "FProcedure [name=" + name + ", type=" + type + ", returnType=" + returnType + ", paramters=" + paramters
                + "]";
    }


    


}
