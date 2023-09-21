package com.example.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.FinalProject.model.Customer;
import com.example.FinalProject.repository.Customerrepository;



@Service
public class Customerservice {
    @Autowired
    public Customerrepository crep;
    
    public Customer saveCustomer(Customer c) {
 	   return crep.save(c);
    }
    public List<Customer> getCustomer(){
 	   return crep.findAll();
    }
    

}
