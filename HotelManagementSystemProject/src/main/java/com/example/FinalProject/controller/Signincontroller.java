package com.example.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.FinalProject.model.Signin;
import com.example.FinalProject.service.Signinservice;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Signincontroller {
	@Autowired
	public Signinservice sser;
	
	@PostMapping("/signin")
	 public Signin postSigninInfo(@RequestBody Signin s) {
	   	  return sser.saveSignin(s);
	   	
	    }
	    @GetMapping("/getsignin")
	    public List<Signin>getDetails(){
	   	 return sser.getSignin();
	    }

}
