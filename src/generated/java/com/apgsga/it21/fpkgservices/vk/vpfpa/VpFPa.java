package com.apgsga.it21.fpkgservices.vk.vpfpa;

public interface VpFPa {

  public String anlieferterminPlakat(
      Long inKdvtId,
      Integer inAgpsArt,
      Long inAbwicklungSubjOid,
      String inSujet,
      java.sql.Timestamp inAushangBeginn);

  public Integer anzahlSpaltenRekap();

  public void createSprDigital(Long inKdvtdokId);

  public void erstellenKdvtdokRecords(
      Long inKdvtId,
      Integer inSortWemf,
      Integer inDokumentFormat,
      String inDruckerAlias,
      Integer inAnzExemplare,
      Integer inMitRekapitulation,
      Integer inMitVerteilungPlan,
      Integer inMitAdressliste,
      Integer inMitSprBewertung,
      Integer inMitSprXmlDatei,
      Integer inMitWmBedarf,
      Integer inMitShortcutFs,
      Integer inMitAusstrahlungsplan,
      Integer inDirektdruck,
      Integer inVpTypTraffic,
      Integer inDrucksteuerungTraffic,
      Integer inSprXmlOptJn,
      Integer inIsMyapgsgaErlaubt,
      Integer inNurBrutto,
      Integer inMitKontaktwert,
      Integer inDrucklayout,
      Integer outVkPapDrucken);

  public void erstellenVpdsaRecords(Long inKdvtId, Long inKdvtdokId);

  public Integer istKommraumFlughaefenInt(Long inKdvtId);

  public void kdvtErstellenVerkaufspapiere(Long kdvtIdIn, Integer vkPapDruckenOut);

  public void loeschenVpdsaRecords(Long inKdvtId, Long inKdvtdokId);

  public void preisermittlung(Long pKdvtIdIn);

  public Integer updKommraumBergeInt(Long inKdvtId);
}
