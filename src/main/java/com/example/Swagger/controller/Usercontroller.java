package com.example.Swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.Swagger.model.User;
import com.example.Swagger.service.Userservice;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/")
public class Usercontroller {
                @Autowired
                public Userservice usev;
                
                @PostMapping("/save")
                @Tag(name="POST", description="TO POST THE DETAILS")
                public User saveDetails(@RequestBody User u) {
                	return usev.saveDetails(u);
                }
                
                @GetMapping("/get")
                @Tag(name="GET", description="TO GET THE DETAILS")
                public List<User> getDetails(){
                	return usev.getDetails();
                }
                @PutMapping("/updateUser/{userid}")
                @Tag(name="UPDATE", description="TO UPDATE THE DETAILS")
               public ResponseEntity<String>updateUser(@PathVariable long userid){
	            boolean updated=usev.updateUserif(userid);
	            if(updated) {
		                return ResponseEntity.ok(userid+" USERID UPDATED SUCCESSFULLY");
	             }
	            else {
	 	 
		                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(userid+" USERID NOT FOUND");
		                		}
	            
               }
              
                @DeleteMapping("/deleteUserif/{userid}")
                public ResponseEntity<String> deleteUser(@PathVariable long userid){
               	 boolean deleted = usev.deleteUserif(userid);
               	 if(deleted) {
               		 return ResponseEntity.ok("USERID "+userid+" DELETED");
               	 }
               	 else {
               		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("USERID "+userid+" NOT FOUND");
               	 }
                }
}
