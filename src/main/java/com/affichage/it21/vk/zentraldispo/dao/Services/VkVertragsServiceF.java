package com.affichage.it21.vk.zentraldispo.dao.Services;

import java.sql.Date;

public interface VkVertragsServiceF {

   public Date getVgAushangtagWennAnnulliert(Long flOid, Date aushangVon, Long agpsId);

   public void kuendenVertragOderAgps(Long kvlfIdIn, Long agpsId, Date kuendigungsdatum, Date vertragsEnde, Long angrId,
         Long ersatzFlOid, Long kuendigungstyp);

   public void setVertragsEndeUndAufhebenBindungen(Long kvlfId); 

   public void verlaengernVertrag(Long kvlfId); 

   public void verschiebenVertrag(Long kvlfId, Long dauer); 

}
