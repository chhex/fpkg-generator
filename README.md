# fpkg-generator

Explorative Prototype for a F-Package Generator according to the document "Path towards a Service Architecture"

Goal:

Explore the feasiblily of a F-Package Service Generator

Process:

* Explore if https://github.com/antlr/grammars-v4/tree/master/sql/plsql is feasible for parsing F-Package Specs.
* Identify a suitable F-Package and Function from Verkauf and download the package Spec.
* Run the Pl/Sql Parser as stub against this package locally.
* Identify and Implement a potential Target Source
* Issues, Open Questions, Findings and Suggested next steps

## Antlr4 Pl/Sql Grammar and Parser

see Files:

* [Antlr Pl/SQL Lexer Grammar](./src/main/antlr4/plsql/PlSqlLexer.g4)
* [Antlr Pl/SQL Parser Grammar](./src/main/antlr4/plsql/PlSqlParser.g4)

Build: see Maven [pom.xml](./pom.xml) Plugin :`antlr4-maven-plugin`

`./mvnw clean package`

for example, generates the Antlr4 based Parser Code befor the invocation of the Java Compiler into [target/generated-sources](./target/generated-sources) which is automatically included in the source path

## Antlr4 Visitor

see [EchoVisitor](./src/main/com/apgsga/service/fspec/parser/EchoVisitor.java)

which is based on the generated

visits the Package Spec [vertrags-service-f.sql](./src/main/resources/vertrags-service-f.sql)

and prints out the visited Parsed nodes.

Open Questions:

[ ] 1. Do we use this Antlr based Parser for retrieving the necessary Metadata or do we use the existing [dao_extraction.rdbms ](./src/main/resources/dao_extraction.rdbms)Metadata of the Dao Generator?

Each has it's advantages. The path of least effort is use the existing Metadata

## Target Code TBD for a F-Package Service Generator

The Java Interface for the F-Package Package Spec [vertrags-service-f.sql](./src/main/resources/vertrags-service-f.sql) is : [VkVertragsServiceF](./src/main/java/com/affichage/it21/vk/zentraldispo/dao/Services/VkVertragsServiceF.java)

It's [Implemenation VkVertragsServiceFMyBImpl](./src/main/java/com/affichage/it21/vk/zentraldispo/dao/Services/VkVertragsServiceFMyBImpl.java) is MyBatis based and uses the DataAccessFacade API used today and references the[ MyBatis Mapper XML ](./src/main/java/com/affichage/it21/vk/zentraldispo/dao/Services/vk_vertrags_service_f.xml) as customs allready.

But all Files are Generated for the F-Package Services

The Service Implemenations are Instanciated and injected with the DataAccessFacade of the Context via a ServiceProvider Interface.

Open Questions:

[ ] Oracle / Jdbc / Java Type Mapping. This cannot been done conclusively respectively unambigously unfortunaltely, because frequently an Oracle Type like NUMBER has many possible Java Conversions depending on the usage context.  Here i would suggest: Strong reasonable conventions and defaults. When the Java Type cannot be deduced the Fallback is Object. An additional approach would to have a minimal Spec for the Generator.
[ ] Optional Parameters in PL/SQL : Here i would strongly suggest , that the F-Package (Interfaces) are "Java" friendly dot. Also i would suggest that the Interfaces should be semantically clear , not like

`   public void kuendenVertragOderAgps(Long kvlfIdIn, Long agpsId, Date kuendigungsdatum, Date vertragsEnde, Long angrId, Long ersatzFlOid, Long kuendigungstyp);`

[ ] Namespace of the F-Package: I would suggest here also a reasonable convention: VK = "com.apgsga.vk" for example.

## Next Steps

1. Discuss Results / Issues
2. Write a Generator based on [dao_extraction.rdbms](./src/main/resources/dao_extraction.rdbms) based on Verkaufs Dao
3. Write Test Cases (DGU, RBL)

