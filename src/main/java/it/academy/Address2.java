package it.academy;


import it.academy.annotations.AddressAnnotated;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import java.util.Collection;
import java.util.List;

/**
 * Created by Rabotnik on 05.05.2016.
 */
@AddressAnnotated
public class Address2 implements IAddress{
  private static Logger log = Logger.getLogger(Main.class);
  @Value("#{12345}") //можно задать id бина (засетать бин)
  private int id;
  private String street;
  private int home;
  private List<Integer> offices;
  private Collection<String> officeNames;
  private String email;

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

  public List<Integer> getOffices() {
    return offices;
  }

  public void setOffices(List<Integer> offices) {
    this.offices = offices;
  }

  public Collection<String> getOfficeNames() {
    return officeNames;
  }

  public void setOfficeNames(Collection<String> officeNames) {
    this.officeNames = officeNames;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "Address{" +
        "id=" + id +
        ", street='" + street + '\'' +
        ", home=" + home +
        ", offices=" + offices +
        ", officeNames=" + officeNames +
        ", email='" + email + '\'' +
        '}';
  }
}
