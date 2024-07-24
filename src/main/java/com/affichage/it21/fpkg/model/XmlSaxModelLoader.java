package com.affichage.it21.fpkg.model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XmlSaxModelLoader implements ModelLoader {


    @Override
    public List<Pkg> loadFromFileForSchemas(File daoExtraction,List<String> schemas) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser;
        try {
            saxParser = saxParserFactory.newSAXParser();
        } catch (ParserConfigurationException | SAXException e) {
            throw new RuntimeException(e);
        }
        ModelLoaderSax handler = new ModelLoaderSax(schemas);
        try {
            saxParser.parse(daoExtraction, handler);
            return handler.getResult(); 
        } catch (SAXException | IOException e) {
            throw new RuntimeException(e);
        }
    }



}
