package com.apgsga.it21.mybatis.services.vk;

public interface VisierungFPa {

  public void istVbeVisumPflichtig(Long piAgId);

  public void testIstVisumPflichtig(Long piAgId);

  public void visaAblehnen(Long inAgId, Long inVisId);

  public void visaAkzeptieren(Long inAgId, Long inVisId);
}
