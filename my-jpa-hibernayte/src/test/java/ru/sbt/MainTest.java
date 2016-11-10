package ru.sbt;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import ru.sbt.crm.entity.Customer;
import ru.sbt.dao.CustomerDao;

@ContextConfiguration(locations =("/application-context.xml"))
public class MainTest extends AbstractTransactionalJUnit4SpringContextTests{
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testCustomer() throws Exception{
//        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application-context.xml");
//        CustomerDao customerDao = context.getBean(CustomerDao.class);

        Customer customer=new Customer();
        customer.setFirstName("Jack");
        customer.setLastName("Daniels");
        Customer createdCustomer = customerDao.create(customer);

        Assert.assertNotNull(createdCustomer);

        Customer getCustomer = customerDao.get(createdCustomer.getId());
        Assert.assertNotNull(getCustomer);
    }
}
