package it.academy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;


/**
 * Hello world!
 */
public class Main {
  private static Logger log = Logger.getLogger(Main.class);


  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
    Person person = (Person) context.getBean("person");
    Address address = (Address) person.getAddress();
    System.out.print(address.getStreet());
//    Address address = (Address) context.getBean("address");
//    address.getStreet();
//    System.out.println(person.getAddress());
  }
}


