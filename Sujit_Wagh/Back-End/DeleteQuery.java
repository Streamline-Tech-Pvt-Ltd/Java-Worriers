package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteQuery {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =	DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
Statement st=	con.createStatement();
String sql="DELETE FROM inter_info WHERE id=3";
int i=st.executeUpdate(sql);
if(i>0)
{
	System.out.println("Data Deleted Sucefully");
}else
{
	System.out.println("Data Can not Deleted Sucefully");
}
st.close();
con.close();
		
	}catch(Exception e)
		{
		e.printStackTrace();
		}

	}
}
