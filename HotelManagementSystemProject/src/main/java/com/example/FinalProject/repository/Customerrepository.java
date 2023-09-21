package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProject.model.Customer;

public interface Customerrepository extends JpaRepository<Customer, Integer>{

}
