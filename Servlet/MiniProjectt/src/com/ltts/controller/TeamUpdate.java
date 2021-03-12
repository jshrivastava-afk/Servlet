package com.ltts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.TeamDAO;
import com.ltts.modal.Team;

/**
 * Servlet implementation class TeamUpdate
 */
@WebServlet("/TeamUpdate")
public class TeamUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeamUpdate() {
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
		int t_id=Integer.parseInt(request.getParameter("TeamId"));
		String t_name=request.getParameter("Teamname");
		String to_name=request.getParameter("Ownername");
		String tc_name=request.getParameter("Coachname");
		int t_cid=Integer.parseInt(request.getParameter("Captain_id"));
		
		Team t= new Team(t_id,t_name,to_name,tc_name,t_cid);
		System.out.println("Inside Servlet: "+t);
		
		TeamDAO td=new TeamDAO();
		boolean b=false;
		try
	    {
	    	b=td.updateTeam(t_id,t_name,to_name,tc_name,t_cid);
	    	System.out.println("Successfully Updated");
	    }
        catch(Exception e){
        	
        	e.printStackTrace();
        }
		
	}

}
