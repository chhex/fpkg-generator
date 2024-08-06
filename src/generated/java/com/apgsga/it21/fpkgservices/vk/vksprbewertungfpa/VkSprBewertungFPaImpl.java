package com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VkSprBewertungFPaImpl implements VkSprBewertungFPa {

  private final DataAccessFacade dataAccessFacade;

  public VkSprBewertungFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void clearGebiete() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa.clear_gebiete", parameters);
  }

  @Override
  public void clearParameter() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa.clear_parameter", parameters);
  }

  @Override
  public Integer createKdvtSprBewertung(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa.create_kdvt_spr_bewertung", parameters);
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
        "com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa.get_total_eff_bew", parameters);
  }

  @Override
  public void sprBewertungAusfuehrenJui(Long inKsbId, Integer inPpiBewertung) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KSB_ID", inKsbId);
    parameters.put("IN_PPI_BEWERTUNG", inPpiBewertung);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa.spr_bewertung_ausfuehren_jui",
        parameters);
  }
}
