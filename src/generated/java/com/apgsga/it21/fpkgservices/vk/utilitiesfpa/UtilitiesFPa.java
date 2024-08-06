package com.apgsga.it21.fpkgservices.vk.utilitiesfpa;

public interface UtilitiesFPa {

  public Integer agpsGetAnnullKostenProz(Long agpsIdIn);

  public Integer agAnnullKostenpflichtigJf(Long agIdIn);

  public Integer agGetBeraterkommProzent(Long agIdIn, Integer kdvtBruttoIn);

  public String agGetIdText(Long agIdIn);

  public Integer agImAushangJf(Long agIdIn);

  public Integer agIsVisumspflichtigJf(Long agIdIn);

  public void agZahlungsmodusVekdvtUpdate(Long inAgId, Integer inZahlungsmodus);

  public Integer checkKurzfristigkeitJc(java.sql.Timestamp inaushangbeginn, String pDispoType);

  public java.sql.Timestamp getSonntagVonDatumswoche(java.sql.Timestamp dateIn);

  public String getVpEmailInfoblock(Long kdvtIdIn);

  public String getVpEmailSubject(Long kdvtIdIn);

  public Integer kdvtAkontorechnungPruefen(Long kdvtIdIn);

  public Integer kdvtAnnullKostenpflichtigJf(Long kdvtIdIn);

  public Integer kdvtCheckKsrVerbDigKamp(Long inKdvtId);

  public Integer kdvtHatNeueDirektbestDig(Long kdvtIdIn);

  public Integer kdvtImAushangJf(Long kdvtIdIn);

  public Integer kpgIstSwaAsaBerechtigt(Long pKdvtId, java.sql.Timestamp pInklAnnullationenNach);

  public Integer ngAntAusstrElntIdZ1(Long pElntId, java.sql.Timestamp pPer);

  public void setWerteValidRbatV(Long agatIdIn, Integer rbat1In, Integer rbat2In, Integer rbat3In);

  public String uploadLinkErstellenFunktion(Long inKdvtId);
}
