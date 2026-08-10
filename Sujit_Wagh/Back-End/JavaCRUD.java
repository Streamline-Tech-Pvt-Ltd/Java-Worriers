package com.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Java_CRUD {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
Statement smt=con.createStatement();
// Insert SQL Query
String sql="INSERT INTO inter_info VALUES(3,'akshay','ak@gmail.com','nashik','sql developer')";
int i=smt.executeUpdate(sql);
if(i>0)
{
	System.out.println("Data inserted succefully");
}else
{
	System.out.println("Data can not inserted succefully");
}
 //Display SQL Query
    ResultSet rs =   smt.executeQuery("SELECT * FROM inter_info");
    while(rs.next())
    {
    	System.out.println(rs.getInt("id"));
    	System.out.println(rs.getString("name"));
    	System.out.println(rs.getString("email"));
    	System.out.println(rs.getString("city"));
    	System.out.println(rs.getString("dep"));
    	System.out.println("-------------");
    }
    // Update SQL Query
    String sql ="UPDATE inter_info SET city='ahilynagar' WHERE id=3";
  int i=  smt.executeUpdate(sql);
  if(i>0)
  {
	  System.out.println("Data Updated Succefully");
  }else
  {
	  System.out.println("Data Can not updated");
  }
// Delete SQL Query
String sql="DELETE FROM inter_info WHERE id=4";
int i=smt.executeUpdate(sql);
if(i>0)
{
	System.out.println("Data Deleted succefully");
}else
{
	System.out.println("Data Can not deleted ");
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
