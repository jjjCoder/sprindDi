package ru.sbt.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.sbt.HelloWorld;

@Configuration
@ComponentScan("ru.sbt")
public class AppConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
