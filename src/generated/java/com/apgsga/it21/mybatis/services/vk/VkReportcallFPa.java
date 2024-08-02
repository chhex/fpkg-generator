package com.apgsga.it21.mybatis.services.vk;

public interface VkReportcallFPa {

  public void ausstrahlungsnachweis(
      String benutzerIn, java.util.List kdvtIdIn, String kdvtIdStringIn, Integer dachKampagneJnIn);

  public void ausstrahlungsnachweisJf(
      String benutzerIn, String kdvtIdStringIn, Integer dachKampagneJnIn);
}
