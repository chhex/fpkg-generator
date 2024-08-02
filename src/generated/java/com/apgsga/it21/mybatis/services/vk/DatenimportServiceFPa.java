package com.apgsga.it21.mybatis.services.vk;

public interface DatenimportServiceFPa {

  public void agpsExportAllowed(java.util.List pAgpsIdList);

  public void agpsHatManUp(Long inAgpsId);

  public void checkLoExportErlaubt(Long inImpId);

  public void pruefeImportset(Long inImpId);

  public void sendeAnLogistik(Long inImpId);
}
