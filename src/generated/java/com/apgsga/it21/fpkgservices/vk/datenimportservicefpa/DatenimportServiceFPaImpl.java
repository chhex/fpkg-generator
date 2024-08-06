package com.apgsga.it21.fpkgservices.vk.datenimportservicefpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class DatenimportServiceFPaImpl implements DatenimportServiceFPa {

  private final DataAccessFacade dataAccessFacade;

  public DatenimportServiceFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer agpsExportAllowed(java.util.List pAgpsIdList) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_ID_LIST", pAgpsIdList);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.datenimportservicefpa.agps_export_allowed", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agpsHatManUp(Long inAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.datenimportservicefpa.agps_hat_man_up", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer checkLoExportErlaubt(Long inImpId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_IMP_ID", inImpId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.datenimportservicefpa.check_lo_export_erlaubt",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void pruefeImportset(Long inImpId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_IMP_ID", inImpId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.datenimportservicefpa.pruefe_importset", parameters);
  }

  @Override
  public void sendeAnLogistik(Long inImpId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_IMP_ID", inImpId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.datenimportservicefpa.sende_an_logistik", parameters);
  }
}
