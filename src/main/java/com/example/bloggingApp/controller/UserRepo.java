package com.example.bloggingApp.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserE, Integer>{
	
}
