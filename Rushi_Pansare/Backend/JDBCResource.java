package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class JDBCResource {
	public static void main(String[] args) throws SQLException {
		String url ="jdbc:mysql://localhost:3306/employe";
		String username="root";
		String password ="root123";
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery("select * from Employee")) {
			System.out.println("datbase connection sucessful");
			
			while (rs.next()) {
				int id = rs.getInt("Empid");
				String name = rs.getString("Emp_name");
				String salary = rs.getString("Emp_salary");
				System.out.println( id+  "| "+ name +" | "  +salary +" | " );
			}
			
		} catch (SQLDataException e) {
			e.printStackTrace();
		}
	}

}
