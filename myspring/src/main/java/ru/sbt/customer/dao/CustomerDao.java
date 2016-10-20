package ru.sbt.customer.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao {
    String getNameById(Long id);
}
