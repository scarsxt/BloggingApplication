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

@WebServlet("/blogs")
public class Menu extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	UserRepo ur;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
		rd.forward(request, response);
		HttpSession session=request.getSession();  
		System.out.print("Display");
		String mail = (String)session.getAttribute("UserEmail");
//		List<UserE> records = ur.findByEmail(mail);
		UserE ue = ur.findByEmail(mail);
		String name = ue.name;
		String phno = ue.phno;
		String url = ue.imgUrl;
		System.out.print(name + phno + url);
		session.setAttribute("Email", mail);
		session.setAttribute("Phno", phno);
		session.setAttribute("url", url);
		session.setAttribute("Name", name);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Register servlet");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/menu.jsp");
		rd.forward(request, response);
	}
	
//	public void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//	}
	
}
