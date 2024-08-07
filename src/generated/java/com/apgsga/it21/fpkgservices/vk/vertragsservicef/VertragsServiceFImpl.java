package com.apgsga.it21.fpkgservices.vk.vertragsservicef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VertragsServiceFImpl implements VertragsServiceF {

  private final DataAccessFacade dataAccessFacade;

  public VertragsServiceFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public java.sql.Timestamp getVgAushangtagWennAnnulliert(
      Long inFlOid, java.sql.Timestamp inAushangVon, Long inAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FL_OID", inFlOid);
    parameters.put("IN_AUSHANG_VON", inAushangVon);
    parameters.put("IN_AGPS_ID", inAgpsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicef.get_vg_aushangtag_wenn_annulliert",
        parameters);
    return (java.sql.Timestamp) returnParameterMap.get("RESULT");
  }

  @Override
  public void kuendenVertragOderAgps(
      Long pKvlfIdIn,
      Long pAgpsIdIn,
      java.sql.Timestamp pKuendigungsdatumIn,
      java.sql.Timestamp pVertragsEndeIn,
      Long pAngrIdIn,
      Long pErsatzFlOidIn,
      Integer pKuendigungstyp) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KVLF_ID_IN", pKvlfIdIn);
    parameters.put("P_AGPS_ID_IN", pAgpsIdIn);
    parameters.put("P_KUENDIGUNGSDATUM_IN", pKuendigungsdatumIn);
    parameters.put("P_VERTRAGS_ENDE_IN", pVertragsEndeIn);
    parameters.put("P_ANGR_ID_IN", pAngrIdIn);
    parameters.put("P_ERSATZ_FL_OID_IN", pErsatzFlOidIn);
    parameters.put("P_KUENDIGUNGSTYP", pKuendigungstyp);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicef.kuenden_vertrag_oder_agps", parameters);
  }

  @Override
  public void setVertragsEndeUndAufhebenBindungen(Long inKvlfId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KVLF_ID", inKvlfId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicef.set_vertrags_ende_und_aufheben_bindungen",
        parameters);
  }

  @Override
  public void verlaengernVertrag(Long inKvlfId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KVLF_ID", inKvlfId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicef.verlaengern_vertrag", parameters);
  }

  @Override
  public void verschiebenVertrag(Long inKvlfId, Integer inWochen) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KVLF_ID", inKvlfId);
    parameters.put("IN_WOCHEN", inWochen);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vertragsservicef.verschieben_vertrag", parameters);
  }
}
