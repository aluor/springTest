package it.academy;

import org.apache.log4j.Logger;


public class Notifier {
  private static Logger log = Logger.getLogger(Notifier.class);
  public void notifyBefore(){
    log.info("Method execution begin...");
  }

  public void notifyAfter(){
    log.info("Method execution end");
  }

}
