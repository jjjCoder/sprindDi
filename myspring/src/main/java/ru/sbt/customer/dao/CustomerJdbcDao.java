package ru.sbt.customer.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerJdbcDao implements CustomerDao {
    public String getNameById(Long id) {
        return "JDBC";
    }
}
