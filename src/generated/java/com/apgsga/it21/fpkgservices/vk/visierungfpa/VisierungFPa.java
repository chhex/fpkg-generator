package com.apgsga.it21.fpkgservices.vk.visierungfpa;

public interface VisierungFPa {

  public Integer istVbeVisumPflichtig(Long piAgId);

  public Integer testIstVisumPflichtig(Long piAgId);

  public void visaAblehnen(Long inAgId, Long inVisId);

  public void visaAkzeptieren(Long inAgId, Long inVisId);
}
