package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.FinalProject.model.Room;

import jakarta.transaction.Transactional;

public interface Roomrepository extends JpaRepository<Room, Integer> {
	@Transactional
    @Modifying
    @Query("UPDATE Room r SET r.availability = :availability WHERE r.roomnumber = :roomnumber")
    public int  updateRoom(@Param("roomnumber") int roomnumber, @Param("availability") String availability);
	

}
