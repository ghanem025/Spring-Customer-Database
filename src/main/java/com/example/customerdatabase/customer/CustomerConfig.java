package com.example.customerdatabase.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Configuration
public class CustomerConfig {


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args ->{
            Customer c1 = new Customer("Ghanem","Ghanem","pixel 2xl",104553402L,"", new Date() );// initialize a new customer
            customerRepository.save(c1);//add a customer to the repository
        };

    }
}
