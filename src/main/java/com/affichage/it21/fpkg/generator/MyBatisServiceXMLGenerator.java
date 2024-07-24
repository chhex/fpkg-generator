package com.affichage.it21.fpkg.generator;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.FileSystemUtils;
import org.stringtemplate.v4.STGroupDir;

import com.affichage.it21.fpkg.model.ModelVisitor;
import com.affichage.it21.fpkg.model.Parameter;
import com.affichage.it21.fpkg.model.Pkg;
import com.affichage.it21.fpkg.model.Proc;
import com.apgsga.forms2java.persistence.util.NameConversion;

public class MyBatisServiceXMLGenerator implements ModelVisitor {

    private static final TypeMaps TYPE_MAPS = new TypeMaps(); 

    private final STGroupDir groupDir;
    private final StringBuffer outputBuffer = new StringBuffer();
    private final String schema;
    private final String nameSpace; 
    private Pkg lastPackage; 
    private RenderService lastService;
    private RenderParameter lastParameter; 

    public MyBatisServiceXMLGenerator(String nameSpace, String templatePath, String schema) {
        this.groupDir = new STGroupDir(templatePath);
        this.nameSpace = nameSpace; 
        this.schema = schema;
    }

    public void init() {
        outputBuffer.setLength(0); 
    }

    @Override
    public void visit(Pkg pkg) {
        lastPackage = pkg; 
        var st = groupDir.getInstanceOf("header");
        st.add("name", String.format("5s.%s.%s", nameSpace, schema.toLowerCase(), NameConversion.toJavaName(pkg.getName()).toLowerCase()));
        outputBuffer.append(st.render(60)); 
    }

    @Override
    public void postvisit(Pkg pkg) {
        var st = groupDir.getInstanceOf("footer");
        outputBuffer.append("\n"); 
        outputBuffer.append(st.render(60)); 
    }

    @Override
    public void visit(Proc proc) {
        lastService = new RenderService();
        lastService.setSchema(schema.toLowerCase());
        lastService.setPackageName(lastPackage.getName().toLowerCase());
        lastService.setProcedureName(proc.getName().toLowerCase());
        lastService.setResultType(proc.getReturnType());

    }

    @Override
    public void postvisit(Proc proc) {
        lastParameter.setKomma("");
        if (proc.getType().equals("rdbms:Procedure")) {
            var st = groupDir.getInstanceOf("proc");
            st.add("proc", lastService); 
            outputBuffer.append("\n"); 
            outputBuffer.append(st.render(60)); 
        } else if (proc.getType().equals("rdbms:Function")) {
            var st = groupDir.getInstanceOf("func");
            st.add("func", lastService); 
            outputBuffer.append("\n"); 
            outputBuffer.append(st.render(60)); 
        }
    }


    @Override
    public void visit(Parameter parm) {
        lastParameter = new RenderParameter(); 
        lastParameter.setName(parm.getName().toLowerCase());
        lastParameter.setMapKey(parm.getName().toUpperCase());
        lastParameter.setMode(parm.getParameterType() == null ? "IN" : parm.getParameterType());
        lastParameter.setTypeHandler(TYPE_MAPS.ora2MyBatis(parm.getName(), schema, parm.getType()));
        lastService.add(lastParameter);
    }

    public StringBuffer getOutputBuffer() {
        return outputBuffer;
    }

   
    class RenderService {
        private String schema; 
        private String packageName;
        private String procedureName; 
        private String resultType;
        private List<RenderParameter> parameter = new ArrayList<>(); 

        public void add(RenderParameter parm) {
            parameter.add(parm); 
        }
        
        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }

        public String getPackageName() {
            return packageName;
        }
        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }
        public String getProcedureName() {
            return procedureName;
        }
        public void setProcedureName(String procedureName) {
            this.procedureName = procedureName;
        }
        public String getResultType() {
            return resultType;
        }
        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        public List<RenderParameter> getParameter() {
            return parameter;
        }

    }

    class RenderParameter {
        private String name; 
        private String mapKey;
        private String mode;
        private String typeHandler;
        private String komma = ","; 
       
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getMapKey() {
            return mapKey;
        }
        public void setMapKey(String mapKey) {
            this.mapKey = mapKey;
        }
        public String getMode() {
            return mode;
        }
        public void setMode(String mode) {
            this.mode = mode;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        public void setTypeHandler(String typeHandler) {
            this.typeHandler = typeHandler;
        }
        public String getKomma() {
            return komma;
        }
        public void setKomma(String komma) {
            this.komma = komma;
        } 
        
    }

}
