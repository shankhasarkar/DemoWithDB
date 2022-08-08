package com.dv.demo.customer.ports;

import com.dv.demo.customer.core.models.Customer;

import java.util.Optional;

public interface IRepository {
    void store(Customer aCustomer);
    Optional<Customer> fetchCustomer(String aId);
    Iterable<Customer> fetchAllCustomers();
}
