package com.example.Day9OneToMany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Day9OneToMany.model.Address;

public interface Addressrep extends JpaRepository<Address, Long> {

}
