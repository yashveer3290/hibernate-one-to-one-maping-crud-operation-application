package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class FindByIdCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer = new CustomerServiceImpl().findById(3L);
        System.out.println(customer);
    }
}
