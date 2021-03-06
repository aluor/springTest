package it.academy;

import org.apache.log4j.Logger;

import java.util.Properties;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class PropertyBean {
  private static Logger log = Logger.getLogger(Main.class);
  private Properties properties;

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "PropertyBean{" +
        "properties=" + properties +
        '}';
  }
}
