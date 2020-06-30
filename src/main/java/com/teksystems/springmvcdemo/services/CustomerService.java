package com.teksystems.springmvcdemo.services;

import com.teksystems.springmvcdemo.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer findCustomerById (Long id);

    List<Customer> findAllCustomers();


}
