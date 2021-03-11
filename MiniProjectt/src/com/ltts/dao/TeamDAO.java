package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.modal.Team;

public class TeamDAO {

	public boolean insertTeam(Team t) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setInt(1,t.getTeam_id());
		ps.setString(2, t.getTeamname());
		ps.setString(3, t.getOwnername());
		ps.setString(4, t.getCoachname());
		ps.setInt(5, t.getCaptain_id());
		return ps.execute();
}
	public List<Team> getAllTeams() throws Exception {
		
		List<Team> li=new ArrayList<Team>();
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("Select * from Team");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),
		    rs.getString(4),rs.getInt(5)));
		}
		return li;
	}
}