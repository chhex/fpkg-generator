package com.apgsga.it21.fpkgservices.vk.vertragsservicelf;

public interface VertragsServiceLF {
  public Integer ermittelnJahrespreis(Long pAgpsIdIn, Integer pZielBruttopreisIn);

  public void ermittelnKuendigungsartenAgps(
      java.util.List pAgpsIdList, java.sql.Timestamp pKuendigungsdatum);

  public void ermittelnKuendigungsartenVertrag(Long pKvlfId, java.sql.Timestamp pKuendigungsdatum);

  public java.sql.Timestamp getAushangtaktende(Long inAgpsId, java.sql.Timestamp inAushangendeVon);

  public void insLog();

  public Integer istDatumFuerAoKuendigungErlaubt(
      Long pAgpsIdIn, Long pKvlfIdIn, java.sql.Timestamp pKuendDatumIn);
}
