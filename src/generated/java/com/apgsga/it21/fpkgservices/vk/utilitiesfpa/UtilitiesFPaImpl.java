package com.apgsga.it21.fpkgservices.vk.utilitiesfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class UtilitiesFPaImpl implements UtilitiesFPa {

  private final DataAccessFacade dataAccessFacade;

  public UtilitiesFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public Integer agpsGetAnnullKostenProz(Long agpsIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGPS_ID_IN", agpsIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.agps_get_annull_kosten_proz", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agAnnullKostenpflichtigJf(Long agIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_annull_kostenpflichtig_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agGetBeraterkommProzent(Long agIdIn, Integer kdvtBruttoIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    parameters.put("KDVT_BRUTTO_IN", kdvtBruttoIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_get_beraterkomm_prozent", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public String agGetIdText(Long agIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_get_id_text", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agImAushangJf(Long agIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_im_aushang_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer agIsVisumspflichtigJf(Long agIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AG_ID_IN", agIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_is_visumspflichtig_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void agZahlungsmodusVekdvtUpdate(Long inAgId, Integer inZahlungsmodus) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_AG_ID", inAgId);
    parameters.put("IN_ZAHLUNGSMODUS", inZahlungsmodus);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ag_zahlungsmodus_vekdvt_update", parameters);
  }

  @Override
  public Integer checkKurzfristigkeitJc(java.sql.Timestamp inaushangbeginn, String pDispoType) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("INAUSHANGBEGINN", inaushangbeginn);
    parameters.put("P_DISPO_TYPE", pDispoType);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.check_kurzfristigkeit_jc", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public java.sql.Timestamp getSonntagVonDatumswoche(java.sql.Timestamp dateIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("DATE_IN", dateIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.get_sonntag_von_datumswoche", parameters);
    return (java.sql.Timestamp) returnParameterMap.get("RESULT");
  }

  @Override
  public String getVpEmailInfoblock(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.get_vp_email_infoblock", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public String getVpEmailSubject(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.get_vp_email_subject", parameters);
    return (String) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kdvtAkontorechnungPruefen(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kdvt_akontorechnung_pruefen", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kdvtAnnullKostenpflichtigJf(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kdvt_annull_kostenpflichtig_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kdvtCheckKsrVerbDigKamp(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kdvt_check_ksr_verb_dig_kamp", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kdvtHatNeueDirektbestDig(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kdvt_hat_neue_direktbest_dig", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kdvtImAushangJf(Long kdvtIdIn) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("KDVT_ID_IN", kdvtIdIn);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kdvt_im_aushang_jf", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer kpgIstSwaAsaBerechtigt(Long pKdvtId, java.sql.Timestamp pInklAnnullationenNach) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID", pKdvtId);
    parameters.put("P_INKL_ANNULLATIONEN_NACH", pInklAnnullationenNach);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.kpg_ist_swa_asa_berechtigt", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public Integer ngAntAusstrElntIdZ1(Long pElntId, java.sql.Timestamp pPer) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_ELNT_ID", pElntId);
    parameters.put("P_PER", pPer);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.ng_ant_ausstr_elnt_id_z1", parameters);
    return (Integer) returnParameterMap.get("RESULT");
  }

  @Override
  public void setWerteValidRbatV(Long agatIdIn, Integer rbat1In, Integer rbat2In, Integer rbat3In) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("AGAT_ID_IN", agatIdIn);
    parameters.put("RBAT1_IN", rbat1In);
    parameters.put("RBAT2_IN", rbat2In);
    parameters.put("RBAT3_IN", rbat3In);
    dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.set_werte_valid_rbat_v", parameters);
  }

  @Override
  public String uploadLinkErstellenFunktion(Long inKdvtId) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("IN_KDVT_ID", inKdvtId);
    @SuppressWarnings("unchecked")
    Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade.call(
        "com.apgsga.it21.fpkgservices.vk.utilitiesfpa.upload_link_erstellen_funktion", parameters);
    return (String) returnParameterMap.get("RESULT");
  }
}
