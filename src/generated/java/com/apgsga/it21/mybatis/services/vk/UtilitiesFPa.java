package com.apgsga.it21.mybatis.services.vk;

public interface UtilitiesFPa {

  public void agpsGetAnnullKostenProz(Integer agpsIdIn);

  public void agAnnullKostenpflichtigJf(Integer agIdIn);

  public void agGetBeraterkommProzent(Integer agIdIn, Integer kdvtBruttoIn);

  public void agGetIdText(Integer agIdIn);

  public void agImAushangJf(Integer agIdIn);

  public void agIsVisumspflichtigJf(Integer agIdIn);

  public void agZahlungsmodusVekdvtUpdate(Integer inAgId, Integer inZahlungsmodus);

  public void checkKurzfristigkeitJc(java.sql.Timestamp inaushangbeginn, String pDispoType);

  public void getSonntagVonDatumswoche(java.sql.Timestamp dateIn);

  public void getVpEmailInfoblock(Integer kdvtIdIn);

  public void getVpEmailSubject(Integer kdvtIdIn);

  public void kdvtAkontorechnungPruefen(Integer kdvtIdIn);

  public void kdvtAnnullKostenpflichtigJf(Integer kdvtIdIn);

  public void kdvtCheckKsrVerbDigKamp(Integer inKdvtId);

  public void kdvtHatNeueDirektbestDig(Integer kdvtIdIn);

  public void kdvtImAushangJf(Integer kdvtIdIn);

  public void kpgIstSwaAsaBerechtigt(Integer pKdvtId, java.sql.Timestamp pInklAnnullationenNach);

  public void ngAntAusstrElntIdZ1(Integer pElntId, java.sql.Timestamp pPer);

  public void setWerteValidRbatV(
      Integer agatIdIn, Integer rbat1In, Integer rbat2In, Integer rbat3In);

  public void uploadLinkErstellenFunktion(Integer inKdvtId);
}
