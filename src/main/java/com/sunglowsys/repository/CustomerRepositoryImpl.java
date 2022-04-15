package com.sunglowsys.repository;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Customer save(Customer customer) {

        LOGGER.debug("saving customer:{}",customer);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Long id = (Long) session.save(customer);
        session.getTransaction().commit();
        session.close();

        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer1 = session.get(Customer.class,id);
        customer1.setFirstName(customer.getFirstName());
        customer1.setLastName(customer.getLastName());
        customer1.setEmail(customer.getEmail());
        customer1.setMobile(customer.getMobile());
        customer1.setStandard(customer.getStandard());
        Address address = session.get(Address.class, id);
        address.setAddressLine1(customer.getAddress().getAddressLine1());
        address.setAddressLine2(customer.getAddress().getAddressLine2());
        address.setLandMark(customer.getAddress().getLandMark());
        address.setCity(customer.getAddress().getCity());
        address.setState(customer.getAddress().getState());
        address.setPinCode(customer.getAddress().getPinCode());

        session.update(customer1);
        session.getTransaction().commit();

        return customer;
    }

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();
        session.getTransaction().commit();
        return customerList;
    }

    @Override
    public Customer findById(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        return customer;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.get(Customer.class,id);
        session.delete(customer);
        session.getTransaction().commit();

    }
}
