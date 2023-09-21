package com.example.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProject.model.Employee;
import com.example.FinalProject.repository.Employeerepository;

@Service
public class Employeeservice {
               @Autowired
               public Employeerepository erep;
               
               public Employee saveEmployee(Employee e) {
            	   return erep.save(e);
               }
               public List<Employee> getEmployee(){
            	   return erep.findAll();
               }
}
