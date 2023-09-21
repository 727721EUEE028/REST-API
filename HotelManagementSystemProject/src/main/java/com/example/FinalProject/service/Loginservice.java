package com.example.FinalProject.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProject.model.Login;
import com.example.FinalProject.repository.Loginrepository;


@Service
public class Loginservice {
           @Autowired
           public Loginrepository lrep;
           
           //post the data
           public Login saveDetails(Login l) {
        	   return lrep.save(l);
           }
           
           
           public boolean getDetails(String username,String password){
        		return lrep.existsByName(username,password);
		
}

}
