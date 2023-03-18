package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.ArrayList;

import bean.Customerdetails;



public class registrationDao 
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement st=null;
	
	
	public int regCustomer(Customerdetails cd1) throws SQLException,ClassNotFoundException
	{ 
		int i=0;
		int id=0;
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("insert into customertable(userid,firstname,middlename,lastname,dateofbirth,gender,PERMANENTADDRESS ,presentaddress,occupation,annualsalary,maritalstatus,children,email,phonenumber,pancard) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			System.out.println("query");
			ps.setString(1,cd1.getId());
			
			
			ps.setString(2,cd1.getFirstname());
			System.out.println("s2");
			
			ps.setString(3,cd1.getMiddlename());
			System.out.println("s3");
			
			ps.setString(4,cd1.getLastname());
			System.out.println("s4");
			try
			{
			ps.setDate(5,new java.sql.Date(cd1.getDateofbirth().getTime()));
			System.out.println("s5");
			}catch(Exception e)
			{
				System.out.println(e);
			}
			//System.out.println();
			System.out.println("catch");
			ps.setString(6, cd1.getGender());
			ps.setString(7, cd1.getPemanentaddress());
			ps.setString(8, cd1.getPresentaddress());
			ps.setString(9, cd1.getOccupation());
			ps.setDouble(10, cd1.getAnnualsalary());
			System.out.println(cd1.getAnnualsalary());
			ps.setString(11, cd1.getMaritalstatus());
			System.out.println("s1");
			ps.setString(12, cd1.getChildren());
			System.out.println("s2");
			ps.setString(13, cd1.getEmail());
			System.out.println("s3");
			ps.setInt(14, cd1.getPhonenumber());
			System.out.println("s4");
			ps.setString(15, cd1.getPancard());
			System.out.println("s5");
			
			i=ps.executeUpdate();
			System.out.println("execute");
			/*ps=con.prepareStatement("select customertable_seq.currval from customertable");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				id=rs.getInt(1);
			}*/
			}catch(Exception e)
			{
				System.out.println(e);
			}
			return i;
		}
		
		
		
		
	
	
	
	
	public Customerdetails modifycustomer(Customerdetails cd,String id)
	{
		//ArrayList<Customerdetails> al=new ArrayList<Customerdetails>();
	int i=0;
		
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("select * from customertable where userid=?");
			ps.setString(1, id);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				
				cd.setId(rs.getString(1));
				cd.setFirstname(rs.getString(2));
				
				cd.setMiddlename(rs.getString(3));
				System.out.println(cd.getMiddlename());
				cd.setLastname(rs.getString(4));
				cd.setDateofbirth(rs.getDate(5));
				
				cd.setGender(rs.getString(6));
				cd.setPemanentaddress(rs.getString(7));
				cd.setPresentaddress(rs.getString(8));
				cd.setOccupation(rs.getString(9));
				cd.setAnnualsalary(rs.getDouble(10));
				cd.setMaritalstatus(rs.getString(11));
				cd.setChildren(rs.getString(12));
				cd.setEmail(rs.getString(13));
				cd.setPhonenumber(rs.getInt(14));
				cd.setPancard(rs.getString(15));
				
			
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cd;
	}
	public Customerdetails serachcustomer(Customerdetails cd,String id)
	{
		//ArrayList<Customerdetails> al=new ArrayList<Customerdetails>();
	
		
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("select * from customertable where userid=?");
			ps.setString(1, id);
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				
				cd.setId(rs.getString(1));
				cd.setFirstname(rs.getString(2));
				
				cd.setMiddlename(rs.getString(3));
				System.out.println(cd.getMiddlename());
				cd.setLastname(rs.getString(4));
				cd.setDateofbirth(rs.getDate(5));
				
				cd.setGender(rs.getString(6));
				cd.setPemanentaddress(rs.getString(7));
				cd.setPresentaddress(rs.getString(8));
				cd.setOccupation(rs.getString(9));
				cd.setAnnualsalary(rs.getDouble(10));
				cd.setMaritalstatus(rs.getString(11));
				cd.setChildren(rs.getString(12));
				cd.setEmail(rs.getString(13));
				cd.setPhonenumber(rs.getInt(14));
				cd.setPancard(rs.getString(15));
				
			
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return cd;
	}
	public int deletecustomer(Customerdetails cd,String id)
	{
		//ArrayList<Customerdetails> al=new ArrayList<Customerdetails>();
	
		int i=0;
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("delete from customertable where userid=?");
			System.out.println("query");
			ps.setString(1,id);
			i=ps.executeUpdate();
			System.out.println("execute");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	
	public int updateCustomer(Customerdetails cd1) throws SQLException,ClassNotFoundException
	{ 
		int i=0;
		Customerdetails cd=new Customerdetails();
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("update customertable set Middlename=?,lastname=?,dateofbirth=?,permanentaddress=?,presentaddress=?,occupation=?,annualsalary=?,maritalstatus=?,children=?,email=?,phonenumber=?,pancard=? where userid=?");
			System.out.println("query");
			ps.setString(1,cd1.getMiddlename());
			ps.setString(2, cd1.getLastname());
			try
			{
			ps.setDate(3,new java.sql.Date(cd1.getDateofbirth().getTime()));
			System.out.println("s date");
			}catch(Exception e)
			{
				System.out.println(e);
			}
			ps.setString(4, cd1.getPemanentaddress());
			ps.setString(5, cd1.getPresentaddress());
			ps.setString(6, cd1.getOccupation());
			ps.setDouble(7, cd1.getAnnualsalary());
			ps.setString(8, cd1.getMaritalstatus());
			
			ps.setString(9, cd1.getChildren());
			
			ps.setString(10, cd1.getEmail());
			
			ps.setInt(11, cd1.getPhonenumber());
			
			ps.setString(12, cd1.getPancard());
			
			ps.setString(13, cd1.getId());
			i=ps.executeUpdate();
			
			System.out.println(i);
			System.out.println("execute");
		}catch(Exception e)
		{
			
		}
		return i;
	}
}
