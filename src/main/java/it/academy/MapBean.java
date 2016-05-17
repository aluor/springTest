package it.academy;

import java.util.Map;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class MapBean {
  private Map<Integer, String> mapContent;

  public Map<Integer, String> getMapContent() {
    return mapContent;
  }

  public void setMapContent(Map<Integer, String> mapContent) {
    this.mapContent = mapContent;
  }

  @Override
  public String toString() {
    return "MapBean{" +
        "mapContent=" + mapContent +
        '}';
  }
}
