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
				public Player getPlayerById(int id) throws Exception {
					Player p=new Player();
					List<Player> li=getAllPlayers();
					for(Player P:li) {
						if(P.getPlayer_id() == id) {
							p.setPlayer_id(id);
							p.setName(P.getName());
							p.setDate(P.getDate());
							p.setSkills(P.getSkills());
							p.setRuns(P.getRuns());
							p.setWickets(P.getWickets());
							p.setNumber_of_matches(P.getNumber_of_matches());
							p.setTeam_id(P.getTeam_id());
						
						}
					}
					
					return p;
				
			} 
				public boolean updatePlayer(int player_id, String name, Date date, String skills, int runs, int wickets, int number_of_matches,
						int team_id) throws Exception {
					
					
					Connection c=MyConnection.getConnection();
					PreparedStatement ps=c.prepareStatement("UPDATE Player SET Player_Name=?,Player_DOB=?,Player_skills=?,Player_Runs=?,Player_wickets=?,Player_numberofmatches=?, teamid=? where Player_ID=?");
                    ps.setInt(1, player_id);
                    ps.setString(2, name);
                    ps.setDate(3, date);
                    ps.setString(4, skills);
                    ps.setInt(5, runs);
                    ps.setInt(6, wickets);
                    ps.setInt(7, number_of_matches);
                    ps.setInt(8, team_id);
                    
					
					
					
				
				return ps.execute();
				}
	}

