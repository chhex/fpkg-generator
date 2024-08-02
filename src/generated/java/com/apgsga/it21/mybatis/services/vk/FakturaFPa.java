package com.apgsga.it21.mybatis.services.vk;

public interface FakturaFPa {

  public void agpsIsAbgerechnet(Integer agpsIdIn);

  public void akontoRgErzeugen(Integer kdvtIdIn);

  public void bestimmeInfofeldText(
      Integer pKdvtIdIn,
      Integer pAgIdIn,
      Integer pAnzAg,
      Integer pAnzAgps,
      Integer pRechnungArt,
      java.sql.Timestamp pBlockiertBisIn,
      java.sql.Timestamp pDatumVon,
      java.sql.Timestamp pDatumBis,
      String pInfotext,
      Integer pAkontoBez);

  public void checkSrgHatDemontierteFl(Integer pRgIdIn, String pMeldungOut);

  public void fakturaunterlage(Integer rgIdIn);

  public void getfakturajournal(Integer amountIo, Integer posIn);

  public void getAkontoPreis(
      Integer kdvtIdIn,
      Integer agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut,
      Integer akontoPreisOut);

  public void getFakturaPreis(
      Integer kdvtIdIn,
      Integer agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void getVeAgFaktura(
      Integer agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void getVeKdvtFaktura(
      Integer kdvtIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void preparefakturajournal(Integer pBujId);

  public void rechnungsstellungVerhindern(Integer rgIdIn, String textIn);

  public void rechnungExistiert(Integer kdvtIdIn);

  public void rechnungFreigeben(Integer rgIdIn);

  public void rechnungKorrigieren(Integer rgIdIn);

  public void rgBeruecksichtigtVz(Integer pRgId);

  public void rgDuplikatErstellen(Integer rgIdIn);

  public void rgKorrekturAbschliessen(Integer rgIdIn);

  public void rgKorrekturErlaubt(Integer rgIdIn);

  public void schlussrechnungExistiert(Integer kdvtIdIn);

  public void updAgentur(Integer rgIdIn);

  public void updAuftraggeber(Integer rgIdIn);
}
