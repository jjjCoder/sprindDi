package ru.sbt.dao;

import org.springframework.stereotype.Repository;
import ru.sbt.crm.entity.Customer;

@Repository
public interface CustomerDao {
    Customer get(Long id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    void delete(Long id);
}
