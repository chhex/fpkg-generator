package com.apgsga.it21.fpkgservices.vk.buchungkriteriensatzservicef;

public interface BuchungKriteriensatzServiceF {
  public void checkedFreigeben(Long inAgpsId);

  public void checkedReservieren(
      Long inAgpsId, Integer inStatus, Integer outAngeforderte, Integer outDurchgefuehrte);

  public void dobeFreigeben(Long inAgpsId, Long inFlOid);

  public void ermittelnVerfuegbareFlaechen(
      Long inKrsId, Long inAgpsId, Integer inModus, Long inAnfrId);

  public void exitInstance();

  public void reserviereEflJf(Long inAgpsId);
}
