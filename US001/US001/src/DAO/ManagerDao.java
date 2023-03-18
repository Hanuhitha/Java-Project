package DAO;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.ws.Response;

import bean.Manager;
public class ManagerDao {
	Connection connection;
	String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
	private String user = "HJA12orauser1D";
	private String pwd = "tcshyd";
	public Connection getConnection()
	{
		try
		{
			Class.forName(driver);	
			connection = DriverManager.getConnection(url,user,pwd);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		return connection;
	}
	public boolean addManager(Manager Manager)
	{
		Connection conn = getConnection();
		boolean result = false;
		try
		{
			PreparedStatement pst = conn.prepareStatement("insert into Managers values(?,?,?,?,?,?)");
			pst.setString(1, Manager.getFullName());
			pst.setString(2, Manager.getDob());
			pst.setString(3, Manager.getArea());
			pst.setString(4, Manager.getCity());
			pst.setString(5, Manager.getStateZone());
			pst.setString(6, Manager.getDesignation());
			
			int rows = pst.executeUpdate();
			if(rows > 0)
			{
				result = true;
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public Manager viewManager(String Fullname) {
		Connection conn = getConnection();
		Manager Manager = null;
		try
		{
			PreparedStatement pst = conn.prepareStatement("select * from Managers where fullname = '" + Fullname + "'");
			ResultSet rs= pst.executeQuery();
			
			if(rs.next())
			{
				Manager= new Manager();
				
				Manager.setFullName(rs.getString(1));
				Manager.setDob(rs.getString(2));
				Manager.setArea(rs.getString(3));
				Manager.setCity(rs.getString(4));
				Manager.setStateZone(rs.getString(5));
				Manager.setDesignation(rs.getString(6));
				
					
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return Manager;
	}
	@SuppressWarnings("null")
	public Manager updateManager(Manager Manager,String fullname)
	{
		Connection conn = getConnection();
		Manager Manager1 = null;
		System.out.println(fullname);
		try
		{
			PreparedStatement pst = conn.prepareStatement("update Managers set dob=? ,area=? ,city=? ,statezone=? , designation=? where fullname = ? ");
			pst.setString(1, Manager.getDob());
			pst.setString(2, Manager.getArea());
			pst.setString(3, Manager.getCity());
			pst.setString(4, Manager.getStateZone());
			pst.setString(5, Manager.getDesignation());
			pst.setString(6, fullname);
			ResultSet rs= pst.executeQuery();
			
			if(rs.next())
			{
				Manager1.setDob(rs.getString("dob"));
				Manager1.setArea(rs.getString("area"));
				Manager1.setCity(rs.getString("city"));
				Manager1.setStateZone(rs.getString("statezone"));
				Manager1.setDesignation(rs.getString("designation"));
						
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return Manager1;
	}
	public Manager deleteManager(Manager Manager,String s)
	{
		Connection conn = getConnection();
		Manager Manager1 = null;
		try
		{
			
			PreparedStatement pst = conn.prepareStatement("delete from Managers where fullname = '" + s + "'");
			ResultSet rs= pst.executeQuery();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	return Manager1;
	}
	
	}





