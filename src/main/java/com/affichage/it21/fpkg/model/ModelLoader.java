package com.affichage.it21.fpkg.model;

import java.io.File;
import java.util.List;

public interface ModelLoader {

    public List<Pkg> loadFromFileForSchemas(File daoExtraction,List<String> schemas);


}
