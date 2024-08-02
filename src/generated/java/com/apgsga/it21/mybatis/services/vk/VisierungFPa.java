package com.apgsga.it21.mybatis.services.vk;

public interface VisierungFPa {

  public void istVbeVisumPflichtig(Integer piAgId);

  public void testIstVisumPflichtig(Integer piAgId);

  public void visaAblehnen(Integer inAgId, Integer inVisId);

  public void visaAkzeptieren(Integer inAgId, Integer inVisId);
}
