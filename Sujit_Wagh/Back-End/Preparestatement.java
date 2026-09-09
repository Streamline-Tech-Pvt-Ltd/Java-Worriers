package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Preparestatement {

	public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/company";
	String username="root";
	String password="root";
	try {
	Connection con=	DriverManager.getConnection(url,username,password);
	String sql="INSERT INTO interns VALUES(?,?,?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, 3);
	ps.setString(2, "Aditya");
	ps.setString(3, "Java");
int i= ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Data inserted succefully");
		}else
		{
			System.out.println("Data can not inserted");
		}
		
	String sql="UPDATE interns SET name=? WHERE id=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, "sujit");
	ps.setInt(2, 1);
int i=	ps.executeUpdate();
if(i>0)
{
	System.out.println("Data Updated succefully");
}else
{
	System.out.println("Data can not updated");
}
	String sql="SELECT * FROM interns";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		int id=rs.getInt("id");
		String name=rs.getString("name");
		String domain = rs.getString("domain");
		System.out.println(id+" "+name+" "+domain);
	}
	String sql="DELETE FROM interns WHERE id=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, 3);
int i=	ps.executeUpdate();
if(i>0)
{
	System.out.println("Data Deleted Succefully");
}else
{
	System.out.println("Data Can not deleted");
}
	
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
