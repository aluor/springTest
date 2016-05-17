package it.academy;

import java.util.Properties;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class PropertyBean {
  private Properties properties;

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  @Override
  public String toString() {
    return "PropertyBean{" +
        "properties=" + properties +
        '}';
  }
}
