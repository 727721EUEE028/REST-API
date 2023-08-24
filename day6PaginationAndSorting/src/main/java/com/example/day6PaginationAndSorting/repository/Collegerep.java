package com.example.day6PaginationAndSorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6PaginationAndSorting.model.College;

public interface Collegerep extends JpaRepository<College,Integer> {

}
