package com.example.FinalProject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.FinalProject.model.Checkout;

import jakarta.transaction.Transactional;

public interface Checkoutrepository extends JpaRepository<Checkout, Integer> {
	 @Transactional
	    @Modifying
	    @Query("DELETE FROM Checkout c WHERE c.roomnumber = :roomnumber")
	    int deleteByRoomnumber(@Param("roomnumber") int roomnumber);
}
	
