package com.affichage.test.st;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupDir;
import org.stringtemplate.v4.STGroupFile;

public class TestStringTemplate4 {

    public static void main(String[] args) {
        var group = new STGroupDir("src/main/resources/st/test");
        var st = group.getInstanceOf("decl");
        st.add("type", "int");
        st.add("name", "x");
        st.add("value", 0);
        var result = st.render();
        System.out.println(result);
        var grpf = new STGroupFile("src/main/resources/st/test/test.stg");
        st = grpf.getInstanceOf("decl");
        st.add("type", "int");
        st.add("name", "x");
        st.add("value", 0);
        result = st.render();
        System.out.println(result);
   

    }

}
