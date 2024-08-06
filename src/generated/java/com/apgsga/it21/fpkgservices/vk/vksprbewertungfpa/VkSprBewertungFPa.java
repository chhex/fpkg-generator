package com.apgsga.it21.fpkgservices.vk.vksprbewertungfpa;

public interface VkSprBewertungFPa {

  public void clearGebiete();

  public void clearParameter();

  public Integer createKdvtSprBewertung(Long inKdvtId);

  public void getTotalEffBew(
      Long inNchrtId,
      Integer outAnzGebFl,
      Integer outAnzBewFl,
      Integer outRwe,
      Integer outOts,
      Integer outSumPkITsd,
      Integer outgrp,
      Integer inKontaktklasse);

  public void sprBewertungAusfuehrenJui(Long inKsbId, Integer inPpiBewertung);
}
