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
    MapBean mapBean = (MapBean) context.getBean("mapBean");
    PropertyBean propertyBean = (PropertyBean) context.getBean("propertyBean");
    ConstructorBean constructorBean = (ConstructorBean) context.getBean("constructorBean");
    NullValueBean nullValueBean = (NullValueBean) context.getBean("nullValueBean");

    System.out.println(address);
    System.out.println(address.getStreet());
    System.out.println(mapBean);
    System.out.println(propertyBean);
    System.out.println(constructorBean);
    System.out.println(nullValueBean);


    ((ClassPathXmlApplicationContext)context).close();
  }
}


