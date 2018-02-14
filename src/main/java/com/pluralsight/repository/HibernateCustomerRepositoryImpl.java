package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();

        Customer customer  = new Customer();

        customer.setFirstName("Sahib");
        customer.setLastName("Singh");

        customers.add(customer);
        return customers;
    }
}
