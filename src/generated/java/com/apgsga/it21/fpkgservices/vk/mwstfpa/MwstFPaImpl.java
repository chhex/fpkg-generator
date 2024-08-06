package com.apgsga.it21.fpkgservices.vk.mwstfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class MwstFPaImpl implements MwstFPa {

  private final DataAccessFacade dataAccessFacade;

  public MwstFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void vpMwstErmitteln(
      Long pKdvtId,
      boolean pNurResLeist,
      String pMwst1Sap,
      String pMwst1Text,
      java.sql.Timestamp pMwst1Beginn,
      java.sql.Timestamp pMwst1Ende,
      Integer pMwst1Basis,
      Integer pMwst1Satz,
      Integer pMwst1Betrag,
      String pMwst2Sap,
      String pMwst2Text,
      java.sql.Timestamp pMwst2Beginn,
      java.sql.Timestamp pMwst2Ende,
      Integer pMwst2Basis,
      Integer pMwst2Satz,
      Integer pMwst2Betrag) {

    Map<String, Object> parameters = new HashMap<>();
    parameters.put("P_KDVT_ID", pKdvtId);
    parameters.put("P_NUR_RES_LEIST", pNurResLeist);
    parameters.put("P_MWST1_SAP", pMwst1Sap);
    parameters.put("P_MWST1_TEXT", pMwst1Text);
    parameters.put("P_MWST1_BEGINN", pMwst1Beginn);
    parameters.put("P_MWST1_ENDE", pMwst1Ende);
    parameters.put("P_MWST1_BASIS", pMwst1Basis);
    parameters.put("P_MWST1_SATZ", pMwst1Satz);
    parameters.put("P_MWST1_BETRAG", pMwst1Betrag);
    parameters.put("P_MWST2_SAP", pMwst2Sap);
    parameters.put("P_MWST2_TEXT", pMwst2Text);
    parameters.put("P_MWST2_BEGINN", pMwst2Beginn);
    parameters.put("P_MWST2_ENDE", pMwst2Ende);
    parameters.put("P_MWST2_BASIS", pMwst2Basis);
    parameters.put("P_MWST2_SATZ", pMwst2Satz);
    parameters.put("P_MWST2_BETRAG", pMwst2Betrag);
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.mwstfpa.vp_mwst_ermitteln", parameters);
  }
}
