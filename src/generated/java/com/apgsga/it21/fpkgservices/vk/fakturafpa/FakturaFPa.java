package com.apgsga.it21.fpkgservices.vk.fakturafpa;

public interface FakturaFPa {

  public Integer agpsIsAbgerechnet(Long agpsIdIn);

  public Integer akontoRgErzeugen(Long kdvtIdIn);

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

  public Integer checkSrgHatDemontierteFl(Long pRgIdIn, String pMeldungOut);

  public String fakturaunterlage(Long rgIdIn);

  public String getfakturajournal(Integer amountIo, Integer posIn);

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

  public Integer rechnungExistiert(Long kdvtIdIn);

  public void rechnungFreigeben(Long rgIdIn);

  public void rechnungKorrigieren(Long rgIdIn);

  public Integer rgBeruecksichtigtVz(Long pRgId);

  public void rgDuplikatErstellen(Long rgIdIn);

  public void rgKorrekturAbschliessen(Long rgIdIn);

  public Integer rgKorrekturErlaubt(Long rgIdIn);

  public Integer schlussrechnungExistiert(Long kdvtIdIn);

  public Integer updAgentur(Long rgIdIn);

  public Integer updAuftraggeber(Long rgIdIn);
}
