CREATE OR REPLACE PACKAGE vertrags_service_f
IS
/**
* =============================================================================
* Project:          VK
* Description:      Schreib-Schnittstelle f?r Aufruf durch Benutzer (aus GUI)
* Dokumentation:    P:\Informatik\architektur\db-api\db_api.pdf
* =============================================================================
* ?nderungen:
* 01.11.2017  kpa   Erstellt.
* 30.07.2019  rbl   ermitteln_kuendigungsarten f?r mehrere AGPS (IT-28706)
* 17.04.2020  tur   IT-35766: Wrapper f?r "ins_log" erstellen
* 21.10.2020  dgu   IT-36489 Refactoring
* 13.04.2021  dgu   IT-37215: Refactoring verlaengern
* 24.08.2022  dgu   IT-38985: Refactoring/Migration von KDVT_LANGFRISTIG_UI_F_PA und Trennung in F und L_F Packages
* 13.03.2023  dgu   IT-39790: vertrag_verschieben von BUCHUNG_KRITERIENSATZ_SERVICE ?bernommen
* =============================================================================
*/
  FUNCTION get_vg_aushangtag_wenn_annulliert(in_fl_oid      IN flaechen_denorm_tot_v.fl_oid%TYPE,
                                             in_aushang_von IN DATE,
                                             in_agps_id     IN auftrag_positionen_f.agps_id%TYPE)
    RETURN DATE;
  --
  PROCEDURE kuenden_vertrag_oder_agps(p_kvlf_id_in          IN kunde_vertraege_f.kvlf_id%TYPE,
                                      p_agps_id_in          IN auftrag_positionen_f.agps_id%TYPE,
                                      p_kuendigungsdatum_in IN DATE,
                                      p_vertrags_ende_in    IN DATE,
                                      p_angr_id_in          IN NUMBER,
                                      p_ersatz_fl_oid_in    IN NUMBER,
                                      p_kuendigungstyp      IN NUMBER);
  --
  PROCEDURE set_vertrags_ende_und_aufheben_bindungen(in_kvlf_id IN kv_langfristig_f.kvlf_id%TYPE);
  --
  PROCEDURE verlaengern_vertrag(in_kvlf_id IN kv_langfristig_f.kvlf_id%TYPE);
  --
  PROCEDURE verschieben_vertrag(in_kvlf_id IN kv_langfristig_f.kvlf_id%TYPE, in_wochen IN NUMBER);
  --
END;