package com.example.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProject.model.Admin;

import com.example.FinalProject.service.Adminservice;

@RestController
@RequestMapping("/")
public class Admincontroller {
	@Autowired
	public Adminservice aser;
	
	
   	 @GetMapping("/getAdmin")
	    public List<Admin>getDetails(){
	   	 return aser.getAdmin();
	    }

}
