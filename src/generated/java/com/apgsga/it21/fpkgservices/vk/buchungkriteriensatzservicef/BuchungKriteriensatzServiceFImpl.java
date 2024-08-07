package com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class BuchungKriteriensatzServiceFImpl implements BuchungKriteriensatzServiceF {

  private final DataAccessFacade dataAccessFacade;

  public BuchungKriteriensatzServiceFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void checkedFreigeben(Long inAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.checked_freigeben",
        parameters);
  }

  @Override
  public void checkedReservieren(
      Long inAgpsId, Integer inStatus, Integer outAngeforderte, Integer outDurchgefuehrte) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_STATUS", inStatus);
    parameters.put("OUT_ANGEFORDERTE", outAngeforderte);
    parameters.put("OUT_DURCHGEFUEHRTE", outDurchgefuehrte);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.checked_reservieren",
        parameters);
  }

  @Override
  public void dobeFreigeben(Long inAgpsId, Long inFlOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_FL_OID", inFlOid);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.dobe_freigeben", parameters);
  }

  @Override
  public void ermittelnVerfuegbareFlaechen(
      Long inKrsId, Long inAgpsId, Integer inModus, Long inAnfrId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KRS_ID", inKrsId);
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_MODUS", inModus);
    parameters.put("IN_ANFR_ID", inAnfrId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.ermitteln_verfuegbare_flaechen",
        parameters);
  }

  @Override
  public void exitInstance() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.exit_instance", parameters);
  }

  @Override
  public void reserviereEflJf(Long inAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef.reserviere_efl_jf",
        parameters);
  }
}
