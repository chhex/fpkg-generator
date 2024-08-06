package com.apgsga.it21.fpkgservices.vk.annullationfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class AnnullationFPaImpl implements AnnullationFPa {

  private final DataAccessFacade dataAccessFacade;

  public AnnullationFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer kvlfAgpsAnnullKostpflJf(Long kvlfIdIn, Long agpsIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KVLF_ID_IN", kvlfIdIn);
    parameters.put("AGPS_ID_IN", agpsIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.annullationfpa.kvlf_agps_annull_kostpfl_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
