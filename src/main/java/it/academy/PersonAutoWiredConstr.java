package it.academy;

import org.apache.log4j.Logger;

/**
 * Created by Rabotnik on 05.05.2016.
 */
public class PersonAutoWiredConstr {
  private static Logger log = Logger.getLogger(Main.class);
  private Integer id;
  private String name;
  private String surname;
  private IAddress address;

  public PersonAutoWiredConstr(IAddress address) {
    this.address = address;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public IAddress getAddress() {
    return address;
  }

  public void setAddress(IAddress address) {
    this.address = address;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "PersonAutoWiredConstr{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", address=" + address +
        '}';
  }
}
