package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/students";
		String username = "root";
		String password = "root123";
		try (Connection con = DriverManager.getConnection(url, username, password)) {

//			Statement smt = con.createStatement();
			String sql = ("select * from student where name=? AND city=?");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "abhi");
			ps.setString(2, "nagpur");
			ResultSet rs = ps.executeQuery();

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
