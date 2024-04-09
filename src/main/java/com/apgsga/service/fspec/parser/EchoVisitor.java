package com.apgsga.service.fspec.parser;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import plsql.PlSqlLexer;
import plsql.PlSqlParser;
import plsql.PlSqlParser.Function_specContext;
import plsql.PlSqlParser.Package_nameContext;
import plsql.PlSqlParser.ParameterContext;
import plsql.PlSqlParser.Procedure_specContext;
import plsql.PlSqlParserBaseVisitor;

@SuppressWarnings("rawtypes")
public class EchoVisitor extends PlSqlParserBaseVisitor {

    @Override
    public Object visitPackage_name(Package_nameContext ctx) {
        System.out.println(String.format("Package Name: %s", ctx.getText()));
        return super.visitPackage_name(ctx);
    }

    @Override
    public Object visitFunction_spec(Function_specContext ctx) {
        System.out.println(String.format("Function Context : %s",ctx.identifier().getText()));
        System.out.println(String.format("Function Returns : %s",  ctx.RETURN().getText()));
        System.out.println(String.format("Function Returns : %s",  ctx.type_spec().getText()));
        parameter(ctx.parameter());
        return super.visitFunction_spec(ctx);
    }

    private void parameter(List<ParameterContext> parameters) {
        parameters.forEach(parm -> { 
            System.out.println(String.format("Parameter Name: %s",parm.parameter_name().getText())); 
            System.out.println(String.format("Parameter Type: %s",parm.type_spec().getText())); 
            terminalNodes(parm.IN()); 
            terminalNodes(parm.OUT()); 
            terminalNodes(parm.INOUT()); 
            terminalNodes(parm.NOCOPY()); 
        });
    }

    
    private void terminalNodes(List<TerminalNode> parameters) {
        parameters.forEach(node -> { 
            System.out.println(String.format("Terminal Symbol: %s",node.getSymbol().getText())); 
        });
    }


    @Override
    public Object visitProcedure_spec(Procedure_specContext ctx) {
        System.out.println(String.format("Procedure Context : %s",ctx.identifier().getText()));
        parameter(ctx.parameter());
        return super.visitProcedure_spec(ctx);
    }

    public static void main(String[] args) throws IOException {

        PlSqlLexer lexer = new PlSqlLexer(
                CharStreams.fromFileName("src/main/resources/vertrags-service-f.sql", Charset.forName("UTF-8")));
        PlSqlParser parser = new PlSqlParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.create_package();
        EchoVisitor visitor = new EchoVisitor();
        visitor.visit(tree);
    }

}
