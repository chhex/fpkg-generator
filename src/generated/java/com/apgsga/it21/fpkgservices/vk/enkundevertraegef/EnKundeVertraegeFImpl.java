package com.apgsga.it21.fpkgservices.vk.enkundevertraegef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class EnKundeVertraegeFImpl implements EnKundeVertraegeF {

  private final DataAccessFacade dataAccessFacade;

  public EnKundeVertraegeFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void setAdresslisteZuErstellen(Long pKdvtIdIn, Integer pStatusIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID_IN", pKdvtIdIn);
    parameters.put("P_STATUS_IN", pStatusIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.enkundevertraegef.set_adressliste_zu_erstellen",
        parameters);
  }
}
