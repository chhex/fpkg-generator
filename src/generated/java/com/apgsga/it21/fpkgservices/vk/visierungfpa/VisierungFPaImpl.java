package com.apgsga.it21.fpkgservices.vk.visierungfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VisierungFPaImpl implements VisierungFPa {

  private final DataAccessFacade dataAccessFacade;

  public VisierungFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer istVbeVisumPflichtig(Long piAgId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("PI_AG_ID", piAgId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.visierungfpa.ist_vbe_visum_pflichtig", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer testIstVisumPflichtig(Long piAgId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("PI_AG_ID", piAgId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.visierungfpa.test_ist_visum_pflichtig", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void visaAblehnen(Long inAgId, Long inVisId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_VIS_ID", inVisId);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.visierungfpa.visa_ablehnen", parameters);
  }

  @Override
  public void visaAkzeptieren(Long inAgId, Long inVisId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_VIS_ID", inVisId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.visierungfpa.visa_akzeptieren", parameters);
  }
}
