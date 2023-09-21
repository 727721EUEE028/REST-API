package com.example.FinalProject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.FinalProject.model.Customer;
import com.example.FinalProject.service.Customerservice;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Customercontroller {
	 @Autowired
     public Customerservice cser;
     
     @PostMapping("/customer")
	 public Customer postCustomerInfo(@RequestBody Customer c) {
	   	  return cser.saveCustomer(c);
	   	
	    }
	    @GetMapping("/getcustomer")
	    public List<Customer> getCustomer(){
	   	 return cser.getCustomer();
	   

}
}
