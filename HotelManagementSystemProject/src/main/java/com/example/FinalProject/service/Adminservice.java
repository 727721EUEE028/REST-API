package com.example.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProject.model.Admin;
import com.example.FinalProject.repository.Adminrepository;

@Service
public class Adminservice {
	@Autowired
	public Adminrepository arep;
	
	
	public List<Admin> getAdmin(){
		return arep.findAll();
	}

}

