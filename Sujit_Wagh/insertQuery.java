package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertQuery {

	public static void main(String[] args) {
		// Load and Register Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Provide The Connection
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
// Create a statement
                Statement  smt= con.createStatement();
                // Execute sql query
                String sql="INSERT INTO inter_info VALUES(3,'kabir','kk@gmail.com','Uk')";
             int i=   smt.executeUpdate(sql);
                System.out.println(i+" "+"Data Inserteted Sucefully");
                smt.close();
                con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
