package com.apgsga.it21.mybatis.services.vk;

public interface DgfxBuchungsablaufFPa {

  public void agpsBuchen(
      java.util.List pAgpsIds, Integer pMitWarteliste, Integer pKompensationGleicheNg);

  public void agpsTerminieren(java.util.List inAgpsIds, java.sql.Timestamp inAushangBis);

  public void auftragMitAgpsVerbinden(Long pAgId, java.util.List pAgpsIds);

  public void autofueller(java.util.List inAgpsIds, Integer inAutofuellerArt);

  public void autoFuellerErlaubt(Long inKrsId);

  public void checkKrsAgBranchenVertr(Long inAgId, Long inKrsId);

  public void checkKrsAgVkoeVertr(Long inAgId, Long inKrsId);

  public void checkNgBranchenVkoeVertr(
      Long inNgId,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIdorids,
      Long inVkoeOid,
      Long inSubjOid);

  public void deleteKrs(java.util.List inKrsIds, java.util.List inAgpsIds);

  public void erstellenTzsVonVki(java.util.List pKrsIds);

  public void filterNgBranchenVkoe(
      java.util.List inNgIds,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIds,
      Long inVkoeOid,
      Long inSubjOidRestrkAusnahme,
      java.util.List outFilteredNgIds);

  public void getDglBruttopreisNetz(String inParametersXml);

  public void loescheKrsAgps(java.util.List inKrsIds, java.util.List inAgpsIds);

  public void netzAushangtagAbDatum(
      Long pNtgrotoid,
      java.sql.Timestamp pDatumVon,
      java.sql.Timestamp pAushangtag,
      Integer pAushangTakt);

  public void ngSuche(
      java.sql.Timestamp pAushangBeginn,
      Integer pAushangDauer,
      Integer pMediumLaenge,
      Long pVkoeOid,
      java.util.List pBrcIdL,
      Long pRkAusnahmeSubjOid,
      Long pNkId,
      java.util.List pPfIdL,
      java.util.List pEinGbotOidL,
      java.util.List pAusGbotOidL,
      java.util.List pObjOidL);

  public void reservation(
      Long pKrsId,
      Long pVorschlagId,
      Long pVerteilungartId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId);

  public void reservationXorVorschlag(
      Long pKrsId,
      Integer pIstReservation,
      Long ioVorschlagId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId);

  public void vorschlag(
      Long pKrsId,
      Long pVerteilungartId,
      Long oVorschlagId,
      String oDgfxVgResultatDetailXml,
      Long oAgpsId);

  public void wartelisteAgpsEinloesen(java.util.List agpsIdsIn);
}
