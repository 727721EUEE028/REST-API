package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.FinalProject.model.Login;

public interface Loginrepository extends JpaRepository<Login,Long>{
	//Login findByUsername(String username);
	@Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Login c WHERE c.username = :username and c.password=:password")
    boolean existsByName(@Param("username") String username,@Param("password") String password);
}
