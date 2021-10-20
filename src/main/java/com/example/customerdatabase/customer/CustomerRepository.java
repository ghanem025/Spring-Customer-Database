package com.example.customerdatabase.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface CustomerRepository extends JpaRepository <Customer,Long> {
    //Optional<Customer> findStudentByName(String first_name);
}
