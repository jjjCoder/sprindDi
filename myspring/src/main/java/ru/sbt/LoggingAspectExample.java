package ru.sbt;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectExample {
    @After("execution(* ru.sbt.customer.CustomerService.getNameById(..))")
    public void loginAfter(){
        System.out.println("Inside");
    }
}
