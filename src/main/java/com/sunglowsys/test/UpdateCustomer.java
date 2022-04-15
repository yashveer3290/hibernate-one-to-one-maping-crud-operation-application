package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.AddressServiceImpl;
import com.sunglowsys.service.CustomerServiceImpl;

public class UpdateCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Ram");
        customer.setLastName("Veer");
        customer.setEmail("ram011@gmail.com");
        customer.setMobile("9898989898");
        customer.setStandard("B.tech");

        Address address = new Address();
        address.setAddressLine1("Bhawan");
        address.setAddressLine2("Nagar");
        address.setLandMark("ABC");
        address.setCity("Mohanpura");
        address.setState("Kasganj");
        address.setPinCode("207402");

        customer.setAddress(address);
        new CustomerServiceImpl().update(customer,2L);
    }
}
