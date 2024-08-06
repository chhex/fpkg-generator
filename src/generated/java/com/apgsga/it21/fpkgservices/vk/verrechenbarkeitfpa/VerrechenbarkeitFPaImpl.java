package com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VerrechenbarkeitFPaImpl implements VerrechenbarkeitFPa {

  private final DataAccessFacade dataAccessFacade;

  public VerrechenbarkeitFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void agpsFlzoLeistVerrechnen(Long aflstIdIn, Integer verrechnungIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AFLST_ID_IN", aflstIdIn);
    parameters.put("VERRECHNUNG_IN", verrechnungIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa.agps_flzo_leist_verrechnen",
        parameters);
  }

  @Override
  public void agpsLeistVerrechnen(Long agpslstIdIn, Integer verrechnungIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPSLST_ID_IN", agpslstIdIn);
    parameters.put("VERRECHNUNG_IN", verrechnungIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa.agps_leist_verrechnen", parameters);
  }

  @Override
  public void diskrepanzVisieren(Long aflstIdIn, String begruendungIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AFLST_ID_IN", aflstIdIn);
    parameters.put("BEGRUENDUNG_IN", begruendungIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa.diskrepanz_visieren", parameters);
  }

  @Override
  public void initialesFeedbackSetzen(Long aflstIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AFLST_ID_IN", aflstIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa.initiales_feedback_setzen",
        parameters);
  }

  @Override
  public void visumZuruecksetzen(Long aflstIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AFLST_ID_IN", aflstIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa.visum_zuruecksetzen", parameters);
  }
}
