package com.lionelrivas.d;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerClient customerClient;

    @Autowired
    public CustomerService(CustomerClient customerClient) {
        this.customerClient = customerClient;
    }

    public Customer findById(Integer id) {
        return customerClient.findById(id);
    }
}