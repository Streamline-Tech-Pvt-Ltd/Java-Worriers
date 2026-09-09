package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		// first step :-load the register jdbc driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//path complsoury
			System.out.println("jdbc driver load sucessfully");

			// 2nd step:-create connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root123");
			System.out.println("connection create sucessfully");
			
			// 3rs step is to (prepare) *create a statment*
//			String sql ="select * from student";
			
			String sql = "DELETE FROM student " +
		             "WHERE id = 1";
			
//			String sql = "UPDATE student " +
//		             "set city = 'rahta' " +
//		             "where id = 1";
			Statement smt = con.createStatement();
			System.out.println("sucesfully created statment");

			// 4 step execute sql query
			int ins=smt.executeUpdate(sql);
//			System.out.println(ins + " result is return sucessfully");
			System.out.println(ins + " updated sucessfully");
			
//			//step 5 process the result
//			
//			int ins = smt.executeUpdate(sql);
//			System.out.println(ins+"record inserted sucessfully");
			
			
			
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				String email = rs.getString("email");
//				String city = rs.getString("city");
//				
//				System.out.println( id+  "| "+ name +  email +"  |"  + city);
//				
//			}
				//step 6 close connection
				//rs.close();
				smt.close();
				con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
