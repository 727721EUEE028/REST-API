package com.example.projectReview1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.projectReview1.model.Booking;
import com.example.projectReview1.repository.Bookingrep;

@Service
public class Bookingservice {
      @Autowired
      public Bookingrep brep;
      
      //post the data
      public String saveBooking(Booking b) {
  	    brep.save(b);
  	    return "data is saved successfully";
     }
      //get the data
     public List<Booking>getBooking(){
  	   return brep.findAll();
     }
     //put the data
     public Booking updateBooking(Booking b) {
  	   return brep.saveAndFlush(b);
     }
     //delete if id is present
     public boolean deleteBookingif(int roomid) {
  	   if(brep.existsById(roomid)) {
  		   brep.deleteById(roomid);
  		   return true;
  	   }
  	   return false;
     }
     public boolean updateBookingif(int roomid) {
  	   if(brep.existsById(roomid)) {
  		  
  		   return true;
  	   }
  	   return false;
     }
     //delete the data
     public void deleteBooking(int room_id) {
  	   System.out.println("Deleted");
  	   brep.deleteById(room_id);
     }
     public Optional<Booking> getUserId(int roomid){
  	   Optional<Booking> room = brep.findById(roomid);
  	   if(room.isPresent()) {
  		   return room;
  	   }
  	   return null;
     }
     
}
