package com.example.customerdatabase.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService (CustomerRepository customerRepository){// call Repository using dependency injection
        this.customerRepository = customerRepository;
    }
    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();// return all the customers in the database;
    }

    @GetMapping
    public String isInDatabase(Long id){
        Optional<Customer> c  = customerRepository.findById(id);
        if(c.isPresent()){
            return c.get().getFirst_name() + " is in the database";
        }
        return c.get().getFirst_name() + " is not in the database";
    }
}
