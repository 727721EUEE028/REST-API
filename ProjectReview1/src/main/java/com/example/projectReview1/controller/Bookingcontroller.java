package com.example.projectReview1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.projectReview1.model.Booking;
import com.example.projectReview1.service.Bookingservice;



@RestController
public class Bookingcontroller {
	 @Autowired
     public Bookingservice bsep;
      @PostMapping("/saveBooking")
      public  String postBookingInfo(@RequestBody Booking b) {
     	  bsep.saveBooking(b);
     	  return "data saved successfully";
      }
      @GetMapping("/getBooking")
      public List<Booking>getBookingInfo(){
     	 return bsep.getBooking();
      }
      @PutMapping("/updateBooking")
      public Booking updateBookingInfo(@RequestBody Booking b) {
     	 return bsep.updateBooking(b);
      }
      @PutMapping("/updateBooking/{roomid}")
      public ResponseEntity<String>updateBookingInfo(@PathVariable int roomid){
     	 boolean updated=bsep.updateBookingif(roomid);
     	 if(updated) {
     		 return ResponseEntity.ok(roomid+" id updated successfully");
     	 }
     	 else {
     		 
     		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(roomid+" id not found");
     	 }
      }
      @DeleteMapping("/deleteBookingif/{id}")
      public ResponseEntity<String> deleteBooking(@PathVariable int id){
     	 boolean deleted =bsep.deleteBookingif(id);
     	 if(deleted) {
     		 return ResponseEntity.ok("booked  roomid  "+id+" deleted successfully");
     	 }
     	 else {
     		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booked roomid "+id+"not found");
     	 }
      }
      @DeleteMapping("/byRegparam")
      public String removeByRequestPam(@RequestParam("id") int id) {
    	  bsep.deleteBookingif(id);
    	  return "Booking with id "+id+" is deleted";
      }
      
      
      @DeleteMapping("user/{roomid}")  
      public ResponseEntity<?>getUserId(@PathVariable int roomid){
     	 Optional<Booking> room =bsep.getUserId(roomid);
     	 if(room !=null) {
     		 return ResponseEntity.ok(room);
     		 
     	 }
     	 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not available with ID");
      }
      
      
      
}
