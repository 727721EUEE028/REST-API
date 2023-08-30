package com.example.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Project.model.Room;

public interface Roomrepository extends JpaRepository<Room, Integer>{
	
	//nativeQuery
	
		@Query(value="select * from Room", nativeQuery=true)
		public List<Room> getAllRows();  
		
		//@Query("select r from Room r where r.guestid like %?1%")
		//public List<Room> getById(@Param("id") int guestid);
		
		@Query(value="select * from Room where roomtype=:rtype and price=:price",nativeQuery=true)
		public List<Room> getSpecRows(@Param("rtype") String rtype,@Param("price") Double price);
		
       
}
