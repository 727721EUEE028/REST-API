package com.example.Swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Swagger.model.User;
import com.example.Swagger.repository.Userrepository;

@Service
public class Userservice {
             @Autowired
             public Userrepository urep;
             
             //post the data
             public User saveDetails(User u) {
            	 return urep.save(u);
             }
             //get the data
              public List<User> getDetails(){
            	  return urep.findAll();
              }
              //update
              
              public boolean updateUserif(long userid) {
             	   if(urep.existsById(userid)) {
             		  
             		   return true;
             	   }
             	   return false;
                }
            
			public boolean deleteUserif(long userid) {
				if(urep.existsById(userid)) {
          		   urep.deleteById(userid);
          		   return true;
          	   }
				return false;
			}
}
