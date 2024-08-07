package com.apgsga.it21.fpkgservices.vk.fobservicef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class FobServiceFImpl implements FobServiceF {

  private final DataAccessFacade dataAccessFacade;

  public FobServiceFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void clearkrs(Long inKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KRS_ID", inKrsId);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.fobservicef.clearkrs", parameters);
  }

  @Override
  public void entfernen(Integer inFlzoOpt) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FLZO_OPT", inFlzoOpt);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.fobservicef.entfernen", parameters);
  }

  @Override
  public Integer flBrancheVertraegelich(
      Long inFlOid,
      Long inBrcIdL,
      java.sql.Timestamp inAushangVon,
      Integer inAushangDauer,
      Long inSubjOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FL_OID", inFlOid);
    parameters.put("IN_BRC_ID_L", inBrcIdL);
    parameters.put("IN_AUSHANG_VON", inAushangVon);
    parameters.put("IN_AUSHANG_DAUER", inAushangDauer);
    parameters.put("IN_SUBJ_OID", inSubjOid);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fobservicef.fl_branche_vertraegelich", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void getPreise(
      Long inFlOid,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      Integer outMedienleistung,
      Integer outProduktion,
      Integer outMontage,
      Integer outGebuehren) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FL_OID", inFlOid);
    parameters.put("IN_AUSHANG_BEGINN", inAushangBeginn);
    parameters.put("IN_AUSHANG_DAUER", inAushangDauer);
    parameters.put("OUT_MEDIENLEISTUNG", outMedienleistung);
    parameters.put("OUT_PRODUKTION", outProduktion);
    parameters.put("OUT_MONTAGE", outMontage);
    parameters.put("OUT_GEBUEHREN", outGebuehren);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.fobservicef.get_preise", parameters);
  }

  @Override
  public void optionZumEinloesen(Long inAgpsFlZoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_FL_ZO_ID", inAgpsFlZoId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fobservicef.option_zum_einloesen", parameters);
  }

  @Override
  public void reservieren(
      Long inAtgebId,
      Long inAgenturSubjOid,
      Long inKrsId,
      Long inKdvtId,
      Long inAgId,
      Integer inAgpsArt) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_ATGEB_ID", inAtgebId);
    parameters.put("IN_AGENTUR_SUBJ_OID", inAgenturSubjOid);
    parameters.put("IN_KRS_ID", inKrsId);
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_AGPS_ART", inAgpsArt);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.fobservicef.reservieren", parameters);
  }

  @Override
  public Integer setDisplayPar(
      Long inFlOid,
      java.sql.Timestamp inAushangVon,
      java.sql.Timestamp inAushangBis,
      Integer inInterval) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FL_OID", inFlOid);
    parameters.put("IN_AUSHANG_VON", inAushangVon);
    parameters.put("IN_AUSHANG_BIS", inAushangBis);
    parameters.put("IN_INTERVAL", inInterval);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fobservicef.set_display_par", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
