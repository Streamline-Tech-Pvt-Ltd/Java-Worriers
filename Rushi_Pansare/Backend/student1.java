package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class student1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String password = "root123";
		try (Connection con = DriverManager.getConnection(url, username, password)) {

		Statement smt = con.createStatement();
//			String sql = ("Update student set city=? where roll_no=?");//update Query
		String sql = ("Delete from student where roll_no=?");	//Delet  Query
			
			PreparedStatement ps = con.prepareStatement(sql);
			
//			ps.setString(1, "jaypur");
			ps.setInt(1, 6);
			
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
