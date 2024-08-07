package com.apgsga.it21.fpkgservices.vk.buchunganalogservicef;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class BuchungAnalogServiceFImpl implements BuchungAnalogServiceF {

  private final DataAccessFacade dataAccessFacade;

  public BuchungAnalogServiceFImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void aendernAgpsInReservation(Long agpsIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.aendern_agps_in_reservation",
        parameters);
  }

  @Override
  public void agpsflzoBeendenJf(
      Long pAgpsflzoId,
      java.sql.Timestamp pAushangEnde,
      Integer pErsatzFlNummer,
      Integer pMitAutoZusatzleistung,
      Integer pMitErfasstenZusatzleistung) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPSFLZO_ID", pAgpsflzoId);
    parameters.put("P_AUSHANG_ENDE", pAushangEnde);
    parameters.put("P_ERSATZ_FL_NUMMER", pErsatzFlNummer);
    parameters.put("P_MIT_AUTO_ZUSATZLEISTUNG", pMitAutoZusatzleistung);
    parameters.put("P_MIT_ERFASSTEN_ZUSATZLEISTUNG", pMitErfasstenZusatzleistung);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agpsflzo_beenden_jf", parameters);
  }

  @Override
  public void agpsAlleBestaetigen(
      Long agIdIn, java.sql.Timestamp optionVerfallIn, Integer entferneWartelisteIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("OPTION_VERFALL_IN", optionVerfallIn);
    parameters.put("ENTFERNE_WARTELISTE_IN", entferneWartelisteIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_alle_bestaetigen", parameters);
  }

  @Override
  public void agpsBestaetigen(
      Long agpsIdIn, java.sql.Timestamp optionVerfallIn, Integer entferneWartelisteIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("OPTION_VERFALL_IN", optionVerfallIn);
    parameters.put("ENTFERNE_WARTELISTE_IN", entferneWartelisteIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_bestaetigen", parameters);
  }

  @Override
  public void agpsFlaechenFreigebenInit() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_flaechen_freigeben_init",
        parameters);
  }

  @Override
  public void agpsFlaechenFreigebenJc(Integer annullierenIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("ANNULLIEREN_IN", annullierenIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_flaechen_freigeben_jc",
        parameters);
  }

  @Override
  public void agpsFlaechenFreigAddFl(Long agpsFlZoIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_FL_ZO_ID_IN", agpsFlZoIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_flaechen_freig_add_fl",
        parameters);
  }

  @Override
  public void agpsKopierenKrsGleich(Long agIdIn, Long agpsIdIn, Long agpsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("AGPS_ID_OUT", agpsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_kopieren_krs_gleich",
        parameters);
  }

  @Override
  public void agpsVerschieben(Long agpsIdIn, Long agpsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("AGPS_ID_OUT", agpsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_verschieben", parameters);
  }

  @Override
  public Integer agpsVerschiebInBenutzung(Long inAgpsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.agps_verschieb_in_benutzung",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer akontoErfassenErlaubt(Long inAgId, Integer inZahlungsmodusGui) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_ZAHLUNGSMODUS_GUI", inZahlungsmodusGui);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.akonto_erfassen_erlaubt",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void annullierenAgps(Long agpsIdIn, Long angrIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("ANGR_ID_IN", angrIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.annullieren_agps", parameters);
  }

  @Override
  public void annullierenAuftrag(Long agIdIn, Long angrIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("ANGR_ID_IN", angrIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.annullieren_auftrag", parameters);
  }

  @Override
  public void bestaetigenKv(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.bestaetigen_kv", parameters);
  }

  @Override
  public Integer buchenAuftragspositionI(Long inAgpsId, Integer inBuchungsart) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AGPS_ID", inAgpsId);
    parameters.put("IN_BUCHUNGSART", inBuchungsart);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.buchen_auftragsposition_i",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void buchenOevEinzelflaeche(
      Long inAgId, Long inFlOid, java.sql.Timestamp inAushangBeginn, Integer inAushangDauer) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_FL_OID", inFlOid);
    parameters.put("IN_AUSHANG_BEGINN", inAushangBeginn);
    parameters.put("IN_AUSHANG_DAUER", inAushangDauer);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.buchen_oev_einzelflaeche",
        parameters);
  }

  @Override
  public Integer budgetBuchungJf(
      Long pAgpsIdIn,
      Integer pFlZuordStatusIn,
      java.sql.Timestamp pAushangBeginnIn,
      Integer pVgUpdateIn,
      Integer pAlsRichtofferteIn,
      Integer pErwBudgetErfasst,
      Integer pPosBuchung,
      Long pAnfrId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_AGPS_ID_IN", pAgpsIdIn);
    parameters.put("P_FL_ZUORD_STATUS_IN", pFlZuordStatusIn);
    parameters.put("P_AUSHANG_BEGINN_IN", pAushangBeginnIn);
    parameters.put("P_VG_UPDATE_IN", pVgUpdateIn);
    parameters.put("P_ALS_RICHTOFFERTE_IN", pAlsRichtofferteIn);
    parameters.put("P_ERW_BUDGET_ERFASST", pErwBudgetErfasst);
    parameters.put("P_POS_BUCHUNG", pPosBuchung);
    parameters.put("P_ANFR_ID", pAnfrId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.budget_buchung_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void ersatzFlRegistrieren(Long agpsIdIn, Long flOidOrgIn, Long flOidNeuIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("FL_OID_ORG_IN", flOidOrgIn);
    parameters.put("FL_OID_NEU_IN", flOidNeuIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.ersatz_fl_registrieren", parameters);
  }

  @Override
  public void ersatzFlSuchen(
      Long agpsIdIn, Long flOidIn, java.sql.Timestamp ahBegIn, Integer raiseOnAuftragsbelegung) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("FL_OID_IN", flOidIn);
    parameters.put("AH_BEG_IN", ahBegIn);
    parameters.put("RAISE_ON_AUFTRAGSBELEGUNG", raiseOnAuftragsbelegung);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.ersatz_fl_suchen", parameters);
  }

  @Override
  public void erstellenAgpsMitKopiertemKriteriensatz(Long agpsIdIn, Long agpsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("AGPS_ID_OUT", agpsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.erstellen_agps_mit_kopiertem_kriteriensatz",
        parameters);
  }

  @Override
  public void erstellenAgpsMitKriteriensatzOv(Long agIdIn, Long agpsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("AGPS_ID_OUT", agpsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.erstellen_agps_mit_kriteriensatz_ov",
        parameters);
  }

  @Override
  public void erstellenAgpsMitKriteriensatzStandard(Long agIdIn, Long agpsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("AGPS_ID_OUT", agpsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.erstellen_agps_mit_kriteriensatz_standard",
        parameters);
  }

  @Override
  public void flManUmplatzieren(Long agpsIdIn, Long flOidOrgIn, Long flOidNeuIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    parameters.put("FL_OID_ORG_IN", flOidOrgIn);
    parameters.put("FL_OID_NEU_IN", flOidNeuIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.fl_man_umplatzieren", parameters);
  }

  @Override
  public Integer getBudgetBuchungResult() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.get_budget_buchung_result",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void kdvtAnnullieren(Long kdvtIdIn, Long angrIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("ANGR_ID_IN", angrIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.kdvt_annullieren", parameters);
  }

  @Override
  public void kopierenKrs(Long agkrsIdIn, Long agkrsIdOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGKRS_ID_IN", agkrsIdIn);
    parameters.put("AGKRS_ID_OUT", agkrsIdOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.kopieren_krs", parameters);
  }

  @Override
  public Integer uiAgpsFlaechenFreigebenJf() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.ui_agps_flaechen_freigeben_jf",
        parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void uiAgpsFlaechenFreiAddJf(Long inAfzId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AFZ_ID", inAfzId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.ui_agps_flaechen_frei_add_jf",
        parameters);
  }

  @Override
  public void uiAgpsFlaechenFreiClear() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.buchunganalogservicef.ui_agps_flaechen_frei_clear",
        parameters);
  }
}
