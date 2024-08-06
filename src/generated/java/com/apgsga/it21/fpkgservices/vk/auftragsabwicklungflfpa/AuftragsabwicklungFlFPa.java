package com.apgsga.it21.fpkgservices.vk.auftragsabwicklungflfpa;

public interface AuftragsabwicklungFlFPa {

  public void flFreigeben1Init();

  public void flFreigeben2Add(Long inAgpsFlZoId);

  public void flFreigeben3Check(Integer inAnnullieren, Long inAgpsId, Long inAgId, Long inKdvtId);

  public void flFreigeben4Execute();
}
