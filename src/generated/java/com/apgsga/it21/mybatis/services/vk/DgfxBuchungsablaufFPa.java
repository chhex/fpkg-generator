package com.apgsga.it21.mybatis.services.vk;

public interface DgfxBuchungsablaufFPa {

  public void agpsBuchen(
      java.util.List pAgpsIds, Integer pMitWarteliste, Integer pKompensationGleicheNg);

  public void agpsTerminieren(java.util.List inAgpsIds, java.sql.Timestamp inAushangBis);

  public void auftragMitAgpsVerbinden(Integer pAgId, java.util.List pAgpsIds);

  public void autofueller(java.util.List inAgpsIds, Integer inAutofuellerArt);

  public void autoFuellerErlaubt(Integer inKrsId);

  public void checkKrsAgBranchenVertr(Integer inAgId, Integer inKrsId);

  public void checkKrsAgVkoeVertr(Integer inAgId, Integer inKrsId);

  public void checkNgBranchenVkoeVertr(
      Integer inNgId,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIdorids,
      Integer inVkoeOid,
      Integer inSubjOid);

  public void deleteKrs(java.util.List inKrsIds, java.util.List inAgpsIds);

  public void erstellenTzsVonVki(java.util.List pKrsIds);

  public void filterNgBranchenVkoe(
      java.util.List inNgIds,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      java.util.List inBrcIds,
      Integer inVkoeOid,
      Integer inSubjOidRestrkAusnahme,
      java.util.List outFilteredNgIds);

  public void getDglBruttopreisNetz(String inParametersXml);

  public void loescheKrsAgps(java.util.List inKrsIds, java.util.List inAgpsIds);

  public void netzAushangtagAbDatum(
      Integer pNtgrotoid,
      java.sql.Timestamp pDatumVon,
      java.sql.Timestamp pAushangtag,
      Integer pAushangTakt);

  public void ngSuche(
      java.sql.Timestamp pAushangBeginn,
      Integer pAushangDauer,
      Integer pMediumLaenge,
      Integer pVkoeOid,
      java.util.List pBrcIdL,
      Integer pRkAusnahmeSubjOid,
      Integer pNkId,
      java.util.List pPfIdL,
      java.util.List pEinGbotOidL,
      java.util.List pAusGbotOidL,
      java.util.List pObjOidL);

  public void reservation(
      Integer pKrsId,
      Integer pVorschlagId,
      Integer pVerteilungartId,
      String oDgfxVgResultatDetailXml,
      Integer oAgpsId);

  public void reservationXorVorschlag(
      Integer pKrsId,
      Integer pIstReservation,
      Integer ioVorschlagId,
      String oDgfxVgResultatDetailXml,
      Integer oAgpsId);

  public void vorschlag(
      Integer pKrsId,
      Integer pVerteilungartId,
      Integer oVorschlagId,
      String oDgfxVgResultatDetailXml,
      Integer oAgpsId);

  public void wartelisteAgpsEinloesen(java.util.List agpsIdsIn);
}
