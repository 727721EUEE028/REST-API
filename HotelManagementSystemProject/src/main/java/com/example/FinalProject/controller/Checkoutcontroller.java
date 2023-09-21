package com.example.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProject.model.Checkout;

import com.example.FinalProject.service.Checkoutservice;

@RestController
@CrossOrigin
@RequestMapping("/")
public class Checkoutcontroller {
	@Autowired
	public Checkoutservice cser;
	 
    @PostMapping("/checkout")
	 public Checkout postRoomnumberInfo(@RequestBody Checkout c) {
	   	  return cser.saveRoomnumber(c);
	   	
	    }
	    @GetMapping("/getcheckout")
	    public List<Checkout> getRoomnumber(){
	   	 return cser.getRoomnumber();

}
	    @DeleteMapping("/delete-by-room")
	    public ResponseEntity<String> deleteByRoomNumber(@RequestParam("roomnumber") int roomnumber) {
	        try {
	            String message = cser.deleteByRoomnumber(roomnumber);
	            return new ResponseEntity<>(message, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>("Failed to delete check-in details", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
}
