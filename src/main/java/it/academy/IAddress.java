package it.academy;

import java.util.Collection;
import java.util.List;

/**
 * Created by Rabotnik on 13.05.2016.
 */
public interface IAddress {

  int getId();

  void setId(int id);

  String getStreet();

  void setStreet(String street);

  int getHome();

  public void setHome(int home);

  List<Integer> getOffices();

  void setOffices(List<Integer> offices);

  Collection<String> getOfficeNames();

  void setOfficeNames(Collection<String> officeNames);

  public String getEmail();

  public void setEmail(String email);

  void init();

  void destroy();

  String toString();
}
