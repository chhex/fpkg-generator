package com.affichage.it21.fpkg.model;

import java.util.ArrayList;
import java.util.List;

public class Pkg {
    private final String name;
    private final String schema;
    private final List<Proc> procedures = new ArrayList<Proc>(); 
    
    public Pkg(String name, String schema) {
        this.name = name;
        this.schema = schema;
    }
    public String getName() {
        return name;
    }
    public String getSchema() {
        return schema;
    }
    public List<Proc> getProcedures() {
        return procedures;
    }

    public void add(Proc procedure){
        procedures.add(procedure);
    }

    public void accept(ModelVisitor visitor) {
        visitor.visit(this);
        getProcedures().forEach(proc -> { proc.accept(visitor);});
        visitor.postvisit(this);
    }
    @Override
    public String toString() {
        return "Fpkg [name=" + name + ", schema=" + schema + ", procedures=" + procedures + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((schema == null) ? 0 : schema.hashCode());
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
        Pkg other = (Pkg) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (schema == null) {
            if (other.schema != null)
                return false;
        } else if (!schema.equals(other.schema))
            return false;
        return true;
    }

}
