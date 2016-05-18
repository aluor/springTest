package it.academy;

import org.apache.log4j.Logger;

import java.util.Collection;

/**
 * Created by Rabotnik on 18.05.2016.
 */
public class CollectionBean {
  private static Logger log = Logger.getLogger(Main.class);
  private Collection<Person> persons;

  public Collection<Person> getPersons() {
    return persons;
  }

  public void setPersons(Collection<Person> persons) {
    this.persons = persons;
  }

  public void init() {
    log.info(this.getClass().getName()+" init...\n"+this);
  }

  public void destroy() {
    log.info(this.getClass().getName()+" destroyed!");
  }

  @Override
  public String toString() {
    return "CollectionBean{" +
        "persons=" + persons +
        '}';
  }
}
