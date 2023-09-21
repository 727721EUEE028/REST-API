package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProject.model.Admin;

public interface Adminrepository extends JpaRepository<Admin, Long> {
	   

}
