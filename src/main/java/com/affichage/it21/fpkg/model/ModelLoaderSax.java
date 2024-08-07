package com.affichage.it21.fpkg.model;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class ModelLoaderSax extends DefaultHandler {

    private boolean f_pkg = false;

    private Pkg currentPkg = null;

    private Proc currentFProcedure = null;

    private final List<String> schemas;

    private final List<Pkg> fpkgs = new ArrayList<Pkg>();

    public ModelLoaderSax(List<String> schemas) {
        this.schemas = schemas;
    }

    public List<Pkg> getResult() {
        return fpkgs;
    }

    @Override
    public void startElement(
            String uri,
            String localName,
            String qName,
            Attributes attributes) {

        if (qName.equalsIgnoreCase("packages")) {
            String name = attributes.getValue("name");
            String dbSchema = attributes.getValue("dbSchema");
            if (name.endsWith("_F") && schemas.contains(dbSchema)) {
                f_pkg = true;
                currentPkg = new Pkg(name, dbSchema);

            }
        } else if (qName.equalsIgnoreCase("procedures")) {
            if (f_pkg) {
                String name = attributes.getValue("name");
                String type = attributes.getValue("xsi:type");
                String returnType = attributes.getValue("returnType");
                currentFProcedure = new Proc(name, type, returnType);
            }

        } else if (qName.equalsIgnoreCase("parameters")) {
            if (f_pkg) {
                String name = attributes.getValue("name");
                String type = attributes.getValue("type");
                String parameterType = attributes.getValue("paramterType");
                // TODO (CHE, 7.8) : We don't know how to Map , ignored , used by Verkauf
                if (type != null && type.equals("PL/SQL RECORD")) return; 
                currentFProcedure.add(new Parameter(name, type, parameterType));
            }
        }
    }

    @Override
    public void endElement(String uri,
            String localName,
            String qName) {

        if (qName.equalsIgnoreCase("packages")) {
            if (f_pkg) {
                f_pkg = false;
                fpkgs.add(currentPkg);
            }
        } else if (qName.equalsIgnoreCase("procedures")) {

            if (f_pkg) {
                currentFProcedure.setPkg(currentPkg);
                currentPkg.add(currentFProcedure);
            }

        }

    }

}