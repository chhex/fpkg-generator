package com.apgsga.it21.fpkgservices.vk.sprbewertungfpa;

public interface SprBewertungFPa {

  public void addGebiet(Long inGbotOid);

  public Integer checkKpEndMitWelbeg(java.util.List kdvtIdids, java.sql.Timestamp wellenbeginn);

  public void clearGebiete();

  public void clearParameter();

  public Integer createKdvtSprBewertung(Long inKdvtId);

  public Integer createKrsSprBewertung(Long inKdvtId, Long inKrsId);

  public void getTotalEffBew(
      Long inNchrtId,
      Integer outAnzGebFl,
      Integer outAnzBewFl,
      Integer outRwe,
      Integer outOts,
      Integer outSumPkITsd,
      Integer outgrp,
      Integer inKontaktklasse);

  public void sprBewertungAnPpi(Long inKsbId);

  public void sprBewertungAusfuehrenJui(Long inKsbId, Integer inPpiBewertung);

  public void sprBewertungReset(Long outKsbId);

  public void sprPpiBewertungAusfuehren(Long inPpiKpId, Integer inKontaktklassen);
}
