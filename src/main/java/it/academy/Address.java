package it.academy;

import org.apache.log4j.Logger;

/**
 * Created by Rabotnik on 05.05.2016.
 */
public class Address implements IAddress{
  private static Logger log = Logger.getLogger(Main.class);
  private int id;
  private String street;
  private int home;

  public Address(int id, String street, int home) {
    this.id = id;
    this.street = street;
    this.home = home;
  }

  public Address() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getHome() {
    return home;
  }

  public void setHome(int home) {
    this.home = home;
  }

  public void init() {
    log.info("address init...");
  }

  public void destroy() {
    log.info("address destroyed!");
  }

  @Override
  public String toString() {
    return "Address{" +
        "street='" + street + '\'' +
        ", home=" + home +
        '}';
  }
}
