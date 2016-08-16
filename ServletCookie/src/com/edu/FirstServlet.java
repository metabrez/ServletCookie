package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String n=request.getParameter("userName");
			
			pw.print("Welcome  " +n);
			
			//creating cookie object
			
			Cookie ck=new Cookie("uname", n);
			
			//Adding cookie in the response
			
			response.addCookie(ck);
			
			//creating Submit Button
			
			pw.print("<form action='servlet2'>");
			
			pw.print("<input type='submit' value='go>");
			
			pw.print("</form>");
			
			pw.close();
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
		
		
		
	}

	

}
