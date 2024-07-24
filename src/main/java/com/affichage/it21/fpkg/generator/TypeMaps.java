package com.affichage.it21.fpkg.generator;

import java.util.HashMap;
import java.util.Map;

public class TypeMaps implements TypeMapping {

    private static Map<String, TypeMapping> TYPEMAPS = new HashMap<>(); 


    static {
        TYPEMAPS.put("NUMBER", new NumberMapping());
        TYPEMAPS.put("DATE", new DateMapping());
        TYPEMAPS.put("TABLE", new TableMapping());
        TYPEMAPS.put("PL/SQL BOOLEAN", new PlSqlBooleanMapping());
        TYPEMAPS.put("CLOB", new ClobMapping());
        TYPEMAPS.put("VARCHAR", new VarcharMapping());
        TYPEMAPS.put("VARCHAR2", new VarcharMapping());
        TYPEMAPS.put("BINARY_INTEGER", new BinaryIntegerMapping());

    }

    @Override
    public String ora2java(String propertyName, String jdbcType) {
       return TYPEMAPS.get(jdbcType).ora2java(propertyName, jdbcType); 
    }

    @Override
    public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
        return TYPEMAPS.get(jdbcType).ora2MyBatis(propertyName, null, jdbcType); 
    }

    static class NumberMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.

        @Override
        public String ora2java(String propertyName, String jdbcType) {
            if (propertyName != null && propertyName.endsWith("id")) return "Long"; 
            return "Integer"; 
        }
        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=NUMERIC";
        }
    }

    static class DateMapping implements TypeMapping {
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "java.sql.Timestamp"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=DATE";
        }
    }

    static class TableMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "java.util.List"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            if (parameterType != null && parameterType.equals("OUT")) return "jdbcType=ARRAY, jdbcTypeName=UTIL.NUMBER_L, typeHandler=com.apgsga.forms2java.persistence.mybatis.NumberLTypeHandler"; 
            return "jdbcType=ARRAY, typeHandler=com.apgsga.forms2java.persistence.mybatis.NumberLTypeHandler";
        }
    }

    static class PlSqlBooleanMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "boolean"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=BOOLEAN"; 
        }
    }

    static class ClobMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "String"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=CLOB, typeHandler=com.apgsga.forms2java.persistence.mybatis.ClobTypeHandler"; 
        }
    }

    static class VarcharMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "String"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=VARCHAR"; 
        }
    }

    static class BinaryIntegerMapping implements TypeMapping {

        // TODO (che, 24.7 ) : Verify, discuss and refine ora2Java Strategie.
        @Override
        public String ora2java(String propertyName, String jdbcType) {
           return "Integer"; 
        }

        @Override
        public String ora2MyBatis(String propertyName, String parameterType, String jdbcType) {
            return "jdbcType=INTEGER"; 
        }
    }

}
