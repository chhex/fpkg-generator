package com.affichage.it21.fpkg.generator;

import java.io.File;

public interface NameSpaceFileOutputWriter {

    public void initRootNameSpaceDir( String rootTargetDir,String nameSpace);
    public void initSchemaNameSpaceDir(String schema); 
    public void writeOutputFile(String fileName, String dir,String output); 

}
