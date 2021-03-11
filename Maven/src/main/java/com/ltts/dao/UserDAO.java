package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.ltts.configuration.MyConnection;
import com.ltts.modal.User;

public class UserDAO {

	public boolean insertUser(User u) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("insert into user values(?,?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPass());
		
		return ps.execute();
}
	public boolean validateUser(User u) throws Exception
	{
		Connection c= MyConnection.getConnection();
		
		PreparedStatement ps= c.prepareStatement("select * from user where UserName=? && UserPassword=?");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPass());
		
		return ps.execute();
		
}
	
	
}
