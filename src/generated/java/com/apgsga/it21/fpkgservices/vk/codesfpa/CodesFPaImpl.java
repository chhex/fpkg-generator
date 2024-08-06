package com.apgsga.it21.fpkgservices.vk.codesfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class CodesFPaImpl implements CodesFPa {

  private final DataAccessFacade dataAccessFacade;

  public CodesFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer agatTraffAg() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.agat_traff_ag#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agatTraffDum() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.agat_traff_dum#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agpsVfzReserviert() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.agps_vfz_reserviert", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agVebeneAg() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>)
        dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.codesfpa.ag_vebene_ag#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agVebeneKdvt() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.ag_vebene_kdvt#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer blockiertBisOffset() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.blockiert_bis_offset#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer leitwaehrungMandantCode() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.leitwaehrung_mandant_code#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer rgatAkonto() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>)
        dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.codesfpa.rgat_akonto#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusAgpsAnnulliert() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_agps_annulliert#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusAgpsInErfassung() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_agps_in_erfassung#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusKdvtAnnulliert() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_kdvt_annulliert#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusKdvtInBearbeitung() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_kdvt_in_bearbeitung#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgAbgeschlAusgegl() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_abgeschl_ausgegl#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgAbgeschlNGestellt() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_abgeschl_n_gestellt#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgGestelltOffen() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_gestellt_offen#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgKorrektur() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_korrektur#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgProvisorisch() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_provisorisch#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer statusRgVorbereitet() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.status_rg_vorbereitet#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public String typeRgKundenrechnung() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.type_rg_kundenrechnung#", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer zahlungNachAushang() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.zahlung_nach_aushang#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer zahlungVorAushang() {
    Map<String, Object> parameters = new HashMap<>();
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.codesfpa.zahlung_vor_aushang#", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }
}
