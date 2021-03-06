package com.ltts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.AuctionDAO;
import com.ltts.dao.TeamDAO;
import com.ltts.modal.Auction;
import com.ltts.modal.Team;

/**
 * Servlet implementation class AuctionServlet
 */
@WebServlet("/AuctionServlet")
public class AuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionServlet() {
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
		int a_id=Integer.parseInt(request.getParameter("Auc_id"));
	    int p_id=Integer.parseInt(request.getParameter("Player_id"));
		int t_id=Integer.parseInt(request.getParameter("Team_id"));
		String a_year=request.getParameter("Year1");
		int a_price=Integer.parseInt(request.getParameter("Sold_price"));
		
		Auction a= new Auction(a_id,p_id,t_id,a_year,a_price);
		System.out.println("Inside Servlet: "+a);
		
		AuctionDAO ad=new AuctionDAO();
		boolean b=false;
		try {
			b=ad.insertAuction(a); // Control TRanfers to Dao file
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
