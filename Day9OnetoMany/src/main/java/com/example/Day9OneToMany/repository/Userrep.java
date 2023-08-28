package com.example.Day9OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day9OneToMany.model.User;

public interface Userrep extends JpaRepository<User, Long> {

}
