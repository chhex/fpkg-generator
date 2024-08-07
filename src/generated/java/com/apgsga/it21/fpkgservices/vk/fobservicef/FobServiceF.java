package com.apgsga.it21.fpkgservices.vk.fobservicef;

public interface FobServiceF {
  public void clearkrs(Long inKrsId);

  public void entfernen(Integer inFlzoOpt);

  public Integer flBrancheVertraegelich(
      Long inFlOid,
      Long inBrcIdL,
      java.sql.Timestamp inAushangVon,
      Integer inAushangDauer,
      Long inSubjOid);

  public void getPreise(
      Long inFlOid,
      java.sql.Timestamp inAushangBeginn,
      Integer inAushangDauer,
      Integer outMedienleistung,
      Integer outProduktion,
      Integer outMontage,
      Integer outGebuehren);

  public void optionZumEinloesen(Long inAgpsFlZoId);

  public void reservieren(
      Long inAtgebId,
      Long inAgenturSubjOid,
      Long inKrsId,
      Long inKdvtId,
      Long inAgId,
      Integer inAgpsArt);

  public Integer setDisplayPar(
      Long inFlOid,
      java.sql.Timestamp inAushangVon,
      java.sql.Timestamp inAushangBis,
      Integer inInterval);
}
