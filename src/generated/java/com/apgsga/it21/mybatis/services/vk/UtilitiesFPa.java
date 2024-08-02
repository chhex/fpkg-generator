package com.apgsga.it21.mybatis.services.vk;

public interface UtilitiesFPa {

  public void agpsGetAnnullKostenProz(Long agpsIdIn);

  public void agAnnullKostenpflichtigJf(Long agIdIn);

  public void agGetBeraterkommProzent(Long agIdIn, Integer kdvtBruttoIn);

  public void agGetIdText(Long agIdIn);

  public void agImAushangJf(Long agIdIn);

  public void agIsVisumspflichtigJf(Long agIdIn);

  public void agZahlungsmodusVekdvtUpdate(Long inAgId, Integer inZahlungsmodus);

  public void checkKurzfristigkeitJc(java.sql.Timestamp inaushangbeginn, String pDispoType);

  public void getSonntagVonDatumswoche(java.sql.Timestamp dateIn);

  public void getVpEmailInfoblock(Long kdvtIdIn);

  public void getVpEmailSubject(Long kdvtIdIn);

  public void kdvtAkontorechnungPruefen(Long kdvtIdIn);

  public void kdvtAnnullKostenpflichtigJf(Long kdvtIdIn);

  public void kdvtCheckKsrVerbDigKamp(Long inKdvtId);

  public void kdvtHatNeueDirektbestDig(Long kdvtIdIn);

  public void kdvtImAushangJf(Long kdvtIdIn);

  public void kpgIstSwaAsaBerechtigt(Long pKdvtId, java.sql.Timestamp pInklAnnullationenNach);

  public void ngAntAusstrElntIdZ1(Long pElntId, java.sql.Timestamp pPer);

  public void setWerteValidRbatV(Long agatIdIn, Integer rbat1In, Integer rbat2In, Integer rbat3In);

  public void uploadLinkErstellenFunktion(Long inKdvtId);
}
