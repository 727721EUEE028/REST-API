package com.example.day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	@Value("${var}")
	  private String name;
	   @GetMapping("myName")
	          public String GetName() {
	        	  return name;
	        }
	}

