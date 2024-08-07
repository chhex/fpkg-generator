package com.affichage.it21.fpkg.service.main;

import java.io.IOException;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import com.affichage.it21.fpkg.generator.DaoMetaInfoImplGenerator;
import com.affichage.it21.fpkg.generator.DaoMetaInfoSpringGenerator;
import com.affichage.it21.fpkg.generator.DummyMapperInterfaceGenerator;
import com.affichage.it21.fpkg.generator.JavaImplGenerator;
import com.affichage.it21.fpkg.generator.JavaInterfaceGenerator;
import com.affichage.it21.fpkg.generator.MyBatisServiceXMLGenerator;
import com.affichage.it21.fpkg.service.SchemaPkgServiceGenBuilder;

public class MyBatisFPkgServiceGenerator {

    public static void main(String[] args) throws IOException, ParseException {
        var schemasOpts = new Option("s", "schemas", true, "Schemas selected for generation");
        schemasOpts.setArgs(Option.UNLIMITED_VALUES);
        var options = new Options();
        options.addOption(new Option("d", "daoExtractionFile", true, "DaoExtractionsfile Path"));
        options.addOption(new Option("t", "targetRootDir", true, "Directory Path to generate to"));
        options.addOption(schemasOpts);
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);
        new SchemaPkgServiceGenBuilder<StringBuffer>().modelVisitorClass(JavaInterfaceGenerator.class)
                .modelVisitorClass(MyBatisServiceXMLGenerator.class)
                .modelVisitorClass(JavaImplGenerator.class)
                .modelVisitorClass(DummyMapperInterfaceGenerator.class)
                .modelVisitorClass(DaoMetaInfoImplGenerator.class)
                .modelVisitorClass(DaoMetaInfoSpringGenerator.class)
                .daoExtractionFile(cmd.getOptionValue("d", "src/main/resources/dao_extraction.rdbms"))
                .templatesRootDir("src/main/resources/st/")
                .targetRootDir(cmd.getOptionValue("t", "src/generated"))
                .buildAndRun(cmd.getOptionValues("s") == null ? new String[] {"VK"} : cmd.getOptionValues("s"));

    }

}
