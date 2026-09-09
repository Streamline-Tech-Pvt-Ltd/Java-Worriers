package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Student2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String password = "root123";
		try (Connection con = DriverManager.getConnection(url, username, password)) {

		Statement smt = con.createStatement();
			String sql = ("Insert into student(roll_no,name,city) values (?,?,?)");
			
		
			
			PreparedStatement ps = con.prepareStatement(sql);
			
//			ps.setInt(1, 4);
//			ps.setString(2, "Shree");
//			ps.setString(3, "akola");
			
			ps.setInt(1, 5);
			ps.setString(2, "arun");
			ps.setString(3, "thane");
			
			ps.setInt(1, 6);
			ps.setString(2, "jay");
			ps.setString(3, "vashi");
			int row = ps.executeUpdate();// used to update values executrUpdate
			System.out.println("rows updated sucessfully  :"  +row);
			ResultSet rs = smt.executeQuery("Select * From student");

			while (rs.next()) {
				int roll_no = rs.getInt("Roll_no");
				String name = rs.getString("name");
				String city = rs.getString("city");
				System.out.println(roll_no + "| " + name + " | " + city + "  ");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
