package com.apgsga.it21.mybatis.services.vk;

public interface MwstFPa {

  public void vpMwstErmitteln(
      Integer pKdvtId,
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
      Integer pMwst2Betrag);
}
