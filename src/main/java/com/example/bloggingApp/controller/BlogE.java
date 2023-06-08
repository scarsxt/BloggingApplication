package com.example.bloggingApp.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BlogE {
	@Id
	int id;
	String msg, category, name;
	public BlogE() {
		super();
	}
	public BlogE(int id, String msg, String category, String name) {
		super();
		this.id = id;
		this.msg = msg;
		this.category = category;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
