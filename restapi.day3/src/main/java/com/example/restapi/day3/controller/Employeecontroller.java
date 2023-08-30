package com.example.restapi.day3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.day3.model.Employee;
import com.example.restapi.day3.service.Employeeservice;



@RestController
@RequestMapping("/")
public class Employeecontroller {
                   @Autowired
                   public Employeeservice esev;
                   
                   
                   @PostMapping("/saveEmployee")
                   public Employee saveDetails(@RequestBody Employee ey) 
                   {
                  	 return esev.saveDetails(ey);
                   }
                   @GetMapping("/getEmployee")
                   public List<Employee>getDetails()
                   {
                  	 return esev.getDetails();
                   }
                   @GetMapping("/getEmployee/{id}")
                   public ResponseEntity<String>updateEmployeeInfo(@PathVariable int id){
                  	 boolean get=esev.getEmployeeif(id);
                  	 if(get) {
                  		 return ResponseEntity.ok(id+" id get successfully");
                  	 }
                  	 else {
                  		 
                  		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id+" id not found");
                  	 }
                   }
}
