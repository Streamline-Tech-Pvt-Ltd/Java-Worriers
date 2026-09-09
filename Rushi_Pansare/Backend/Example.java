package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Example {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/employe";
		String username="root";
		String password ="root123";
		
		try(Connection con = DriverManager.getConnection(url, username, password)){
			
			String sql ="select * from Employee where Emp_name =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "om");
			ResultSet rs=ps.executeQuery(); 
			while (rs.next()) {
				int id = rs.getInt("Empid");
				String name = rs.getString("Emp_name");
				System.out.println( id+  "| "+ name +" | " );
			}
		}
		catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}



