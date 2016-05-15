package it.academy;

import static java.lang.System.out;


public class Notifier {

  public void notifyBefore(){
    out.println("Notification before executing getStreet");
  }

  public void notifyAfter(){
    out.println("Notification after executing getStreet");
  }

}
