package com.apgsga.it21.fpkgservices.vk.buchunganalogservicef;

public interface BuchungAnalogServiceF {
  public void aendernAgpsInReservation(Long agpsIdIn);

  public void agpsflzoBeendenJf(
      Long pAgpsflzoId,
      java.sql.Timestamp pAushangEnde,
      Integer pErsatzFlNummer,
      Integer pMitAutoZusatzleistung,
      Integer pMitErfasstenZusatzleistung);

  public void agpsAlleBestaetigen(
      Long agIdIn, java.sql.Timestamp optionVerfallIn, Integer entferneWartelisteIn);

  public void agpsBestaetigen(
      Long agpsIdIn, java.sql.Timestamp optionVerfallIn, Integer entferneWartelisteIn);

  public void agpsFlaechenFreigebenInit();

  public void agpsFlaechenFreigebenJc(Integer annullierenIn);

  public void agpsFlaechenFreigAddFl(Long agpsFlZoIdIn);

  public void agpsKopierenKrsGleich(Long agIdIn, Long agpsIdIn, Long agpsIdOut);

  public void agpsVerschieben(Long agpsIdIn, Long agpsIdOut);

  public Integer agpsVerschiebInBenutzung(Long inAgpsId);

  public Integer akontoErfassenErlaubt(Long inAgId, Integer inZahlungsmodusGui);

  public void annullierenAgps(Long agpsIdIn, Long angrIdIn);

  public void annullierenAuftrag(Long agIdIn, Long angrIdIn);

  public void bestaetigenKv(Long kdvtIdIn);

  public Integer buchenAuftragspositionI(Long inAgpsId, Integer inBuchungsart);

  public void buchenOevEinzelflaeche(
      Long inAgId, Long inFlOid, java.sql.Timestamp inAushangBeginn, Integer inAushangDauer);

  public Integer budgetBuchungJf(
      Long pAgpsIdIn,
      Integer pFlZuordStatusIn,
      java.sql.Timestamp pAushangBeginnIn,
      Integer pVgUpdateIn,
      Integer pAlsRichtofferteIn,
      Integer pErwBudgetErfasst,
      Integer pPosBuchung,
      Long pAnfrId);

  public void ersatzFlRegistrieren(Long agpsIdIn, Long flOidOrgIn, Long flOidNeuIn);

  public void ersatzFlSuchen(
      Long agpsIdIn, Long flOidIn, java.sql.Timestamp ahBegIn, Integer raiseOnAuftragsbelegung);

  public void erstellenAgpsMitKopiertemKriteriensatz(Long agpsIdIn, Long agpsIdOut);

  public void erstellenAgpsMitKriteriensatzOv(Long agIdIn, Long agpsIdOut);

  public void erstellenAgpsMitKriteriensatzStandard(Long agIdIn, Long agpsIdOut);

  public void flManUmplatzieren(Long agpsIdIn, Long flOidOrgIn, Long flOidNeuIn);

  public Integer getBudgetBuchungResult();

  public void kdvtAnnullieren(Long kdvtIdIn, Long angrIdIn);

  public void kopierenKrs(Long agkrsIdIn, Long agkrsIdOut);

  public Integer uiAgpsFlaechenFreigebenJf();

  public void uiAgpsFlaechenFreiAddJf(Long inAfzId);

  public void uiAgpsFlaechenFreiClear();
}
