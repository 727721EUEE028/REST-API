package com.example.FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FinalProject.model.Signin;

public interface Signinrepository extends JpaRepository<Signin, Integer> {
	Signin findByEmail(String email);
}
