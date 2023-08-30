package com.example.restapi.day4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.day4.model.Student;
import com.example.restapi.day4.repository.Studentrepository;

@Service
public class Studentservice {
	  @Autowired
      public Studentrepository srep;
      
      //post the data
      public Student saveDetails(Student s) {
     	 return srep.save(s);
      }
      //get the data
       public List<Student> getDetails(){
     	  return srep.findAll();
       }
       //get if id is present
       public boolean getStudentif(int id) {
           if(srep.existsById(id)) {
	  
	                return true;
                }
                return false;
      }
       //update if id is present
       public boolean updateStudentif(int id) {
      	   if(srep.existsById(id)) {
      		  
      		   return true;
      	   }
      	   return false;
         }
       //delete if id is present
       public boolean deleteStudentif(int id) {
      	   if(srep.existsById(id)) {
      		   srep.deleteById(id);
      		   return true;
      	   }
      	   return false;
         }

}
