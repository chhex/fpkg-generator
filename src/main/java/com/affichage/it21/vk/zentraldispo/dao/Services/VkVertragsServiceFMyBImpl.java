package com.affichage.it21.vk.zentraldispo.dao.Services;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class VkVertragsServiceFMyBImpl implements VkVertragsServiceF {

    final private DataAccessFacade dataAccessFacade;

    public VkVertragsServiceFMyBImpl(DataAccessFacade dataAccessFacade) {
        this.dataAccessFacade = dataAccessFacade;
    }

    @Override
    public Date getVgAushangtagWennAnnulliert(Long flOid, Date aushangVon, Long agpsId) {
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("IN_FL_OID", flOid);
        paramters.put("IN_AUSHANG_VON", aushangVon);
        paramters.put("IN_AGPS_ID", agpsId);
        @SuppressWarnings("unchecked")
        Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade
                .call("com.affichage.it21.vk.zentraldispo.dao.Services.get_vg_aushangtag_wenn_annulliert", paramters);
        return (Date) returnParameterMap.get("RESULT");

    }

    @Override
    public void kuendenVertragOderAgps(Long kvlfIdIn, Long agpsId, Date kuendigungsdatum, Date vertragsEnde,
            Long angrId, Long ersatzFlOid, Long kuendigungstyp) {
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("P_KVLF_ID_IN", kvlfIdIn);
        paramters.put("P_AGPS_ID_IN", agpsId);
        paramters.put("P_KUENDIGUNGSDATUM_IN", kuendigungsdatum);
        paramters.put("P_VERTRAGS_ENDE_IN", vertragsEnde);
        paramters.put("P_ANGR_ID_IN", angrId);
        paramters.put("P_ERSATZ_FL_OID_IN", ersatzFlOid);
        paramters.put("P_KUENDIGUNGSTYP", kuendigungstyp);
        @SuppressWarnings("unchecked")
        Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade
                .call("com.affichage.it21.vk.zentraldispo.dao.Services.kuenden_vertrag_oder_agps", paramters);
        System.out.println("Debugging: " + returnParameterMap);

    }

    @Override
    public void setVertragsEndeUndAufhebenBindungen(Long kvlfId) {
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("IN_KVLF_ID", kvlfId);
        @SuppressWarnings("unchecked")
        Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade
                .call("com.affichage.it21.vk.zentraldispo.dao.Services.set_vertrags_ende_und_aufheben_bindungen",
                        paramters);
        System.out.println("Debugging: " + returnParameterMap);
    }

    @Override
    public void verlaengernVertrag(Long kvlfId) {
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("IN_KVLF_ID", kvlfId);
        @SuppressWarnings("unchecked")
        Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade
                .call("com.affichage.it21.vk.zentraldispo.dao.Services.verlaengern_vertrag",
                        paramters);
        System.out.println("Debugging: " + returnParameterMap);
    
    }

    @Override
    public void verschiebenVertrag(Long kvlfId, Long dauer) {

        Map<String, Object> paramters = new HashMap<>();
        paramters.put("IN_KVLF_ID", kvlfId);
        paramters.put("IN_WOCHEN", dauer);
        @SuppressWarnings("unchecked")
        Map<String, Object> returnParameterMap = (Map<String, Object>) dataAccessFacade
                .call("com.affichage.it21.vk.zentraldispo.dao.Services.verschieben_vertrag",
                        paramters);
        System.out.println("Debugging: " + returnParameterMap);

    }

}
