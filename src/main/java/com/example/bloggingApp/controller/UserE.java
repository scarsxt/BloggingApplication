package com.example.bloggingApp.controller;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserE {
	@Id
	int id;
	String imgUrl, name, dob, email, password, phno;
	public UserE() {
		super();
	}
	public UserE(int id, String imgUrl, String name, String dob, String email, String phno, String password) {
		super();
		this.id = id;
		this.imgUrl = imgUrl;
		this.name = name;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println(name);
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
