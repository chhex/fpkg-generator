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

public class JavaInterfaceGenerator implements SchemaBasedVisitor<StringBuffer> {

    private static final TypeMaps TYPE_MAPS = new TypeMaps();
    private final STGroupDir groupDir;
    private final StringBuffer outputBuffer = new StringBuffer();
    private final String nameSpace;
    private String schema;
    private final NameSpaceFileOutputWriter outputWriter = new DefaultNameSpaceFileWriter(true);
    Formatter formatter = Formatter.create();
    private boolean firstParam = true;

    public JavaInterfaceGenerator(String nameSpace, String templatesRootDir) {
        this.groupDir = new STGroupDir(FilenameUtils.concat(templatesRootDir, "java/interface"));
        this.nameSpace = nameSpace;
    }

    public void generateFor(Pkg pkg, String schema) {
        outputBuffer.setLength(0);
        this.schema = schema;
        pkg.accept(this);
    }

    @Override
    public void visit(Pkg pkg) {
        var st = groupDir.getInstanceOf("interface");
        st.add("packageName", String.format("%s.%s.%s", nameSpace, schema.toLowerCase(), NameConversion.toJavaName(pkg.getName()).toLowerCase()));
        st.add("className", String.format("%s", NameConversion.toJavaNameFirstUpper(pkg.getName())));
        outputBuffer.append(st.render(60));
    }

    @Override
    public void postvisit(Pkg pkg) {
        var st = groupDir.getInstanceOf("interfaceFooter");
        outputBuffer.append("\n");
        outputBuffer.append(st.render(60));
        try {
            writeOutputFile(String.format("%s.java", NameConversion.toJavaNameFirstUpper(pkg.getName())), NameConversion.toJavaName(pkg.getName()).toLowerCase(), 
                    formatter.formatSource(outputBuffer.toString()));
                } catch (FormatterException e) {
            throw new RuntimeException(e);
        }
            // writeOutputFile(String.format("%s.java", NameConversion.toJavaNameFirstUpper(pkg.getName())),
            //       outputBuffer.toString());
    

    }

    @Override
    public void visit(Proc proc) {
        var st = groupDir.getInstanceOf("method");
        st.add("methodName", NameConversion.toJavaName(proc.getName()).replaceAll("#", ""));
        st.add("returnType", String.format("%s", proc.getReturnType() == null ? "void" : TYPE_MAPS.ora2java(null, proc.getReturnType())));
        outputBuffer.append(st.render(60));
        firstParam = true; 

    }

    @Override
    public void postvisit(Proc proc) {
        var st = groupDir.getInstanceOf("methodFooter");
        outputBuffer.append(st.render(60));
    }

    @Override
    public void visit(Parameter parm) {
        var st = groupDir.getInstanceOf("methodParm");
        st.add("type", TYPE_MAPS.ora2java(parm.getName(), parm.getType()));
        st.add("parmName", NameConversion.toJavaName(parm.getName()));
        if (firstParam) {
            firstParam = false; 
            st.add("komma", "");
        } else {
            st.add("komma", ",");
        }
        outputBuffer.append(st.render(60));
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
