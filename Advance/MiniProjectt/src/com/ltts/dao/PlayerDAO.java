package com.ltts.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
	import com.ltts.configuration.MyConnection;
	import com.ltts.modal.Player;

	public class PlayerDAO {

		
		
				public boolean insertPlayer(Player p) throws Exception
				{
					Connection c= MyConnection.getConnection();
					PreparedStatement ps= c.prepareStatement("insert into player values(?,?,?,?,?,?,?,?)");
					ps.setInt(1, p.getPlayer_id());
					ps.setString(2, p.getName());
					ps.setDate(3, (Date) p.getDate());
					ps.setString(4, p.getSkills());
					ps.setInt(5, p.getRuns());
					ps.setInt(6, p.getWickets());
					ps.setInt(7, p.getNumber_of_matches());
					ps.setInt(8, p.getTeam_id());
					return ps.execute();
				}
				
				public List<Player> getAllPlayers() throws Exception {
					
					List<Player> li=new ArrayList<Player>();
					Connection c= MyConnection.getConnection();
					PreparedStatement ps= c.prepareStatement("Select * from Player");
					ResultSet rs=ps.executeQuery();
					
					while(rs.next())
					{
						li.add(new Player(rs.getInt(1),rs.getString(2),rs.getDate(3),
					    rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),
					    rs.getInt(8)));
					}
					return li;
				}
      
	
	}

