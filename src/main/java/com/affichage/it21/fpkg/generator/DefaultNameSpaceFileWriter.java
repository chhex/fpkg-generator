package com.affichage.it21.fpkg.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;

public class DefaultNameSpaceFileWriter implements NameSpaceFileOutputWriter {

    private File rootNsPath;
    private File nameSpaceDir;

    @Override
    public void initRootNameSpaceDir(String rootTargetDir,String nameSpace) {
        rootNsPath = new File(FilenameUtils.concat(rootTargetDir, nameSpace.replace(".", File.separator)));
        rootNsPath.mkdirs();
    }

    @Override
    public void initSchemaNameSpaceDir(String schema) {
        try {
            nameSpaceDir = new File(FilenameUtils.concat(rootNsPath.getCanonicalPath(), schema.toLowerCase()));
            nameSpaceDir.mkdirs();
            FileUtils.cleanDirectory(nameSpaceDir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeOutputFile(String fileName,  String output) {
        try {
            File outputFile = new File(nameSpaceDir, fileName);
            var outputStream = new FileOutputStream(outputFile);
            IOUtils.write(output, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void writeOutputFile(String fileName, String dir,  String output) {
        try {
            var pkgDir = new File(nameSpaceDir,dir);
            pkgDir.mkdir();
            File outputFile = new File(pkgDir, fileName);
            var outputStream = new FileOutputStream(outputFile);
            IOUtils.write(output, outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    
}
