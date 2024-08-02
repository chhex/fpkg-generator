package com.affichage.it21.fpkg.service.test;

import java.io.IOException;

import com.affichage.it21.fpkg.generator.JavaInterfaceGenerator;
import com.affichage.it21.fpkg.generator.MyBatisServiceXMLGenerator;
import com.affichage.it21.fpkg.service.SchemaPkgServiceGenBuilder;

public class MyBatisFPkgServiceGenerator {

    public static void main(String[] args) throws IOException {
        new SchemaPkgServiceGenBuilder<StringBuffer>().modelVisitorClass(JavaInterfaceGenerator.class)
                .modelVisitorClass(MyBatisServiceXMLGenerator.class)
                .daoExtractionFile("src/main/resources/dao_extraction.rdbms")
                .templatesRootDir("src/main/resources/st/")
                .targetRootDir("src/generated/")
                .buildAndRun("VK");

    }

}
