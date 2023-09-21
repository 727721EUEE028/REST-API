package com.example.FinalProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FinalProject.model.Room;
import com.example.FinalProject.service.Roomservice;


@RestController
@CrossOrigin
@RequestMapping("/")
public class Roomcontroller {
	
        @Autowired
        public Roomservice eser;
        
        @PostMapping("/room")
   	 public Room postRoomInfo(@RequestBody Room r) {
   	   	  return eser.saveRoom(r);
   	   	
   	    }
   	    @GetMapping("/getroom")
   	    public List<Room> getRoom(){
   	   	 return eser.getRoom();
   	    }
   	 @PutMapping("/updateRoom/{roomid}")
     public ResponseEntity<String>updateRoomInfo(@PathVariable int roomid){
   		
    	 boolean updated=eser.updateRoomif(roomid);
    	 if(updated) {
    		 return ResponseEntity.ok(roomid+" id updated successfully");
    	 }
    	 else {
    		 
    		 return ResponseEntity.status(HttpStatus.NOT_FOUND).body(roomid+" id not found");
    	 }
     }
   	@PutMapping("/update/{roomnumber}/{availability}")
    public int  updateRoom(@PathVariable int roomnumber, @PathVariable  String availability) {
   		
   		return eser.updateroom(roomnumber, availability);
        //return ResponseEntity.ok("Room availability updated successfully");
    }
}

