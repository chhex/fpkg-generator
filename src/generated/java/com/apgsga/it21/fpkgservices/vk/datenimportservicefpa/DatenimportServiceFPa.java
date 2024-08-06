package com.apgsga.it21.fpkgservices.vk.datenimportservicefpa;

public interface DatenimportServiceFPa {

  public Integer agpsExportAllowed(java.util.List pAgpsIdList);

  public Integer agpsHatManUp(Long inAgpsId);

  public Integer checkLoExportErlaubt(Long inImpId);

  public void pruefeImportset(Long inImpId);

  public void sendeAnLogistik(Long inImpId);
}
