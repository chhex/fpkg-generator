package com.apgsga.it21.mybatis.services.vk;

public interface KokoFPa {

  public void alleKokoFlzuLoeschen(Integer inKokoId);

  public void einzFlHinzuAddFlJf2(Integer inFlOid);

  public void einzFlHinzuClearJf1();

  public void einzFlHinzuJf3(
      Integer kokoIdIn, Integer anzFlAngefordert, Integer anzFlDurchgefuehrt);

  public void flLoeschenAddFlJf2(Integer inKfzId);

  public void flLoeschenClearJf1();

  public void flLoeschenJf3(Integer inKokoId);

  public void kokoFlzuCheckedHinzufuegen(
      Integer inKokoId, Integer outAngeforderte, Integer outDurchgefuehrte);

  public void kokoFlLoesen(Integer inKokoId);

  public void kokoKopieren(
      Integer kokoIdAlt,
      String bezeichnungIn,
      java.sql.Timestamp aushangBeginnIn,
      Integer aushangDauerIn,
      Integer ausgleichIn,
      Integer mitVerfuegbarkeitsabfrageIn,
      Integer anzahlFlGewuenscht,
      Integer anzahlFlErhalten);

  public void kokoMitKokokrsErstellen(Integer kokoIdIn, Integer kokoKrsId);
}
