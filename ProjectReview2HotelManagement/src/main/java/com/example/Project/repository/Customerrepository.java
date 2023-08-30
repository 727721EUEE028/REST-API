package com.example.Project.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Project.model.Customer;



public interface Customerrepository extends JpaRepository<Customer, Integer> {
	
	

}
