package com.apgsga.it21.fpkgservices.vk.lobfpa;

import java.util.HashMap;
import java.util.Map;

import com.apgsga.forms2java.persistence.DataAccessFacade;

public class LobFPaImpl implements LobFPa {

  private final DataAccessFacade dataAccessFacade;

  public LobFPaImpl(DataAccessFacade dataAccessFacade) {
    this.dataAccessFacade = dataAccessFacade;
  }

  @Override
  public void serverCommit() {
    Map<String, Object> parameters = new HashMap<>();
    dataAccessFacade.call("com.apgsga.it21.fpkgservices.vk.lobfpa.server_commit", parameters);
  }
}
