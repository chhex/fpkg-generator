package com.apgsga.it21.fpkgservices.vk.handfakturafpa;

public interface HandfakturaFPa {

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
      String pTextNachRechnung);

  public Integer neueHandfakturaPos(
      Long pHfaId,
      Long pLdpaId,
      String pBeschreibung,
      Integer pAnzahl,
      Integer pStueckpreis,
      java.sql.Timestamp pLeistungsdatum,
      Long pLdLogistikSubjOid,
      Long pAkquOeSubjOid);

  public void rechnungBearbeiten(Long hfaIdIn);

  public void rechnungErstellen(Long hfaIdIn);

  public void rechnungFreigeben(Long hfaIdIn);

  public void rechnungStornieren(Long hfaIdIn);
}
