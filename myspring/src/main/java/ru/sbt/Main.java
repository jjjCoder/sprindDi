package ru.sbt;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.sbt.customer.CustomerService;
import ru.sbt.customer.config.AppConfig;
import ru.sbt.customer.model.Customer;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

//        HelloWorld helloWorld=(HelloWorld) context.getBean("HelloWorld");
//        helloWorld.print();

        CustomerService service= (CustomerService) context.getBean("customerService");
        System.out.println(service.getNameById(1L));
        CustomerService service1= (CustomerService) context.getBean("customerService");
        System.out.println(service==service1);

//        Customer costumer=context.getBean(Customer.class);
//        System.out.println(costumer.getName()+" "+costumer.getAmount());

    }
}
