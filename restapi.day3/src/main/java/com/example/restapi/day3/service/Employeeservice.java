package com.example.restapi.day3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.day3.model.Employee;
import com.example.restapi.day3.repository.Employeerepository;

@Service
public class Employeeservice {
           @Autowired
           public Employeerepository erep;
           
           public Employee saveDetails(Employee e) {
        	   return erep.save(e);
           }
           public List<Employee> getDetails(){
        	   return erep.findAll();
           }

             public boolean getEmployeeif(int id) {
	              if(erep.existsById((long) id)) {
		  
		                return true;
	                   }
	                   return false;
}
		
}

