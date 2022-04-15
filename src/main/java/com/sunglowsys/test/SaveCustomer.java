package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class SaveCustomer {

    public static void main(String[] args) {

        Address address = new Address("ABC","PQR","Marehra","Mohanpur","State","207401");

        Customer customer = new Customer("Vimal","Kumar","v011@gmail","8987788978","B.sc", address);

        new CustomerServiceImpl().save(customer);

        System.out.println("saved");
    }
}
