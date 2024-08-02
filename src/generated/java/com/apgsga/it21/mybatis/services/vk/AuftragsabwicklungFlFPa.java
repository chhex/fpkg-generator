package com.apgsga.it21.mybatis.services.vk;

public interface AuftragsabwicklungFlFPa {

  public void flFreigeben1Init();

  public void flFreigeben2Add(Integer inAgpsFlZoId);

  public void flFreigeben3Check(
      Integer inAnnullieren, Integer inAgpsId, Integer inAgId, Integer inKdvtId);

  public void flFreigeben4Execute();
}
