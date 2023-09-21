package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProject.model.Employee;

public interface Employeerepository extends JpaRepository<Employee, Long>{

}
