package com.apgsga.it21.mybatis.services.vk;

public interface VerrechenbarkeitFPa {

  public void agpsFlzoLeistVerrechnen(Integer aflstIdIn, Integer verrechnungIn);

  public void agpsLeistVerrechnen(Integer agpslstIdIn, Integer verrechnungIn);

  public void diskrepanzVisieren(Integer aflstIdIn, String begruendungIn);

  public void initialesFeedbackSetzen(Integer aflstIdIn);

  public void visumZuruecksetzen(Integer aflstIdIn);
}
