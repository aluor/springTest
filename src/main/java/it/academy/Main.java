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

//    Person person = (Person) context.getBean("person");
//    MapBean mapBean = (MapBean) context.getBean("mapBean");
//    PropertyBean propertyBean = (PropertyBean) context.getBean("propertyBean");
//    ConstructorBean constructorBean = (ConstructorBean) context.getBean("constructorBean");
//    NullValueBean nullValueBean = (NullValueBean) context.getBean("nullValueBean");
//    CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
//    Person person1 = (Person) context.getBean("person1");
//    Person person2 = (Person) context.getBean("person2");


// TODO: ПОЧЕМУ НЕ СУЖАЕТСЯ ТИП?!
//    IAddress addressBean = (IAddress) context.getBean("address");
//    Address address = (Address)person.getAddress();

//    ExpressionBean expressionBean = (ExpressionBean) context.getBean("expressionBean");
    PersonAutoWired personAutoWired = (PersonAutoWired) context.getBean("personAutoWired");
    PersonAutoWiredConstr personAutoWiredConstr = (PersonAutoWiredConstr) context.getBean("personAutoWiredConstr");

    ((ClassPathXmlApplicationContext)context).close();
  }
}


