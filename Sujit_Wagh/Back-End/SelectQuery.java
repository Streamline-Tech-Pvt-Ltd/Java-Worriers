package com.crud;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
Statement st=con.createStatement();
  ResultSet rs=   st.executeQuery("SELECT * FROM inter_info");
  while(rs.next())
  {
	  System.out.println(rs.getInt("id"));
	  System.out.println(rs.getString("name"));
	  System.out.println(rs.getString("email"));
	  System.out.println(rs.getString("city"));
	  System.out.println("-------------");
  }
  rs.close();
  st.close();
  con.close();

	}catch(Exception e)
		{
		e.printStackTrace();
		}

}
}
