package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PolicyDatabase {

	private static final String URL="jdbc:oracle:thin:@172.25.192.82:1521:javadb";
	private static final String USERNAME="HJA12ORAUSER1D";
	private static final String PASSWORD="tcshyd";
	private static final String DRIVER_NAME="oracle.jdbc.driver.OracleDriver";
	
	public static Connection getConnection()
	{
		Connection con=null;
		
		try
		{
			Class.forName(DRIVER_NAME);
			con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	public static void closeConnection(Connection con)
	{
		if(con!=null)
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void closeStatement(PreparedStatement ps)
	{
		if(ps!=null)
		{
			try{
				ps.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
}
