package com.apgsga.it21.fpkgservices.vk.enkundevertraegelf;

public interface EnKundeVertraegeLF {
  public Integer getReservationsart(Long pKdvtId);

  public Integer istKommraumBergeInt(Long inKdvtId);

  public Integer istSwaBerechtigt(Long pKdvtIdIn);
}
