package com.apgsga.it21.mybatis.services.vk;

public interface SprBewertungFPa {

  public void addGebiet(Integer inGbotOid);

  public void checkKpEndMitWelbeg(java.util.List kdvtIdids, java.sql.Timestamp wellenbeginn);

  public void clearGebiete();

  public void clearParameter();

  public void createKdvtSprBewertung(Integer inKdvtId);

  public void createKrsSprBewertung(Integer inKdvtId, Integer inKrsId);

  public void getTotalEffBew(
      Integer inNchrtId,
      Integer outAnzGebFl,
      Integer outAnzBewFl,
      Integer outRwe,
      Integer outOts,
      Integer outSumPkITsd,
      Integer outgrp,
      Integer inKontaktklasse);

  public void sprBewertungAnPpi(Integer inKsbId);

  public void sprBewertungAusfuehrenJui(Integer inKsbId, Integer inPpiBewertung);

  public void sprBewertungReset(Integer outKsbId);

  public void sprPpiBewertungAusfuehren(Integer inPpiKpId, Integer inKontaktklassen);
}
