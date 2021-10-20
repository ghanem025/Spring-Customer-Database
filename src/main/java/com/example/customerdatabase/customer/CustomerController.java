package com.example.customerdatabase.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {


    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> CustomerDisplay(){
        return customerService.getCustomers();
    }// call from customerservice and
    //return a list of all customers in the database.

    @PutMapping(path = "{id}")
    public String CheckInDatabase(@PathVariable("id") Long id,@RequestParam(required = false) String first_name){
        return customerService.isInDatabase(id);
    }

}
