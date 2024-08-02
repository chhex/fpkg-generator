package com.apgsga.it21.mybatis.services.vk;

public interface FakturaFPa {

  public void agpsIsAbgerechnet(Long agpsIdIn);

  public void akontoRgErzeugen(Long kdvtIdIn);

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
      Integer pAkontoBez);

  public void checkSrgHatDemontierteFl(Long pRgIdIn, String pMeldungOut);

  public void fakturaunterlage(Long rgIdIn);

  public void getfakturajournal(Integer amountIo, Integer posIn);

  public void getAkontoPreis(
      Long kdvtIdIn,
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut,
      Integer akontoPreisOut);

  public void getFakturaPreis(
      Long kdvtIdIn,
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void getVeAgFaktura(
      Long agIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void getVeKdvtFaktura(
      Long kdvtIdIn,
      Integer nettoPreisOut,
      Integer beraterkommissionOut,
      Integer zusatzkostenOut,
      Integer zusatzleistungOut,
      Integer fakturaPreisOut);

  public void preparefakturajournal(Long pBujId);

  public void rechnungsstellungVerhindern(Long rgIdIn, String textIn);

  public void rechnungExistiert(Long kdvtIdIn);

  public void rechnungFreigeben(Long rgIdIn);

  public void rechnungKorrigieren(Long rgIdIn);

  public void rgBeruecksichtigtVz(Long pRgId);

  public void rgDuplikatErstellen(Long rgIdIn);

  public void rgKorrekturAbschliessen(Long rgIdIn);

  public void rgKorrekturErlaubt(Long rgIdIn);

  public void schlussrechnungExistiert(Long kdvtIdIn);

  public void updAgentur(Long rgIdIn);

  public void updAuftraggeber(Long rgIdIn);
}
