package com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class DgfxBuchungsablaufFPaImpl implements DgfxBuchungsablaufFPa {

  private final DataAccessFacade dataAccessFacade;

  public DgfxBuchungsablaufFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void agpsBuchen(
      java.util.List pAgpsIds, Integer pMitWarteliste, Integer pKompensationGleicheNg) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_IDS", pAgpsIds);
    parameters.put("P_MIT_WARTELISTE", pMitWarteliste);
    parameters.put("P_KOMPENSATION_GLEICHE_NG", pKompensationGleicheNg);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.agps_buchen", parameters);
  }

  @Override
  public void agpsTerminieren(java.util.List inAgpsIds, java.sql.Timestamp inAushangBis) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_IDS", inAgpsIds);
    parameters.put("IN_AUSHANG_BIS", inAushangBis);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.agps_terminieren", parameters);
  }

  @Override
  public void auftragMitAgpsVerbinden(Long pAgId, java.util.List pAgpsIds) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AG_ID", pAgId);
    parameters.put("P_AGPS_IDS", pAgpsIds);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.auftrag_mit_agps_verbinden",
        parameters);
  }

  @Override
  public void autofueller(java.util.List inAgpsIds, Integer inAutofuellerArt) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_IDS", inAgpsIds);
    parameters.put("IN_AUTOFUELLER_ART", inAutofuellerArt);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.autofueller", parameters);
  }

  @Override
  public Integer autoFuellerErlaubt(Long inKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KRS_ID", inKrsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.auto_fueller_erlaubt", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer checkKrsAgBranchenVertr(Long inAgId, Long inKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_KRS_ID", inKrsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.check_krs_ag_branchen_vertr",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer checkKrsAgVkoeVertr(Long inAgId, Long inKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_KRS_ID", inKrsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.check_krs_ag_vkoe_vertr",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer checkNgBranchenVkoeVertr(
      Long inNgId,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIdorids,
      Long inVkoeOid,
      Long inSubjOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_NG_ID", inNgId);
    parameters.put("IN_AUSHANG_BEGINN", inAushangBeginn);
    parameters.put("IN_AUSHANG_DAUER", inAushangDauer);
    parameters.put("IN_BRC_IDORIDS", inBrcIdorids);
    parameters.put("IN_VKOE_OID", inVkoeOid);
    parameters.put("IN_SUBJ_OID", inSubjOid);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.check_ng_branchen_vkoe_vertr",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void deleteKrs(java.util.List inKrsIds, java.util.List inAgpsIds) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KRS_IDS", inKrsIds);
    parameters.put("IN_AGPS_IDS", inAgpsIds);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.delete_krs", parameters);
  }

  @Override
  public void erstellenTzsVonVki(java.util.List pKrsIds) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KRS_IDS", pKrsIds);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.erstellen_tzs_von_vki", parameters);
  }

  @Override
  public void filterNgBranchenVkoe(
      java.util.List inNgIds,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIds,
      Long inVkoeOid,
      Long inSubjOidRestrkAusnahme,
      java.util.List outFilteredNgIds) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_NG_IDS", inNgIds);
    parameters.put("IN_AUSHANG_BEGINN", inAushangBeginn);
    parameters.put("IN_AUSHANG_DAUER", inAushangDauer);
    parameters.put("IN_BRC_IDS", inBrcIds);
    parameters.put("IN_VKOE_OID", inVkoeOid);
    parameters.put("IN_SUBJ_OID_RESTRK_AUSNAHME", inSubjOidRestrkAusnahme);
    parameters.put("OUT_FILTERED_NG_IDS", outFilteredNgIds);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.filter_ng_branchen_vkoe",
        parameters);
  }

  @Override
  public String getDglBruttopreisNetz(String inParametersXml) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_PARAMETERS_XML", inParametersXml);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.get_dgl_bruttopreis_netz",
        parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public void loescheKrsAgps(java.util.List inKrsIds, java.util.List inAgpsIds) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KRS_IDS", inKrsIds);
    parameters.put("IN_AGPS_IDS", inAgpsIds);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.loesche_krs_agps", parameters);
  }

  @Override
  public void netzAushangtagAbDatum(
      Long pNtgrotoid,
      java.sql.Timestamp pDatumVon,
      java.sql.Timestamp pAushangtag,
      Integer pAushangTakt) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_NTGROTOID", pNtgrotoid);
    parameters.put("P_DATUM_VON", pDatumVon);
    parameters.put("P_AUSHANGTAG", pAushangtag);
    parameters.put("P_AUSHANG_TAKT", pAushangTakt);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.netz_aushangtag_ab_datum",
        parameters);
  }

  @Override
  public java.util.List ngSuche(
      java.sql.Timestamp pAushangBeginn,
      Integer pAushangDauer,
      Integer pMediumLaenge,
      Long pVkoeOid,
      java.util.List pBrcIdL,
      Long pRkAusnahmeSubjOid,
      Long pNkId,
      java.util.List pPfIdL,
      java.util.List pEinGbotOidL,
      java.util.List pAusGbotOidL,
      java.util.List pObjOidL) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AUSHANG_BEGINN", pAushangBeginn);
    parameters.put("P_AUSHANG_DAUER", pAushangDauer);
    parameters.put("P_MEDIUM_LAENGE", pMediumLaenge);
    parameters.put("P_VKOE_OID", pVkoeOid);
    parameters.put("P_BRC_ID_L", pBrcIdL);
    parameters.put("P_RK_AUSNAHME_SUBJ_OID", pRkAusnahmeSubjOid);
    parameters.put("P_NK_ID", pNkId);
    parameters.put("P_PF_ID_L", pPfIdL);
    parameters.put("P_EIN_GBOT_OID_L", pEinGbotOidL);
    parameters.put("P_AUS_GBOT_OID_L", pAusGbotOidL);
    parameters.put("P_OBJ_OID_L", pObjOidL);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.ng_suche", parameters);
    return (java.util.List) returnParameterMap.get("RESULT");
  }

  @Override
  public void reservation(
      Long pKrsId,
      Long pVorschlagId,
      Long pVerteilungartId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KRS_ID", pKrsId);
    parameters.put("P_VORSCHLAG_ID", pVorschlagId);
    parameters.put("P_VERTEILUNGART_ID", pVerteilungartId);
    parameters.put("O_DGFX_VG_RESULTAT_DETAIL_XML", oDgfxVgResultatDetailXml);
    parameters.put("O_AGPS_ID", oAgpsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.reservation", parameters);
  }

  @Override
  public void reservationXorVorschlag(
      Long pKrsId,
      Integer pIstReservation,
      Long ioVorschlagId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KRS_ID", pKrsId);
    parameters.put("P_IST_RESERVATION", pIstReservation);
    parameters.put("IO_VORSCHLAG_ID", ioVorschlagId);
    parameters.put("O_DGFX_VG_RESULTAT_DETAIL_XML", oDgfxVgResultatDetailXml);
    parameters.put("O_AGPS_ID", oAgpsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.reservation_xor_vorschlag",
        parameters);
  }

  @Override
  public void vorschlag(
      Long pKrsId,
      Long pVerteilungartId,
      Long oVorschlagId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KRS_ID", pKrsId);
    parameters.put("P_VERTEILUNGART_ID", pVerteilungartId);
    parameters.put("O_VORSCHLAG_ID", oVorschlagId);
    parameters.put("O_DGFX_VG_RESULTAT_DETAIL_XML", oDgfxVgResultatDetailXml);
    parameters.put("O_AGPS_ID", oAgpsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.vorschlag", parameters);
  }

  @Override
  public void wartelisteAgpsEinloesen(java.util.List agpsIdsIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_IDS_IN", agpsIdsIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.dgfxbuchungsablauffpa.warteliste_agps_einloesen",
        parameters);
  }
}
