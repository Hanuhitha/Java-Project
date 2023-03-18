package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Date;

import bean.user;

public class SignDao 
{
	public int addUser(user u)
	{
		int num=0;
	Connection conn=null;
    PreparedStatement ps=null;
    String URL = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
    
	String userName = "HJA12ORAUSER1D";
	String password = "tcshyd";
	try
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn=DriverManager.getConnection(URL,userName,password);
		System.out.println("successful");
		ps=conn.prepareStatement("insert into userdetails values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,u.getFname());
		ps.setString(2,u.getLname());
		
		ps.setString(3,u.getEmail());
		
		ps.setString(4,u.getUserId());
		ps.setString(5,u.getSquestion());
		ps.setString(6,u.getSanswer());
		ps.setString(7,u.getPassword());
		ps.setInt(8,u.getPhonenum());
		ps.setDate(9,new java.sql.Date(u.getDob().getTime()));
		ps.setString(10,u.getRole());
		num=ps.executeUpdate();
		
	}catch(SQLException e)
	{
		System.out.println(e);
	}
	catch(ClassNotFoundException e)
	{
	
	}finally
	{
		if(ps != null)
		try 
		{
			ps.close();
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		if(conn != null)
			try 
			{
				conn.close();
			} 
			catch (SQLException e) 
			{
			
				e.printStackTrace();
			}
	}
	return num;
	}
}
