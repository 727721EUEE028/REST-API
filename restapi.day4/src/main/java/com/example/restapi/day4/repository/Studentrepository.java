package com.example.restapi.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.day4.model.Student;

public interface Studentrepository extends JpaRepository<Student, Integer>{

}
