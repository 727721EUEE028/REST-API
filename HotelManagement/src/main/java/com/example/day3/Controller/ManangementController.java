package com.example.day3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day3.Service.ManagementService;
import com.example.day3.model.HotelManagement;

@RestController
public class ManangementController
{
         @Autowired
         ManagementService mser;
         @PostMapping("/saveDetails")
         public HotelManagement saveDetails( @RequestBody HotelManagement hm) 
         {
        	 return mser.saveDetails(hm);
         }
         @GetMapping("/getDetails")
         public List<HotelManagement>getDetails()
         {
        	 return mser.getDetails();
         }
}
