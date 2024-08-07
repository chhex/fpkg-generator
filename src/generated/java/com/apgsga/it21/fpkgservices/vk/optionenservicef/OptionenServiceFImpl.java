package com.apgsga.it21.fpkgservices.vk.optionenservicef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class OptionenServiceFImpl implements OptionenServiceF {

  private final DataAccessFacade dataAccessFacade;

  public OptionenServiceFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void agpsAnnehmenEinloesbareOpt(Long agpsIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.optionenservicef.agps_annehmen_einloesbare_opt",
        parameters);
  }

  @Override
  public void agpsVerwerfenEinloesbareOpt(Long agpsIdIn, Integer optionBehaltenIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("OPTION_BEHALTEN_IN", optionBehaltenIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.optionenservicef.agps_verwerfen_einloesbare_opt",
        parameters);
  }
}
