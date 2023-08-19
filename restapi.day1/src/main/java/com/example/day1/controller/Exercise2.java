package com.example.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Exercise2 {
   @Value("${var}")
  private String studentName;
   @GetMapping("Yellow")
          public String GetName() {
        	  return "Welcome "+studentName;
        }
}
