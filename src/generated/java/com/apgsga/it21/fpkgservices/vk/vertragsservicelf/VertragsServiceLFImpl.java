package com.apgsga.it21.fpkgservices.vk.vertragsservicelf;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VertragsServiceLFImpl implements VertragsServiceLF {

  private final DataAccessFacade dataAccessFacade;

  public VertragsServiceLFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer ermittelnJahrespreis(Long pAgpsIdIn, Integer pZielBruttopreisIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_ID_IN", pAgpsIdIn);
    parameters.put("P_ZIEL_BRUTTOPREIS_IN", pZielBruttopreisIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicelf.ermitteln_jahrespreis", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void ermittelnKuendigungsartenAgps(
      java.util.List pAgpsIdList, java.sql.Timestamp pKuendigungsdatum) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_ID_LIST", pAgpsIdList);
    parameters.put("P_KUENDIGUNGSDATUM", pKuendigungsdatum);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicelf.ermitteln_kuendigungsarten_agps",
        parameters);
  }

  @Override
  public void ermittelnKuendigungsartenVertrag(Long pKvlfId, java.sql.Timestamp pKuendigungsdatum) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KVLF_ID", pKvlfId);
    parameters.put("P_KUENDIGUNGSDATUM", pKuendigungsdatum);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicelf.ermitteln_kuendigungsarten_vertrag",
        parameters);
  }

  @Override
  public java.sql.Timestamp getAushangtaktende(Long inAgpsId, java.sql.Timestamp inAushangendeVon) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_AUSHANGENDE_VON", inAushangendeVon);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicelf.get_aushangtaktende", parameters);
    return (java.sql.Timestamp) returnParameterMap.get("RESULT");
  }

  @Override
  public void insLog() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.vertragsservicelf.ins_log", parameters);
  }

  @Override
  public Integer istDatumFuerAoKuendigungErlaubt(
      Long pAgpsIdIn, Long pKvlfIdIn, java.sql.Timestamp pKuendDatumIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_ID_IN", pAgpsIdIn);
    parameters.put("P_KVLF_ID_IN", pKvlfIdIn);
    parameters.put("P_KUEND_DATUM_IN", pKuendDatumIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicelf.ist_datum_fuer_ao_kuendigung_erlaubt",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
