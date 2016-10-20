package ru.sbt.customer.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("customerJpaDao")
public class CustomerJpaDao implements CustomerDao {
    public String getNameById(Long id) {
        return "JPA";
    }
}
