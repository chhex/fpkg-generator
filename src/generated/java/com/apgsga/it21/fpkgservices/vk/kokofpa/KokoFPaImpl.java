package com.apgsga.it21.fpkgservices.vk.kokofpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class KokoFPaImpl implements KokoFPa {

  private final DataAccessFacade dataAccessFacade;

  public KokoFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer alleKokoFlzuLoeschen(Long inKokoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KOKO_ID", inKokoId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.alle_koko_flzu_loeschen", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void einzFlHinzuAddFlJf2(Long inFlOid) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_FL_OID", inFlOid);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.einz_fl_hinzu_add_fl_jf2", parameters);
  }

  @Override
  public void einzFlHinzuClearJf1() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.einz_fl_hinzu_clear_jf1", parameters);
  }

  @Override
  public void einzFlHinzuJf3(Long kokoIdIn, Integer anzFlAngefordert, Integer anzFlDurchgefuehrt) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KOKO_ID_IN", kokoIdIn);
    parameters.put("ANZ_FL_ANGEFORDERT", anzFlAngefordert);
    parameters.put("ANZ_FL_DURCHGEFUEHRT", anzFlDurchgefuehrt);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.kokofpa.einz_fl_hinzu_jf3", parameters);
  }

  @Override
  public void flLoeschenAddFlJf2(Long inKfzId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KFZ_ID", inKfzId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.fl_loeschen_add_fl_jf2", parameters);
  }

  @Override
  public void flLoeschenClearJf1() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.fl_loeschen_clear_jf1", parameters);
  }

  @Override
  public Integer flLoeschenJf3(Long inKokoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KOKO_ID", inKokoId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.fl_loeschen_jf3", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void kokoFlzuCheckedHinzufuegen(
      Long inKokoId, Integer outAngeforderte, Integer outDurchgefuehrte) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KOKO_ID", inKokoId);
    parameters.put("OUT_ANGEFORDERTE", outAngeforderte);
    parameters.put("OUT_DURCHGEFUEHRTE", outDurchgefuehrte);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.koko_flzu_checked_hinzufuegen", parameters);
  }

  @Override
  public void kokoFlLoesen(Long inKokoId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KOKO_ID", inKokoId);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.kokofpa.koko_fl_loesen", parameters);
  }

  @Override
  public void kokoKopieren(
      Long kokoIdAlt,
      String bezeichnungIn,
      java.sql.Timestamp aushangBeginnIn,
      Integer aushangDauerIn,
      Integer ausgleichIn,
      Integer mitVerfuegbarkeitsabfrageIn,
      Integer anzahlFlGewuenscht,
      Integer anzahlFlErhalten) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KOKO_ID_ALT", kokoIdAlt);
    parameters.put("BEZEICHNUNG_IN", bezeichnungIn);
    parameters.put("AUSHANG_BEGINN_IN", aushangBeginnIn);
    parameters.put("AUSHANG_DAUER_IN", aushangDauerIn);
    parameters.put("AUSGLEICH_IN", ausgleichIn);
    parameters.put("MIT_VERFUEGBARKEITSABFRAGE_IN", mitVerfuegbarkeitsabfrageIn);
    parameters.put("ANZAHL_FL_GEWUENSCHT", anzahlFlGewuenscht);
    parameters.put("ANZAHL_FL_ERHALTEN", anzahlFlErhalten);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.kokofpa.koko_kopieren", parameters);
  }

  @Override
  public void kokoMitKokokrsErstellen(Long kokoIdIn, Long kokoKrsId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KOKO_ID_IN", kokoIdIn);
    parameters.put("KOKO_KRS_ID", kokoKrsId);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.kokofpa.koko_mit_kokokrs_erstellen", parameters);
  }
}
