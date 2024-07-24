package com.affichage.it21.fpkg.generator;


public interface TypeMapping {

    String ora2java(String propertyName, String jdbcType); 
    String ora2MyBatis(String propertyName, String parameterType, String jdbcType); 

}
