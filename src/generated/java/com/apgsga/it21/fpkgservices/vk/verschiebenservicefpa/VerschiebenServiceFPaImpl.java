package com.apgsga.it21.fpkgservices.vk.verschiebenservicefpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VerschiebenServiceFPaImpl implements VerschiebenServiceFPa {

  private final DataAccessFacade dataAccessFacade;

  public VerschiebenServiceFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void saveAgpsFlaechenListe(Long inAgpsIdAlt, Long inAgpsIdNeu) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID_ALT", inAgpsIdAlt);
    parameters.put("IN_AGPS_ID_NEU", inAgpsIdNeu);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verschiebenservicefpa.save_agps_flaechen_liste",
        parameters);
  }
}
