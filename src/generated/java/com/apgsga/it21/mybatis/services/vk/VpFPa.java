package com.apgsga.it21.mybatis.services.vk;

public interface VpFPa {

  public void anlieferterminPlakat(
      Integer inKdvtId,
      Integer inAgpsArt,
      Integer inAbwicklungSubjOid,
      String inSujet,
      java.sql.Timestamp inAushangBeginn);

  public void anzahlSpaltenRekap();

  public void createSprDigital(Integer inKdvtdokId);

  public void erstellenKdvtdokRecords(
      Integer inKdvtId,
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

  public void erstellenVpdsaRecords(Integer inKdvtId, Integer inKdvtdokId);

  public void istKommraumFlughaefenInt(Integer inKdvtId);

  public void kdvtErstellenVerkaufspapiere(Integer kdvtIdIn, Integer vkPapDruckenOut);

  public void loeschenVpdsaRecords(Integer inKdvtId, Integer inKdvtdokId);

  public void preisermittlung(Integer pKdvtIdIn);

  public void updKommraumBergeInt(Integer inKdvtId);
}
