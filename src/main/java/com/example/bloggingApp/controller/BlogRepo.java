package com.example.bloggingApp.controller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<BlogE, Integer> {
	
}
