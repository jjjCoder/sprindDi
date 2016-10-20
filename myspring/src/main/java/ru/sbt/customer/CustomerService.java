package ru.sbt.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.sbt.customer.dao.CustomerDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class CustomerService {
    @Autowired
    @Qualifier("customerJdbcDao")
    private CustomerDao customerDao;

    private String name;

    public CustomerService() {
    }

    public CustomerService(CustomerDao customerDao, String name) {
        this.customerDao = customerDao;
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }
    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public String getNameById(Long id){
        return customerDao.getNameById(id);
    }
}
