package com.example.bloggingApp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/write")
public class BlogPost extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	BlogRepo br;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/writeP.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Register servlet");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/writeP.jsp");
		rd.forward(request, response);
		
		List<BlogE> blogR = br.findAll();
		int i = blogR.size();
		BlogE be = new BlogE();
		be.category = request.getParameter("category");
		be.msg = request.getParameter("message");
//		HttpSession session=request.getSession();
		be.name = request.getParameter("name");
		System.out.print(be.name);
		be.id = i+1;
		
		br.save(be);
  
	}
}
