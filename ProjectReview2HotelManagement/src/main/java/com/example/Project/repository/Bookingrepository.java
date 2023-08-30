package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.model.Booking;

public interface Bookingrepository extends JpaRepository<Booking, Integer>{

}
