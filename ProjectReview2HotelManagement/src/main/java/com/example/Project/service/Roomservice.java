package com.example.Project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.model.Room;
import com.example.Project.repository.Roomrepository;

@Service
public class Roomservice {
          @Autowired
          public Roomrepository rrep;
          
          //post the data
          public Room saveDetails(Room r) {
        	  return rrep.save(r);
          }
          
          //get the data
          public List<Room> getDetails(){
        	  return rrep.findAll();
          }
          
        //update the data
          
          public boolean updateRoomif(int guestid) {
         	   if(rrep.existsById(guestid)) {
         		  
         		   return true;
         	   }
         	   return false;
            }
        
          //delete the data
          
		public boolean deleteRoomif(int guestid) {
			if(rrep.existsById(guestid)) {
      		   rrep.deleteById(guestid);
      		   return true;
      	   }
			return false;
		}
		//get all the data
		public List<Room> getAllRows(){
			return rrep.getAllRows();
		}
		//get specific rows
		public List<Room> getSpecRows(String type,Double price){
			return rrep.getSpecRows(type, price);
		}
		
}
