package com.apgsga.it21.mybatis.services.vk;

public interface KokoFPa {

  public void alleKokoFlzuLoeschen(Long inKokoId);

  public void einzFlHinzuAddFlJf2(Long inFlOid);

  public void einzFlHinzuClearJf1();

  public void einzFlHinzuJf3(Long kokoIdIn, Integer anzFlAngefordert, Integer anzFlDurchgefuehrt);

  public void flLoeschenAddFlJf2(Long inKfzId);

  public void flLoeschenClearJf1();

  public void flLoeschenJf3(Long inKokoId);

  public void kokoFlzuCheckedHinzufuegen(
      Long inKokoId, Integer outAngeforderte, Integer outDurchgefuehrte);

  public void kokoFlLoesen(Long inKokoId);

  public void kokoKopieren(
      Long kokoIdAlt,
      String bezeichnungIn,
      java.sql.Timestamp aushangBeginnIn,
      Integer aushangDauerIn,
      Integer ausgleichIn,
      Integer mitVerfuegbarkeitsabfrageIn,
      Integer anzahlFlGewuenscht,
      Integer anzahlFlErhalten);

  public void kokoMitKokokrsErstellen(Long kokoIdIn, Long kokoKrsId);
}
