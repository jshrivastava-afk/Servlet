package com.ltts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.UserDAO;
import com.ltts.modal.User;

/**
 * Servlet implementation class ServletLog
 */

public class ServletLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		String u_name=request.getParameter("UserName");
		String u_pass=request.getParameter("UserPassword");
		
		User u = new User(u_name,u_pass);
		System.out.println("Inside Servlet: "+u);
		
		UserDAO ud=new UserDAO();
		
		try {
			
			boolean b=ud.validateUser(u);
			
			if(b==true)
			{
				System.out.println("Logged IN");
			}
			if(b==false)
			{
				System.out.println("Incorrect Username or Password");
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
	}

}
