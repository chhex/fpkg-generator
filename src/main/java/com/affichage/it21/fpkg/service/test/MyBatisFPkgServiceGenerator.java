package com.affichage.it21.fpkg.service.test;

import java.io.IOException;

import com.affichage.it21.fpkg.generator.MyBatisServiceXMLGenerator;
import com.affichage.it21.fpkg.service.SchemaPkgServiceGenBuilder;

public class MyBatisFPkgServiceGenerator {

    public static void main(String[] args) throws IOException {
        new SchemaPkgServiceGenBuilder<StringBuffer>().modelVisitorClass(MyBatisServiceXMLGenerator.class)
                .daoExtractionFile("src/main/resources/dao_extraction.rdbms")
                .templatesDir("src/main/resources/st/mybatis")
                .targetRootDir("src/generated/resources")
                .buildAndRun("VK");

    }

}
