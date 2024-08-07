package com.apgsga.it21.fpkgservices.vk.enkundevertraegelf;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class EnKundeVertraegeLFImpl implements EnKundeVertraegeLF {

  private final DataAccessFacade dataAccessFacade;

  public EnKundeVertraegeLFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer getReservationsart(Long pKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID", pKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.enkundevertraegelf.get_reservationsart", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer istKommraumBergeInt(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.enkundevertraegelf.ist_kommraum_berge_int", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer istSwaBerechtigt(Long pKdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID_IN", pKdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.enkundevertraegelf.ist_swa_berechtigt", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
