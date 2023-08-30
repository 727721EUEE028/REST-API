package com.example.restapi.day4.controller;

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

import com.example.restapi.day4.model.Student;
import com.example.restapi.day4.service.Studentservice;

@RestController
@RequestMapping("/")
public class Studentcontroller {
	@Autowired
    public Studentservice ssep;
     @PostMapping("/saveStudent")
     public  String postStudentInfo(@RequestBody Student s) {
    	  ssep.saveDetails(s);
    	  return "data saved successfully";
     }
     @GetMapping("/getStudent")
     public List<Student>getStudentInfo(){
    	 return ssep.getDetails();
     }
     @GetMapping("/getStudent/{id}")
     public ResponseEntity<String>getStudentInfo(@PathVariable int id){
    	 boolean get=ssep.getStudentif(id);
    	 if(get) {
    		 return ResponseEntity.ok(id+" id get successfully");
    	 }
    	 else {
    		 
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id+" id not found");
    	 }
     }
     @PutMapping("/updateStudent/{id}")
     public ResponseEntity<String>updateStudentInfo(@PathVariable int id){
    	 boolean updated=ssep.updateStudentif(id);
    	 if(updated) {
    		 return ResponseEntity.ok(id+" id updated successfully");
    	 }
    	 else {
    		 
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id+" id not found");
    	 }
     }
     @DeleteMapping("/deleteStudentif/{id}")
     public ResponseEntity<String> deleteStudent(@PathVariable int id){
    	 boolean deleted =ssep.deleteStudentif(id);
    	 if(deleted) {
    		 return ResponseEntity.ok(id+" deleted successfully");
    	 }
    	 else {
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(id+"not found");
    	 }
     }

}
