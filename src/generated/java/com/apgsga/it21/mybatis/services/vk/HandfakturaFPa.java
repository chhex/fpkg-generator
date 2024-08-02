package com.apgsga.it21.mybatis.services.vk;

public interface HandfakturaFPa {

  public void neueHandfaktura(
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

  public void neueHandfakturaPos(
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
