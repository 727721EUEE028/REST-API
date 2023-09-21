package com.example.FinalProject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FinalProject.model.Checkout;
import com.example.FinalProject.repository.Checkoutrepository;

@Service
public class Checkoutservice {
	@Autowired
    public Checkoutrepository crep;
     
	public Checkout saveRoomnumber(Checkout c) {
		return crep.save(c);
		
	}
	public List<Checkout> getRoomnumber(){
		return crep.findAll();
	}
   
	public String deleteByRoomnumber(int roomnumber) {
        int rowsAffected = crep.deleteByRoomnumber(roomnumber);
        
        if (rowsAffected > 0) {
            return "Check-in details deleted successfully";
        } else {
            return "No matching check-in details found for room number " + roomnumber;
        }
    }

}
