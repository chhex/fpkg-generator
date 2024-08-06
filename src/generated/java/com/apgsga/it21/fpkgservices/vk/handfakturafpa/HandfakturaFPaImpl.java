package com.apgsga.it21.fpkgservices.vk.handfakturafpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class HandfakturaFPaImpl implements HandfakturaFPa {

  private final DataAccessFacade dataAccessFacade;

  public HandfakturaFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer neueHandfaktura(
      Long pAtgebId,
      Long pAtgebKontaktSubjOid,
      Long pAgenturSubjOid,
      Long pAgenturKontaktSubjOid,
      Long pRechnEmpfSubjOid,
      Long pVkoeOid,
      Long pVkberOid,
      String pReferenz,
      String pMemoNotiz,
      String pTextVorRechnung,
      String pTextNachRechnung) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_ATGEB_ID", pAtgebId);
    parameters.put("P_ATGEB_KONTAKT_SUBJ_OID", pAtgebKontaktSubjOid);
    parameters.put("P_AGENTUR_SUBJ_OID", pAgenturSubjOid);
    parameters.put("P_AGENTUR_KONTAKT_SUBJ_OID", pAgenturKontaktSubjOid);
    parameters.put("P_RECHN_EMPF_SUBJ_OID", pRechnEmpfSubjOid);
    parameters.put("P_VKOE_OID", pVkoeOid);
    parameters.put("P_VKBER_OID", pVkberOid);
    parameters.put("P_REFERENZ", pReferenz);
    parameters.put("P_MEMO_NOTIZ", pMemoNotiz);
    parameters.put("P_TEXT_VOR_RECHNUNG", pTextVorRechnung);
    parameters.put("P_TEXT_NACH_RECHNUNG", pTextNachRechnung);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.neue_handfaktura", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer neueHandfakturaPos(
      Long pHfaId,
      Long pLdpaId,
      String pBeschreibung,
      Integer pAnzahl,
      Integer pStueckpreis,
      java.sql.Timestamp pLeistungsdatum,
      Long pLdLogistikSubjOid,
      Long pAkquOeSubjOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_HFA_ID", pHfaId);
    parameters.put("P_LDPA_ID", pLdpaId);
    parameters.put("P_BESCHREIBUNG", pBeschreibung);
    parameters.put("P_ANZAHL", pAnzahl);
    parameters.put("P_STUECKPREIS", pStueckpreis);
    parameters.put("P_LEISTUNGSDATUM", pLeistungsdatum);
    parameters.put("P_LD_LOGISTIK_SUBJ_OID", pLdLogistikSubjOid);
    parameters.put("P_AKQU_OE_SUBJ_OID", pAkquOeSubjOid);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.neue_handfaktura_pos", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void rechnungBearbeiten(Long hfaIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("HFA_ID_IN", hfaIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.rechnung_bearbeiten", parameters);
  }

  @Override
  public void rechnungErstellen(Long hfaIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("HFA_ID_IN", hfaIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.rechnung_erstellen", parameters);
  }

  @Override
  public void rechnungFreigeben(Long hfaIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("HFA_ID_IN", hfaIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.rechnung_freigeben", parameters);
  }

  @Override
  public void rechnungStornieren(Long hfaIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("HFA_ID_IN", hfaIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.handfakturafpa.rechnung_stornieren", parameters);
  }
}
