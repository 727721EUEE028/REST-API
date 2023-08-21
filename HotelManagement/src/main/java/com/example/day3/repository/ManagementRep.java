package com.example.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day3.model.HotelManagement;

public interface ManagementRep extends JpaRepository<HotelManagement,Integer> {

}
