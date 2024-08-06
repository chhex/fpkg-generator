package com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class AuftragsabwicklungFlFPaImpl implements AuftragsabwicklungFlFPa {

  private final DataAccessFacade dataAccessFacade;

  public AuftragsabwicklungFlFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void flFreigeben1Init() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa.fl_freigeben1_init", parameters);
  }

  @Override
  public void flFreigeben2Add(Long inAgpsFlZoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_FL_ZO_ID", inAgpsFlZoId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa.fl_freigeben2_add", parameters);
  }

  @Override
  public void flFreigeben3Check(Integer inAnnullieren, Long inAgpsId, Long inAgId, Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_ANNULLIEREN", inAnnullieren);
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_KDVT_ID", inKdvtId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa.fl_freigeben3_check", parameters);
  }

  @Override
  public void flFreigeben4Execute() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa.fl_freigeben4_execute",
        parameters);
  }
}
