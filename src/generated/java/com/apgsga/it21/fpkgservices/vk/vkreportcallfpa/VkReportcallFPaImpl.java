package com.apgsga.it21.fpkgservices.vk.vkreportcallfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VkReportcallFPaImpl implements VkReportcallFPa {

  private final DataAccessFacade dataAccessFacade;

  public VkReportcallFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer ausstrahlungsnachweis(
      String benutzerIn, java.util.List kdvtIdIn, String kdvtIdStringIn, Integer dachKampagneJnIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("BENUTZER_IN", benutzerIn);
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("KDVT_ID_STRING_IN", kdvtIdStringIn);
    parameters.put("DACH_KAMPAGNE_JN_IN", dachKampagneJnIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vkreportcallfpa.ausstrahlungsnachweis", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer ausstrahlungsnachweisJf(
      String benutzerIn, String kdvtIdStringIn, Integer dachKampagneJnIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("BENUTZER_IN", benutzerIn);
    parameters.put("KDVT_ID_STRING_IN", kdvtIdStringIn);
    parameters.put("DACH_KAMPAGNE_JN_IN", dachKampagneJnIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vkreportcallfpa.ausstrahlungsnachweis_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
