package com.example.customerdatabase.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository <Customer,Long> {

}
