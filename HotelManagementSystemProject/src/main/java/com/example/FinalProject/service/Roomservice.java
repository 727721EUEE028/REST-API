package com.example.FinalProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FinalProject.model.Room;
import com.example.FinalProject.repository.Roomrepository;

import jakarta.transaction.Transactional;


@Service
public class Roomservice {
  @Autowired
  public Roomrepository rrep;
   
  
  
  public Room saveRoom(Room r) {
	   return rrep.save(r);
  }
  public List<Room> getRoom(){
	   return rrep.findAll();
  }
  public boolean updateRoomif(int roomid) {
  	   if(rrep.existsById(roomid)) {
  		  
  		   return true;
  	   }
  	   return false;
     }
  public int updateroom(int roomno,String avaiable) {
	  return rrep.updateRoom(roomno, avaiable);
  }
}
