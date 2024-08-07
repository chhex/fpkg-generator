package com.affichage.it21.fpkg.service.test;

import java.io.IOException;

import com.affichage.it21.fpkg.generator.DaoMetaInfoImplGenerator;
import com.affichage.it21.fpkg.generator.DaoMetaInfoSpringGenerator;
import com.affichage.it21.fpkg.generator.DummyMapperInterfaceGenerator;
import com.affichage.it21.fpkg.generator.JavaImplGenerator;
import com.affichage.it21.fpkg.generator.JavaInterfaceGenerator;
import com.affichage.it21.fpkg.generator.MyBatisServiceXMLGenerator;
import com.affichage.it21.fpkg.service.SchemaPkgServiceGenBuilder;

public class MyBatisFPkgServiceGenerator {

    public static void main(String[] args) throws IOException {
        new SchemaPkgServiceGenBuilder<StringBuffer>().modelVisitorClass(JavaInterfaceGenerator.class)
                .modelVisitorClass(MyBatisServiceXMLGenerator.class)
                .modelVisitorClass(JavaImplGenerator.class)
                .modelVisitorClass(DummyMapperInterfaceGenerator.class)
                .modelVisitorClass(DaoMetaInfoImplGenerator.class)
                .modelVisitorClass(DaoMetaInfoSpringGenerator.class)
                .daoExtractionFile("src/main/resources/dao_extraction.rdbms")
                .templatesRootDir("src/main/resources/st/")
                .targetRootDir("src/generated/")
                .buildAndRun("VK");

    }

}
