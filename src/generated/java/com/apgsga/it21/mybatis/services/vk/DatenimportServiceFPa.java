package com.apgsga.it21.mybatis.services.vk;

public interface DatenimportServiceFPa {

  public void agpsExportAllowed(java.util.List pAgpsIdList);

  public void agpsHatManUp(Integer inAgpsId);

  public void checkLoExportErlaubt(Integer inImpId);

  public void pruefeImportset(Integer inImpId);

  public void sendeAnLogistik(Integer inImpId);
}
