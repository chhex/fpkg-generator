package com.apgsga.it21.fpkgservices.vk.sprbewertungfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class SprBewertungFPaImpl implements SprBewertungFPa {

  private final DataAccessFacade dataAccessFacade;

  public SprBewertungFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void addGebiet(Long inGbotOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_GBOT_OID", inGbotOid);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.add_gebiet", parameters);
  }

  @Override
  public Integer checkKpEndMitWelbeg(java.util.List kdvtIdids, java.sql.Timestamp wellenbeginn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_IDIDS", kdvtIdids);
    parameters.put("WELLENBEGINN", wellenbeginn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.check_kp_end_mit_welbeg", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void clearGebiete() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.clear_gebiete", parameters);
  }

  @Override
  public void clearParameter() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.clear_parameter", parameters);
  }

  @Override
  public Integer createKdvtSprBewertung(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.create_kdvt_spr_bewertung", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer createKrsSprBewertung(Long inKdvtId, Long inKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_KRS_ID", inKrsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.create_krs_spr_bewertung", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void getTotalEffBew(
      Long inNchrtId,
      Integer outAnzGebFl,
      Integer outAnzBewFl,
      Integer outRwe,
      Integer outOts,
      Integer outSumPkITsd,
      Integer outgrp,
      Integer inKontaktklasse) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_NCHRT_ID", inNchrtId);
    parameters.put("OUT_ANZ_GEB_FL", outAnzGebFl);
    parameters.put("OUT_ANZ_BEW_FL", outAnzBewFl);
    parameters.put("OUT_RWE", outRwe);
    parameters.put("OUT_OTS", outOts);
    parameters.put("OUT_SUM_PK_I_TSD", outSumPkITsd);
    parameters.put("OUTGRP", outgrp);
    parameters.put("IN_KONTAKTKLASSE", inKontaktklasse);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.get_total_eff_bew", parameters);
  }

  @Override
  public void sprBewertungAnPpi(Long inKsbId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KSB_ID", inKsbId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.spr_bewertung_an_ppi", parameters);
  }

  @Override
  public void sprBewertungAusfuehrenJui(Long inKsbId, Integer inPpiBewertung) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KSB_ID", inKsbId);
    parameters.put("IN_PPI_BEWERTUNG", inPpiBewertung);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.spr_bewertung_ausfuehren_jui", parameters);
  }

  @Override
  public void sprBewertungReset(Long outKsbId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("OUT_KSB_ID", outKsbId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.spr_bewertung_reset", parameters);
  }

  @Override
  public void sprPpiBewertungAusfuehren(Long inPpiKpId, Integer inKontaktklassen) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_PPI_KP_ID", inPpiKpId);
    parameters.put("IN_KONTAKTKLASSEN", inKontaktklassen);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.sprbewertungfpa.spr_ppi_bewertung_ausfuehren", parameters);
  }
}
