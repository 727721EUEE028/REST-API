package com.example.day3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day3.model.HotelManagement;
import com.example.day3.repository.ManagementRep;

@Service
public class ManagementService {
             @Autowired
             public ManagementRep mrep;
             
             //post the data
             public HotelManagement saveDetails(HotelManagement h) {
            	  return mrep.save(h);
             }
             //get the data
             public List<HotelManagement> getDetails(){
            	 return mrep.findAll();
             }
}
