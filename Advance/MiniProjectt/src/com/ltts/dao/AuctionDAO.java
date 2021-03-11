package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.modal.Auction;
import com.ltts.modal.Team;

public class AuctionDAO {

	public boolean insertAuction(Auction  a) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into auction values(?,?,?,?,?)");
		ps.setInt(1,a.getAuc_id());
		ps.setInt(2, a.getPlayer_id());
		ps.setInt(3, a.getTeam_id());
		ps.setString(4, a.getYear1());
		ps.setInt(5, a.getSold_price());
		return ps.execute();
}
public List<Auction> getAllAuctions() throws Exception {
		
		List<Auction> li=new ArrayList<Auction>();
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("Select * from Auction");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),
					rs.getString(4),rs.getInt(5)));
		}
		return li;
	}

}