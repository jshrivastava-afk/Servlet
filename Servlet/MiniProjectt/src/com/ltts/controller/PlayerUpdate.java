package com.ltts.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.PlayerDAO;
import com.ltts.modal.Player;

/**
 * Servlet implementation class PlayerUpdate
 */
@WebServlet("/PlayerUpdate")
public class PlayerUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PlayerUpdate() {
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
	 
		int id=Integer.parseInt(request.getParameter("Player_ID"));
	    String p_name= request.getParameter("Player_Name");
	    String p_dob= request.getParameter("Player_DOB");
	    Date dob=Date.valueOf(p_dob);
	    String p_skills=request.getParameter("Player_skills");
	    int p_runs=Integer.parseInt(request.getParameter("Player_Runs"));
	    int p_wick=Integer.parseInt(request.getParameter("Player_wickets"));
	    int p_num=Integer.parseInt(request.getParameter("Player_numberofmatches"));
	    int t_id=Integer.parseInt(request.getParameter("teamid"));
	    
	    Player p=new Player(id,p_name,dob,p_skills,p_runs,p_wick,p_num,t_id);
	    System.out.println("Inside Servlet: "+p);
	    
	    PlayerDAO pd=new PlayerDAO();
	    
	    boolean b=false;
	    try
	    {
	    	b=pd.updatePlayer(id, p_name, dob, p_skills, p_runs, p_wick, p_num, t_id);
	    	System.out.println("Successfully Updated");
	    }
        catch(Exception e){
        	
        	e.printStackTrace();
        }
        }
}
