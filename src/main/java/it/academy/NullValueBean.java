package it.academy;

import org.apache.log4j.Logger;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class NullValueBean {
  private static Logger log = Logger.getLogger(Main.class);
  private String value;

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "NullValueBean{" +
        "value='" + value + '\'' +
        '}';
  }
}
