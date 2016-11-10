package ru.sbt.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import ru.sbt.jdbc.UserDao;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class ApplicationConfiguration {
    @Bean
    public DataSource dataSource(){
        return new DriverManagerDataSource("jdbc:h2:C:/Users/SBTJavastudent/IdeaProjects/multithreading/myspring/Jdbc/database");
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(JdbcTemplate jdbcTemplate){
        return new NamedParameterJdbcTemplate(jdbcTemplate);
    }
}
