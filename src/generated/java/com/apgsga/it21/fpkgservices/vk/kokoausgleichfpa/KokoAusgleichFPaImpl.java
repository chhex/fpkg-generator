package com.apgsga.it21.fpkgservices.vk.kokoausgleichfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class KokoAusgleichFPaImpl implements KokoAusgleichFPa {

  private final DataAccessFacade dataAccessFacade;

  public KokoAusgleichFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void kokoAusgleichen(Long pKokoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KOKO_ID", pKokoId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokoausgleichfpa.koko_ausgleichen", parameters);
  }
}
