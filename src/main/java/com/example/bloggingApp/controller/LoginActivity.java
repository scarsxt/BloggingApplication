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

//@WebServlet("/login")
//public class LoginActivity extends HttpServlet {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	@Autowired
//	UserRepo ur;
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
//		rd.forward(request, response);
//		
//		UserE ue = new UserE();
//		ue.name = request.getParameter("username");
//		ue.password = request.getParameter("password");
//		
//		UserE uefind = ur.findByEmailAndPassword(ue.name, ue.password);
//		if(uefind != null) {
//			RequestDispatcher rd1 = request.getRequestDispatcher("/menu");
//			
//
//			rd1.forward(request, response);
//		}
//		else {
//			System.out.println("Login Unsuccessful");
//		}
//		
//	}
//	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		try {
//			UserE ue = new UserE();
//			ue.email = request.getParameter("email");
//			ue.name = request.getParameter("username");
//			ue.password = request.getParameter("password");
//			ue.dob = request.getParameter("dob");
//			ue.imgUrl = request.getParameter("name");
//			ue.phno = request.getParameter("phno");
//			ur.save(ue);
//			System.out.print("Successful");
//		}
//		catch(Exception e) {
//			System.out.println("Unsuccessful");
//		}
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
//		rd.forward(request, response);	
//	}
//}
//
//
////action="${pageContext.request.contextPath }/blogs"


//package com.example.bloggingApp.controller;

import java.io.IOException;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

@WebServlet("/login")
public class LoginActivity extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserRepo ur;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserE user = ur.findByEmailAndPassword(username, password);
		if (user != null) {
			request.setAttribute("user", user);
//			RequestDispatcher rd = request.getRequestDispatcher("/blogs");
			
			
			
			HttpSession session=request.getSession();
			
			
			
			session.setAttribute("UserEmail", username);
//			System.out.print("Display");
//			String mail = (String)session.getAttribute("UserEmail");
//			List<UserE> records = ur.findByEmail(mail);
			UserE ue = ur.findByEmail(username);
			String name = ue.name;
			String url = ue.imgUrl;
			session.setAttribute("Name", name);
			session.setAttribute("URL", url);
			System.out.print(name);
			String n = (String) session.getAttribute(name);
//			rd.forward(request, response);
			response.sendRedirect("/blogs");
			
			
			
		} else {
			System.out.println("Login Unsuccessful");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
			rd.forward(request, response);
		}
	}
}