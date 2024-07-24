package com.affichage.it21.fpkg.model;

public class Parameter {
    private final String name;
    private final String type;
    private final String parameterType; 
    public Parameter(String name, String type, String parameterType) {
        this.name = name;
        this.type = type;
        this.parameterType = parameterType; 
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getParameterType() {
        return parameterType;
    }
  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((parameterType == null) ? 0 : parameterType.hashCode());
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
        Parameter other = (Parameter) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (parameterType == null) {
            if (other.parameterType != null)
                return false;
        } else if (!parameterType.equals(other.parameterType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Parameter [name=" + name + ", type=" + type + ", parameterType=" + parameterType + "]";
    }
    public void accept(ModelVisitor visitor) {
        visitor.visit(this);
    }


    

}
