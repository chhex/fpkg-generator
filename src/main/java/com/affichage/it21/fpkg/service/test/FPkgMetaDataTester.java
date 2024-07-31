package com.affichage.it21.fpkg.service.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.affichage.it21.fpkg.generator.TypesUsedVisitor;
import com.affichage.it21.fpkg.service.DefaultServiceGenBuilder;

public class FPkgMetaDataTester {

    public static void main(String[] args) throws IOException {
        var result = new DefaultServiceGenBuilder<Map<String, List<String>>>().modelVisitorClass(TypesUsedVisitor.class)
                .daoExtractionFile("src/main/resources/dao_extraction.rdbms").buildAndRun("VK");
        var types = result.keySet();
        for (String type : types) {
            System.out.println(String.format("*Type: %s used in:", type));
            for (String usage : result.get(type)) {
                System.out.println(String.format("  %s", usage));
            }

        }
    }

}
