package com.example.Day9OneToMany.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Day9OneToMany.model.User;

import com.example.Day9OneToMany.repository.Userrep;




@RestController
@RequestMapping("/")
public class Usercontroller {
           @Autowired
           Userrep urep;
           
           @PostMapping("/save")
           public User saveDetails(@RequestBody User u) {
        	   return urep.save(u);
           }
           @GetMapping("/get")
           public List<User> getDetails(){
        	   return urep.findAll();
           }
            
} 
