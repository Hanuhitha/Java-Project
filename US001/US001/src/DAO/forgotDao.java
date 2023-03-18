package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class forgotDao 
{
	public boolean securityquestion(String u,String s,String a)
	{
		String squestion1=null;
		String sanswer1=null;
		ResultSet rs=null;
		boolean b=false;
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
			ps=conn.prepareStatement("select squestion,sanswer from userdetails where userid=?");
			ps.setString(1, u);
			rs=ps.executeQuery();
			while(rs.next())
			{
				 squestion1=rs.getString("squestion");
				 System.out.println(squestion1);
				 sanswer1=rs.getString("sanswer");
				 System.out.println(sanswer1);
			}
			if(s.equalsIgnoreCase(squestion1) && a.equalsIgnoreCase(sanswer1))
			{
				System.out.println("if");
				b=true;
			}
			
			
			
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
		return b;
	}

	
	public int updatepassword(String pswd,String id)
	{
		int i=0;
		
		
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
			ps=conn.prepareStatement("update userdetails set password=? where userid=?");
			ps.setString(1,pswd);
			ps.setString(2, id);
			i=ps.executeUpdate();
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
		return i;
	}
}
