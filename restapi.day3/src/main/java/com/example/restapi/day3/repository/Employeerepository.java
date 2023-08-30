package com.example.restapi.day3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.day3.model.Employee;

public interface Employeerepository extends JpaRepository<Employee, Long> {

}
