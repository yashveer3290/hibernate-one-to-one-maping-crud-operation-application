package com.sunglowsys.test;

import com.sunglowsys.service.CustomerServiceImpl;

public class DeleteByIdCustomer {
    public static void main(String[] args) {
        new CustomerServiceImpl().delete(5L);
    }
}
