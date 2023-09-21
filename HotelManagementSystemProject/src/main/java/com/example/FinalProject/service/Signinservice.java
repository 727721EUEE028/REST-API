package com.example.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.FinalProject.model.Signin;
import com.example.FinalProject.repository.Signinrepository;

@Service
public class Signinservice {
           @Autowired
           public Signinrepository srep;
           
           //post the data
           public Signin saveSignin(Signin s) {
        	   return srep.save(s);
        	   
           }
           //get the data
           public List<Signin> getSignin(){
        	   return srep.findAll();
           }
}
