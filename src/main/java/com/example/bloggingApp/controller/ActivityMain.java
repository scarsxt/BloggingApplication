package com.example.bloggingApp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import reactor.netty.http.server.HttpServerResponse;

@WebServlet("/register")
public class ActivityMain extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserRepo ur;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/activitymain.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Register servlet");
		try {
			UserE ue = new UserE();
			ue.email = request.getParameter("email");
			ue.name = request.getParameter("username");
			ue.password = request.getParameter("password");
			ue.dob = request.getParameter("dob");
			ue.imgUrl = request.getParameter("name");
			ue.phno = request.getParameter("phno");
			ur.save(ue);
			System.out.print("Successful");
		}
		catch(Exception e) {
			System.out.println("Unsuccessful");
		}
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		rd.forward(request, response);	
  
	}
}
