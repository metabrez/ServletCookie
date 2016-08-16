package com.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			
			//For getting Cookie object
			  Cookie ck[]=request.getCookies();  
			    pw.print("Hello "+ck[0].getValue());  
			  
			    pw.close();  
			
		}
		
		catch(Exception e){
			
			System.out.println(e);
		}
		
		
		
		
		
	}

	

}
