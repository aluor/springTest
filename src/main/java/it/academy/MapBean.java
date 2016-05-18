package it.academy;

import org.apache.log4j.Logger;

import java.util.Map;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class MapBean {
  private static Logger log = Logger.getLogger(Main.class);
  private Map<Integer, String> mapContent;

  public Map<Integer, String> getMapContent() {
    return mapContent;
  }

  public void setMapContent(Map<Integer, String> mapContent) {
    this.mapContent = mapContent;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "MapBean{" +
        "mapContent=" + mapContent +
        '}';
  }
}
