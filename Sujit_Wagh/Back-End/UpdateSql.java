package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateSql {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection  con =	DriverManager.getConnection("jdbc:mysql://localhost/company","root","root");
Statement smt =	con.createStatement();
String sql="UPDATE inter_info SET name='sham' WHERE id=2";
int count =smt.executeUpdate(sql);
if(count >0)
{
	System.out.println("Data updated succefully");
}else
{
	System.out.println("Data can not updated");
}
smt.close();
con.close();
	}catch(Exception e)
		{
		e.printStackTrace();
		}

}
}
