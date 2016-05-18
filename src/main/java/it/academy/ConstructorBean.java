package it.academy;

import org.apache.log4j.Logger;

/**
 * Created by Rabotnik on 16.05.2016.
 */
public class ConstructorBean {
  private static Logger log = Logger.getLogger(Main.class);
  private String constructorBeanName;

  public ConstructorBean(String constructorBeanName) {
    this.constructorBeanName = constructorBeanName;
  }

  public ConstructorBean() {
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "ConstructorBean{" +
        "constructorBeanName='" + constructorBeanName + '\'' +
        '}';
  }
}
