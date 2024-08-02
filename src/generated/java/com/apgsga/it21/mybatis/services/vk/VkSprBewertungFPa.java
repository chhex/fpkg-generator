package com.apgsga.it21.mybatis.services.vk;

public interface VkSprBewertungFPa {

  public void clearGebiete();

  public void clearParameter();

  public void createKdvtSprBewertung(Integer inKdvtId);

  public void getTotalEffBew(
      Integer inNchrtId,
      Integer outAnzGebFl,
      Integer outAnzBewFl,
      Integer outRwe,
      Integer outOts,
      Integer outSumPkITsd,
      Integer outgrp,
      Integer inKontaktklasse);

  public void sprBewertungAusfuehrenJui(Integer inKsbId, Integer inPpiBewertung);
}
