package com.apgsga.it21.fpkgservices.vk.vpfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VpFPaImpl implements VpFPa {

  private final DataAccessFacade dataAccessFacade;

  public VpFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public String anlieferterminPlakat(
      Long inKdvtId,
      Integer inAgpsArt,
      Long inAbwicklungSubjOid,
      String inSujet,
      java.sql.Timestamp inAushangBeginn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_AGPS_ART", inAgpsArt);
    parameters.put("IN_ABWICKLUNG_SUBJ_OID", inAbwicklungSubjOid);
    parameters.put("IN_SUJET", inSujet);
    parameters.put("IN_AUSHANG_BEGINN", inAushangBeginn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.anliefertermin_plakat", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer anzahlSpaltenRekap() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.anzahl_spalten_rekap", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void createSprDigital(Long inKdvtdokId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVTDOK_ID", inKdvtdokId);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.vpfpa.create_spr_digital", parameters);
  }

  @Override
  public void erstellenKdvtdokRecords(
      Long inKdvtId,
      Integer inSortWemf,
      Integer inDokumentFormat,
      String inDruckerAlias,
      Integer inAnzExemplare,
      Integer inMitRekapitulation,
      Integer inMitVerteilungPlan,
      Integer inMitAdressliste,
      Integer inMitSprBewertung,
      Integer inMitSprXmlDatei,
      Integer inMitWmBedarf,
      Integer inMitShortcutFs,
      Integer inMitAusstrahlungsplan,
      Integer inDirektdruck,
      Integer inVpTypTraffic,
      Integer inDrucksteuerungTraffic,
      Integer inSprXmlOptJn,
      Integer inIsMyapgsgaErlaubt,
      Integer inNurBrutto,
      Integer inMitKontaktwert,
      Integer inDrucklayout,
      Integer outVkPapDrucken) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_SORT_WEMF", inSortWemf);
    parameters.put("IN_DOKUMENT_FORMAT", inDokumentFormat);
    parameters.put("IN_DRUCKER_ALIAS", inDruckerAlias);
    parameters.put("IN_ANZ_EXEMPLARE", inAnzExemplare);
    parameters.put("IN_MIT_REKAPITULATION", inMitRekapitulation);
    parameters.put("IN_MIT_VERTEILUNG_PLAN", inMitVerteilungPlan);
    parameters.put("IN_MIT_ADRESSLISTE", inMitAdressliste);
    parameters.put("IN_MIT_SPR_BEWERTUNG", inMitSprBewertung);
    parameters.put("IN_MIT_SPR_XML_DATEI", inMitSprXmlDatei);
    parameters.put("IN_MIT_WM_BEDARF", inMitWmBedarf);
    parameters.put("IN_MIT_SHORTCUT_FS", inMitShortcutFs);
    parameters.put("IN_MIT_AUSSTRAHLUNGSPLAN", inMitAusstrahlungsplan);
    parameters.put("IN_DIREKTDRUCK", inDirektdruck);
    parameters.put("IN_VP_TYP_TRAFFIC", inVpTypTraffic);
    parameters.put("IN_DRUCKSTEUERUNG_TRAFFIC", inDrucksteuerungTraffic);
    parameters.put("IN_SPR_XML_OPT_JN", inSprXmlOptJn);
    parameters.put("IN_IS_MYAPGSGA_ERLAUBT", inIsMyapgsgaErlaubt);
    parameters.put("IN_NUR_BRUTTO", inNurBrutto);
    parameters.put("IN_MIT_KONTAKTWERT", inMitKontaktwert);
    parameters.put("IN_DRUCKLAYOUT", inDrucklayout);
    parameters.put("OUT_VK_PAP_DRUCKEN", outVkPapDrucken);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.erstellen_kdvtdok_records", parameters);
  }

  @Override
  public void erstellenVpdsaRecords(Long inKdvtId, Long inKdvtdokId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_KDVTDOK_ID", inKdvtdokId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.erstellen_vpdsa_records", parameters);
  }

  @Override
  public Integer istKommraumFlughaefenInt(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.ist_kommraum_flughaefen_int", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void kdvtErstellenVerkaufspapiere(Long kdvtIdIn, Integer vkPapDruckenOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("VK_PAP_DRUCKEN_OUT", vkPapDruckenOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.kdvt_erstellen_verkaufspapiere", parameters);
  }

  @Override
  public void loeschenVpdsaRecords(Long inKdvtId, Long inKdvtdokId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    parameters.put("IN_KDVTDOK_ID", inKdvtdokId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.loeschen_vpdsa_records", parameters);
  }

  @Override
  public void preisermittlung(Long pKdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID_IN", pKdvtIdIn);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.vpfpa.preisermittlung", parameters);
  }

  @Override
  public Integer updKommraumBergeInt(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.vpfpa.upd_kommraum_berge_int", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
