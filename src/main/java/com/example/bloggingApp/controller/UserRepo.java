package com.example.bloggingApp.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserE, Integer>{
	public UserE findByEmail(String email);
	public UserE findByEmailAndPassword(String email, String password);
//	public List<UserE> findByEmail(String email);
	public UserE findByNameAndEmail(String name, String email);
}

