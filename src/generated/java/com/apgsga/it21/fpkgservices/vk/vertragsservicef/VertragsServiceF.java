package com.apgsga.it21.fpkgservices.vk.vertragsservicef;

public interface VertragsServiceF {
  public java.sql.Timestamp getVgAushangtagWennAnnulliert(
      Long inFlOid, java.sql.Timestamp inAushangVon, Long inAgpsId);

  public void kuendenVertragOderAgps(
      Long pKvlfIdIn,
      Long pAgpsIdIn,
      java.sql.Timestamp pKuendigungsdatumIn,
      java.sql.Timestamp pVertragsEndeIn,
      Long pAngrIdIn,
      Long pErsatzFlOidIn,
      Integer pKuendigungstyp);

  public void setVertragsEndeUndAufhebenBindungen(Long inKvlfId);

  public void verlaengernVertrag(Long inKvlfId);

  public void verschiebenVertrag(Long inKvlfId, Integer inWochen);
}
