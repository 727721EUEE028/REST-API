package com.example.day5PutandDeleteMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day5PutandDeleteMapping.model.PetShop;

public interface PetShopRep extends JpaRepository<PetShop,Integer>{

}
