package com.affichage.it21.fpkg.generator;


public interface NameSpaceFileOutputWriter {

    public void initRootNameSpaceDir( String rootTargetDir,String nameSpace);
    public void initSchemaNameSpaceDir(String schema); 
    public void writeOutputFile(String fileName, String dir,String output); 
    public void writeOutputFile(String fileName,  String output); 

}
