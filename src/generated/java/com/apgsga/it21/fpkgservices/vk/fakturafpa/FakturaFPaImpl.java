package com.apgsga.it21.fpkgservices.vk.fakturafpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class FakturaFPaImpl implements FakturaFPa {

  private final DataAccessFacade dataAccessFacade;

  public FakturaFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer agpsIsAbgerechnet(Long agpsIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.agps_is_abgerechnet", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer akontoRgErzeugen(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.akonto_rg_erzeugen", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void bestimmeInfofeldText(
      Long pKdvtIdIn,
      Long pAgIdIn,
      Integer pAnzAg,
      Integer pAnzAgps,
      Integer pRechnungArt,
      java.sql.Timestamp pBlockiertBisIn,
      java.sql.Timestamp pDatumVon,
      java.sql.Timestamp pDatumBis,
      String pInfotext,
      Integer pAkontoBez) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID_IN", pKdvtIdIn);
    parameters.put("P_AG_ID_IN", pAgIdIn);
    parameters.put("P_ANZ_AG", pAnzAg);
    parameters.put("P_ANZ_AGPS", pAnzAgps);
    parameters.put("P_RECHNUNG_ART", pRechnungArt);
    parameters.put("P_BLOCKIERT_BIS_IN", pBlockiertBisIn);
    parameters.put("P_DATUM_VON", pDatumVon);
    parameters.put("P_DATUM_BIS", pDatumBis);
    parameters.put("P_INFOTEXT", pInfotext);
    parameters.put("P_AKONTO_BEZ", pAkontoBez);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.bestimme_infofeld_text", parameters);
  }

  @Override
  public Integer checkSrgHatDemontierteFl(Long pRgIdIn, String pMeldungOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_RG_ID_IN", pRgIdIn);
    parameters.put("P_MELDUNG_OUT", pMeldungOut);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.check_srg_hat_demontierte_fl", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public String fakturaunterlage(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.fakturaunterlage", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public String getfakturajournal(Integer amountIo, Integer posIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AMOUNT_IO", amountIo);
    parameters.put("POS_IN", posIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.getfakturajournal", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public void getAkontoPreis(
      Long kdvtIdIn,
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut,
      Integer akontoPreisOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("NETTO_PREIS_OUT", nettoPreisOut);
    parameters.put("BERATERKOMMISSION_OUT", beraterkommissionOut);
    parameters.put("ZUSATZKOSTEN_OUT", zusatzkostenOut);
    parameters.put("ZUSATZLEISTUNG_OUT", zusatzleistungOut);
    parameters.put("FAKTURA_PREIS_OUT", fakturaPreisOut);
    parameters.put("AKONTO_PREIS_OUT", akontoPreisOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.get_akonto_preis", parameters);
  }

  @Override
  public void getFakturaPreis(
      Long kdvtIdIn,
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("NETTO_PREIS_OUT", nettoPreisOut);
    parameters.put("BERATERKOMMISSION_OUT", beraterkommissionOut);
    parameters.put("ZUSATZKOSTEN_OUT", zusatzkostenOut);
    parameters.put("ZUSATZLEISTUNG_OUT", zusatzleistungOut);
    parameters.put("FAKTURA_PREIS_OUT", fakturaPreisOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.get_faktura_preis", parameters);
  }

  @Override
  public void getVeAgFaktura(
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("NETTO_PREIS_OUT", nettoPreisOut);
    parameters.put("BERATERKOMMISSION_OUT", beraterkommissionOut);
    parameters.put("ZUSATZKOSTEN_OUT", zusatzkostenOut);
    parameters.put("ZUSATZLEISTUNG_OUT", zusatzleistungOut);
    parameters.put("FAKTURA_PREIS_OUT", fakturaPreisOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.get_ve_ag_faktura", parameters);
  }

  @Override
  public void getVeKdvtFaktura(
      Long kdvtIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    parameters.put("NETTO_PREIS_OUT", nettoPreisOut);
    parameters.put("BERATERKOMMISSION_OUT", beraterkommissionOut);
    parameters.put("ZUSATZKOSTEN_OUT", zusatzkostenOut);
    parameters.put("ZUSATZLEISTUNG_OUT", zusatzleistungOut);
    parameters.put("FAKTURA_PREIS_OUT", fakturaPreisOut);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.get_ve_kdvt_faktura", parameters);
  }

  @Override
  public void preparefakturajournal(Long pBujId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_BUJ_ID", pBujId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.preparefakturajournal", parameters);
  }

  @Override
  public void rechnungsstellungVerhindern(Long rgIdIn, String textIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    parameters.put("TEXT_IN", textIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rechnungsstellung_verhindern", parameters);
  }

  @Override
  public Integer rechnungExistiert(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rechnung_existiert", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void rechnungFreigeben(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rechnung_freigeben", parameters);
  }

  @Override
  public void rechnungKorrigieren(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rechnung_korrigieren", parameters);
  }

  @Override
  public Integer rgBeruecksichtigtVz(Long pRgId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_RG_ID", pRgId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rg_beruecksichtigt_vz", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void rgDuplikatErstellen(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rg_duplikat_erstellen", parameters);
  }

  @Override
  public void rgKorrekturAbschliessen(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rg_korrektur_abschliessen", parameters);
  }

  @Override
  public Integer rgKorrekturErlaubt(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.rg_korrektur_erlaubt", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer schlussrechnungExistiert(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.schlussrechnung_existiert", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer updAgentur(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>)
        dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.fakturafpa.upd_agentur", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer updAuftraggeber(Long rgIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("RG_ID_IN", rgIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.fakturafpa.upd_auftraggeber", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
