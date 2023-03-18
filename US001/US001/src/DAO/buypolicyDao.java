package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;




import bean.buypolicy;

public class buypolicyDao 
{
public int addbuypolicy(buypolicy b,String userid,String agentid)
{
	int i=0;
	Connection con=null;
	PreparedStatement ps=null;
	
	
	String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
	String user = "HJA12ORAUSER1D";
	String pwd = "tcshyd";
	//String query=null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url, user, pwd);
		System.out.println("success");
		ps=con.prepareStatement("insert into buypolicy values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		
		ps.setString(1,b.getInsurance());
		ps.setString(2,b.getTenure());
		
		ps.setString(3,b.getPremiumtype());
		ps.setString(4,b.getSumAssured());
		ps.setString(5,b.getPremiumAmount());
		ps.setString(6,b.getNominee());
		ps.setString(7,b.getNomineerel());
		ps.setString(8,b.getPolicy());
		
		
		
		ps.setString(9,b.getQ1());
		ps.setString(10, b.getQ2());
		ps.setString(11, b.getQ3());
		ps.setString(12,userid);
		ps.setString(13, agentid);
		i=ps.executeUpdate();
		
		ps=con.prepareStatement("insert into customertable (policy) values(?) where userid=?");
		ps.setString(1,b.getPolicy());
		ps.setString(2,userid);
		int i1=ps.executeUpdate();
		if(i1!=0)
		{
			System.out.println("policy inserted to customer table");
		}
		
		
		ps.setString(1,userid);
		ps.setString(2,b.getQ1());
		ps.setString(3, b.getQ2());
		
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
		
	return i;
}
public void insertpolicy(buypolicy b,String userid)
{
	
	String id=null;
	Connection con=null;
	PreparedStatement ps=null;
	
	
	String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
	String user = "HJA12ORAUSER1D";
	String pwd = "tcshyd";
	//String query=null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection(url, user, pwd);
		System.out.println("success");
		ps=con.prepareStatement("select userid from customertable");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			id=rs.getString("userid");
			if(id.equalsIgnoreCase(userid))
			{
				ps=con.prepareStatement("insert into  customerpolicies values(?,?) ");
				ps.setString(1,b.getPolicy());
				ps.setString(2,id);
				int i1=ps.executeUpdate();
				if(i1!=0)
					System.out.println("policy inserted");
			}
		}
	}catch(Exception e)
	{
		System.out.println(e);
	}
	
}

	public int updatenominee(String nomname,String nomrel,String userid,String policyname)
	{
		int i=0;
		String id=null;
		Connection con=null;
		PreparedStatement ps=null;
		
		buypolicy b=new buypolicy();
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("select userid,policy from customerpolicies");
			//ps=con.prepareStatement("select * from buypolicy join customerpolicies on buypolicy.userid=customerpolicies.userid AND buypolicy.policy=customerpolicies.policy");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				//ps=con.prepareStatement("select  
			String userid1=rs.getString(1);
			String policy1=rs.getString(2);
			System.out.println(userid1);
			System.out.println(policy1);
			System.out.println(policyname);
			if( policy1.equalsIgnoreCase(policyname) && userid1.equalsIgnoreCase(userid))
			{
				System.out.println("userid and policyname matched "+userid+policyname);
				System.out.println(nomname);
				System.out.println(nomrel);
				ps=con.prepareStatement("update buypolicy set nomineename=?,nomrel=? where userid=? AND policy=?");
				ps.setString(1, nomname);
				ps.setString(2,nomrel);
				ps.setString(3, userid);
				ps.setString(4,policyname);
				i=ps.executeUpdate();
			}
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}
	public buypolicy viewcustomerpolicy(String policyname,String userid)
	{
		String id=null;
		Connection con=null;
		PreparedStatement ps=null;
		
		buypolicy b=new buypolicy();
		String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pwd = "tcshyd";
		//String query=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("success");
			ps=con.prepareStatement("select userid,policy from customerpolicies");
			//ps=con.prepareStatement("select * from buypolicy join customerpolicies on buypolicy.userid=customerpolicies.userid AND buypolicy.policy=customerpolicies.policy");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				//ps=con.prepareStatement("select  
			String userid1=rs.getString(1);
			String policy1=rs.getString(2);
			System.out.println(userid1);
			System.out.println(policy1);
			System.out.println(policyname);
			if( policy1.equalsIgnoreCase(policyname) && userid1.equalsIgnoreCase(userid))
			{
				System.out.println("userid and policyname matched "+userid+policyname);
				ps=con.prepareStatement("select * from buypolicy where userid=? AND policy=?");
				ps.setString(1, userid1);
				ps.setString(2, policy1);
				ResultSet rs1=ps.executeQuery();
				while(rs1.next())
				{
					
					
					//System.out.println(b.getInsurance());
					
					b.setNominee(rs1.getString("nomineename"));
					System.out.println("nom name");
					b.setPolicy(rs1.getString("policy"));
					b.setPremiumAmount(rs1.getString("premamount"));
					b.setPremiumtype(rs1.getString("premiumtype"));
					b.setSumAssured(rs1.getString("sumassured"));
					b.setNomineerel(rs1.getString("nomrel"));
					b.setTenure(rs1.getString("tenure"));
					rs.getString("userid");
					b.setInsurance(rs1.getString("insurancetype"));
				}
			}
						
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
			
		return b;
	}
	}
