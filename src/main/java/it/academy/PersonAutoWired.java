package it.academy;

import it.academy.annotations.AddressAnnotated;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by Rabotnik on 05.05.2016.
 */
public class PersonAutoWired {
  private static Logger log = Logger.getLogger(Main.class);
  private Integer id;
  private String name;
  private String surname;


  @Autowired
//@Qualifier("address2")
  @AddressAnnotated
  private IAddress address;

  public PersonAutoWired(Integer id, Double age, String name, String surname, IAddress address) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.address = address;
  }

  public PersonAutoWired() {
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

  //  @Autowired(required = false) //required = false - чтобы консекст поднялся, если address=null
//  @Qualifier("address2")
  public void setAddress(IAddress address) {
    this.address = address;
  }

  public void init() {
    log.info(this.getClass().getName() + " init...\n" + this);
  }

  public void destroy() {
    log.info(this.getClass().getName() + " destroyed!");
  }

  @Override
  public String toString() {
    return "PersonAutoWired{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", address=" + address +
        '}';
  }
}
