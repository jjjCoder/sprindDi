package ru.sbt.dao;

import org.springframework.stereotype.Repository;
import ru.sbt.crm.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerJpaDao implements CustomerDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer get(Long id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public Customer create(Customer customer) {
        entityManager.persist(customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        return entityManager.merge(customer);
    }

    @Override
    public void delete(Long id) {
        Customer customer=entityManager.find(Customer.class, id);
        if(customer!=null){
            entityManager.remove(customer);
        }
    }
}
