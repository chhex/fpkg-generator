package com.apgsga.it21.mybatis.services.vk;

public interface HandfakturaFPa {

  public void neueHandfaktura(
      Integer pAtgebId,
      Integer pAtgebKontaktSubjOid,
      Integer pAgenturSubjOid,
      Integer pAgenturKontaktSubjOid,
      Integer pRechnEmpfSubjOid,
      Integer pVkoeOid,
      Integer pVkberOid,
      String pReferenz,
      String pMemoNotiz,
      String pTextVorRechnung,
      String pTextNachRechnung);

  public void neueHandfakturaPos(
      Integer pHfaId,
      Integer pLdpaId,
      String pBeschreibung,
      Integer pAnzahl,
      Integer pStueckpreis,
      java.sql.Timestamp pLeistungsdatum,
      Integer pLdLogistikSubjOid,
      Integer pAkquOeSubjOid);

  public void rechnungBearbeiten(Integer hfaIdIn);

  public void rechnungErstellen(Integer hfaIdIn);

  public void rechnungFreigeben(Integer hfaIdIn);

  public void rechnungStornieren(Integer hfaIdIn);
}
