package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;


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
}