package com.apgsga.it21.fpkgservices.vk.verrechenbarkeitfpa;

public interface VerrechenbarkeitFPa {

  public void agpsFlzoLeistVerrechnen(Long aflstIdIn, Integer verrechnungIn);

  public void agpsLeistVerrechnen(Long agpslstIdIn, Integer verrechnungIn);

  public void diskrepanzVisieren(Long aflstIdIn, String begruendungIn);

  public void initialesFeedbackSetzen(Long aflstIdIn);

  public void visumZuruecksetzen(Long aflstIdIn);
}
