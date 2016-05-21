package it.academy;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Rabotnik on 05.05.2016.
 */
@Component("person")
public class Person {
  private static Logger log = Logger.getLogger(Main.class);
  @Value("true")
  private boolean isKazintsa;
  @Value("true")
  private boolean hasStreet;
  @Value("7")
  private Integer id;
  private Double age;
  @Value("componentPerson")
  private String name;
  private String surname;
  @Value("#{address2}")
  private IAddress address;

  public Person(Integer id, Double age, String name, String surname, IAddress address) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.address = address;
  }

  public Person() {
  }

  public boolean isKazintsa() {
    return isKazintsa;
  }

  public void setKazintsa(boolean isKazintsa) {
    this.isKazintsa = isKazintsa;
  }

  public boolean HasStreet() {
    return hasStreet;
  }

  public void setHasStreet(boolean hasStreet) {
    this.hasStreet = hasStreet;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Double getAge() {
    return age;
  }

  public void setAge(Double age) {
    this.age = age;
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
    return "Person{" +
        "isKazintsa=" + isKazintsa +
        ", hasStreet=" + hasStreet +
        ", id=" + id +
        ", age=" + age +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", address=" + address +
        '}';
  }
}
