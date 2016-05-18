package it.academy;

import org.apache.log4j.Logger;

import java.util.Collection;

/**
 * Created by Rabotnik on 18.05.2016.
 */
public class ExpressionBean {
  private static Logger log = Logger.getLogger(Main.class);
  private double piValue;
  private String someText;
  private double someCount;
  private boolean emailLogic;
  private Collection<String> personNames;


  public double getPiValue() {
    return piValue;
  }

  public void setPiValue(double piValue) {
    this.piValue = piValue;
  }

  public String getSomeText() {
    return someText;
  }

  public void setSomeText(String someText) {
    this.someText = someText;
  }

  public double getSomeCount() {
    return someCount;
  }

  public void setSomeCount(double someCount) {
    this.someCount = someCount;
  }

  public boolean isEmailLogic() {
    return emailLogic;
  }

  public void setEmailLogic(boolean emailLogic) {
    this.emailLogic = emailLogic;
  }

  public Collection<String> getPersonNames() {
    return personNames;
  }

  public void setPersonNames(Collection<String> personNames) {
    this.personNames = personNames;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "ExpressionBean{" +
        "piValue=" + piValue +
        ", someText='" + someText + '\'' +
        ", someCount=" + someCount +
        ", emailLogic=" + emailLogic +
        ", personNames=" + personNames +
        '}';
  }
}
