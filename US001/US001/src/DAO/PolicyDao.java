package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.PolicyDatabase;

import bean.PolicyDetails;
import util.PolicyDatabase;



public class PolicyDao {

	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	Statement st=null;
	public ArrayList<Integer> getpolicyid() throws SQLException,ClassNotFoundException
	{
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		//Date d=customer.getDob();
		
		
		con=PolicyDatabase.getConnection();
		try
		{
			ps=con.prepareStatement("select policyid from policydetails");
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		    	al.add(rs.getInt(1));
		    
		    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return al;	
			
			
		}
	
	public ArrayList<String> getpolicyname(String userid) throws SQLException,ClassNotFoundException
	{
		
		ArrayList<String> al=new ArrayList<String>();
		
		//Date d=customer.getDob();
		
		
		con=PolicyDatabase.getConnection();
		try
		{
			ps=con.prepareStatement("select policy from buypolicy where userid=?");
			ps.setString(1,userid);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		    	al.add(rs.getString(1));
		    
		    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return al;	
			
			
		}
	
	public int getpremamount(String userid,String pname) throws SQLException,ClassNotFoundException
	{
		
		//ArrayList<String> al=new ArrayList<String>();
		
		//Date d=customer.getDob();
		
		int amount=0;
		con=PolicyDatabase.getConnection();
		try
		{
			ps=con.prepareStatement("select premamount from buypolicy where userid=? and policy=?");
			ps.setString(1,userid);
			ps.setString(2, pname);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next())
		    {
		    	amount=rs.getInt("premamount");
		    
		    }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
			
		return amount;	
			
			
		}
	public Integer addPolicy(PolicyDetails pd) throws SQLException,ClassNotFoundException
	{
		
		
		//Date d=customer.getDob();
		
		String query=null;
		int policyid=0;
		con=PolicyDatabase.getConnection();
		
		try
		{  
			ps=con.prepareStatement("insert into policydetails values(policy_seq147.nextval,?,?,?,?,?,?)");
		    ps.setString(1, pd.getPolicyname());
		    ps.setString(2, pd.getPolicytype());
		    ps.setInt(3, pd.getNom_number());
		    ps.setInt(5, pd.getTenure());
		    ps.setDouble(4, pd.getSum());
		    ps.setString(6, pd.getPrerequisites());
		    
		    int rowStatus=ps.executeUpdate();
		    
		    System.out.println("Row Status is : "+rowStatus);
		    
		    query="select max(policyid) from policydetails";
		    st=con.createStatement();
		    rs=st.executeQuery(query);
		    
		    while(rs.next())
		    {
		    	policyid=(Integer)rs.getInt(1);
		    	System.out.println("policyid: " +policyid);
		    }
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return policyid;
	}
	
	
	
	
	public Integer modifyPolicy(PolicyDetails pd, int id) throws SQLException,ClassNotFoundException
	{
		
		
		//Date d=customer.getDob();
		
		//String query=null;
		int policyid=id;
		con=PolicyDatabase.getConnection();
		
		try
		{
			ps=con.prepareStatement("update policydetails set nom_number=? where policyid=?");
		
		
		    ps.setInt(1, pd.getNom_number());
		    System.out.println("Number of nominees : " +pd.getNom_number());
		    
		    
		    
		    ps.setInt(2, policyid);
		    System.out.println("Policy ID : " +policyid);
		  
		    
		    
		    int rowStatus=ps.executeUpdate();
		    
		    
		    System.out.println("success");
		    
		    System.out.println("Row Status is : "+rowStatus);
		    
		    /*query="select max(policyid) from policydetails";
		    st=con.createStatement();
		    rs=st.executeQuery(query);
		    
		    while(rs.next())
		    {
		    	policyid=(Integer)rs.getInt(1);
		    	System.out.println("Policy ID : " +policyid);
		    }*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return policyid;
	}
	
	public double payamount(String userid,String pname,String IFSC,String bank,String accno,int amount)
	{
		int i=0;
		double a2=0;
		con=PolicyDatabase.getConnection();
		
		try
		{  
			int a1=getpremamount(userid,pname);
			int ramount=a1-amount;
			ps=con.prepareStatement("update buypolicy set premamount=? where userid=? AND policy=?");
			ps.setInt(1,ramount);
			ps.setString(2,userid);
			ps.setString(3,pname);
			int i1=ps.executeUpdate();
			if(i1!=0)
			{
				System.out.println("updated");
			}
			ps=con.prepareStatement("insert into bank values(?,?,?,?,?,?)");
			ps.setString(1, userid);
			ps.setString(2,pname);
			ps.setString(3, IFSC);
			ps.setString(4, bank);
			ps.setString(5, accno);
			ps.setInt(6,ramount);
			i=ps.executeUpdate();
			
			a2=getpremamount(userid,pname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return a2;
	}
}
