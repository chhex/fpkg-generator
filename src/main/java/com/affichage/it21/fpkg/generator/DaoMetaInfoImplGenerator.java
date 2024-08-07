package com.affichage.it21.fpkg.generator;

import org.apache.commons.io.FilenameUtils;
import org.stringtemplate.v4.STGroupDir;

import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;
import com.affichage.it21.fpkg.model.SchemaBasedVisitor;
import com.apgsga.forms2java.persistence.util.NameConversion;
import com.palantir.javaformat.java.Formatter;
import com.palantir.javaformat.java.FormatterException;

public class DaoMetaInfoImplGenerator implements SchemaBasedVisitor<StringBuffer> {

    private final STGroupDir groupDir;
    private final StringBuffer outputBuffer = new StringBuffer();
    private final String nameSpace;
    private String schema;
    private final NameSpaceFileOutputWriter outputWriter = new DefaultNameSpaceFileWriter(false);
    Formatter formatter = Formatter.create();

    public DaoMetaInfoImplGenerator(String nameSpace, String templatesRootDir) {
        this.groupDir = new STGroupDir(FilenameUtils.concat(templatesRootDir, "java/meta"));
        this.nameSpace = nameSpace;
    }

    public void generateFor(Pkg pkg, String schema) {
        outputBuffer.setLength(0);
        this.schema = schema;
        pkg.accept(this);
    }

    @Override
    public void visit(Pkg pkg) {
        var st = groupDir.getInstanceOf("daometainfo");
        st.add("packageName", String.format("%s.%s.%s", nameSpace, schema.toLowerCase(), NameConversion.toJavaName(pkg.getName()).toLowerCase()));
        outputBuffer.append(st.render(60));
    }

    @Override
    public void postvisit(Pkg pkg) {
        try {
            writeOutputFile( "DaoMetaInfoImpl.java", NameConversion.toJavaName(pkg.getName()).toLowerCase(), 
                    formatter.formatSource(outputBuffer.toString()));
                } catch (FormatterException e) {
            throw new RuntimeException(e);
        }
    

    }

    @Override
    public void visit(Proc proc) {
      // Nothing to do 

    }

    @Override
    public void postvisit(Proc proc) {
        // Nothing to do 

    }

    @Override
    public void visit(Parameter parm) {
           // Nothing to do 
    }

    public StringBuffer getResult() {
        return outputBuffer;
    }

    @Override
    public void initRootNameSpaceDir(String rootTargetDir, String nameSpace) {
        outputWriter.initRootNameSpaceDir(FilenameUtils.concat(rootTargetDir, "java"), nameSpace);
    }

    @Override
    public void initSchemaNameSpaceDir(String schema) {
        outputWriter.initSchemaNameSpaceDir(schema);
    }

    @Override
    public void writeOutputFile(String fileName, String output) {
        outputWriter.writeOutputFile(fileName, output);
    }

    @Override
    public void writeOutputFile(String fileName, String dir, String output) {
        outputWriter.writeOutputFile(fileName,dir,output); 
    }

}
