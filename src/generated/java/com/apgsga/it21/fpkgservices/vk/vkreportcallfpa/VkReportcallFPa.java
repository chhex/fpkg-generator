package com.apgsga.it21.fpkgservices.vk.vkreportcallfpa;

public interface VkReportcallFPa {

  public Integer ausstrahlungsnachweis(
      String benutzerIn, java.util.List kdvtIdIn, String kdvtIdStringIn, Integer dachKampagneJnIn);

  public Integer ausstrahlungsnachweisJf(
      String benutzerIn, String kdvtIdStringIn, Integer dachKampagneJnIn);
}
