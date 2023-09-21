package com.example.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProject.model.Employee;

import com.example.FinalProject.service.Employeeservice;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Employeecontroller {
          @Autowired
          public Employeeservice eser;
          @PostMapping("/employee")
     	 public Employee postEmployeeInfo(@RequestBody Employee e) {
     	   	  return eser.saveEmployee(e);
     	   	
     	    }
     	    @GetMapping("/getemployee")
     	    public List<Employee> getEmployee(){
     	   	 return eser.getEmployee();
     	    }
}
