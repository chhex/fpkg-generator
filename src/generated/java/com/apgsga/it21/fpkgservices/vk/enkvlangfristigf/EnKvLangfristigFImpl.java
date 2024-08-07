package com.apgsga.it21.fpkgservices.vk.enkvlangfristigf;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class EnKvLangfristigFImpl implements EnKvLangfristigF {

  private final DataAccessFacade dataAccessFacade;

  public EnKvLangfristigFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public String getVertragNrSequenzFrei() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.enkvlangfristigf.get_vertrag_nr_sequenz_frei", parameters);
    return (String) returnParameterMap.get("RESULT");
  }
}
