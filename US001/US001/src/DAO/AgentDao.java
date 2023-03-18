package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Agent;
public class AgentDao {
	Connection connection;
	String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@172.25.192.82:1521:javadb";
	private String user = "HJA12orauser2D";
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
	public int addAgent(Agent agent,String userid) throws Exception
	{
		Connection conn = getConnection();
		
		int id=0;
		System.out.println("id"+id);
		try
		{
			PreparedStatement pst = conn.prepareStatement("insert into Agents values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			pst.setString(1, agent.getFirstName());
			pst.setString(2, agent.getMiddleName());
			pst.setString(3, agent.getLastName());
			pst.setString(4, agent.getDOBMonth());
			pst.setString(5, agent.getDOBDay());
			pst.setString(6, agent.getDOBYear());
			pst.setString(7, agent.getAddress());
			pst.setString(8, agent.getEmail());
			pst.setLong(9, agent.getPhoneNumber());
			pst.setInt(10, agent.getYearsOfExperience());
			pst.setString(11, agent.getZone());
			pst.setString(12, agent.getReferenceBy());
			pst.setString(13, agent.getPanCard());
			pst.setString(14, userid);
			id = pst.executeUpdate();
			
			
			
	/*pst=conn.prepareStatement("select Agenttable_seqcurrval from Agent_1336919");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		id=rs.getInt(1);
	}*/
	}catch(Exception e)
	{
		System.out.println(e);
	}
	return id;
	}
		
		
	

	public Agent viewAgent(String firstname) {
		Connection conn = getConnection();
		Agent agent = null;
		try
		{
			PreparedStatement pst = conn.prepareStatement("select * from Agent_1336919 where firstname = '" + firstname + "'");
			ResultSet rs= pst.executeQuery();
			
			if(rs.next())
			{
				agent= new Agent();
				
				agent.setFirstName(rs.getString(1));
				agent.setMiddleName(rs.getString(2));
				agent.setLastName(rs.getString(3));
				agent.setDOBMonth(rs.getString(4));
				agent.setDOBDay(rs.getString(5));
				agent.setDOBYear(rs.getString(6));
				agent.setAddress(rs.getString(7));
				agent.setEmail(rs.getString(8));
				agent.setPhoneNumber(rs.getLong(9));
				agent.setYearsOfExperience(rs.getInt(10));
				agent.setZone(rs.getString(11));
				agent.setReferenceBy(rs.getString(12));
				agent.setPanCard(rs.getString(13));
			
				
				
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
		return agent;
	}
	public int deleteAgent(String first_name) {
		System.out.println("firstname"+first_name);
		Connection conn = getConnection();
		int i=0;
		
		try
		{
			PreparedStatement pst = conn.prepareStatement("delete from Agent_1336919 where firstname =?");
			pst.setString(1, first_name);
			System.out.println("delsheela");
			i= pst.executeUpdate();
			System.out.println("i="+i);
			System.out.println("delsheela123");
			 
		
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
			return i;
	}
	public int updateAgent(Agent al,String s)
	{
		int rs=0;
		System.out.println("fn"+s);
		try{
		Connection conn = getConnection();
		
		PreparedStatement pst = conn.prepareStatement("update Agent_1336919 set middlename =?,lastname=?,dobmonth=?,dobday=?,dobyear=?,address=?,email=?,phonenumber=?,referenceby=?,zone=?,yearsofexperience=?,pancard=? where firstname=?");
		pst.setString(1, al.getMiddleName());
		pst.setString(2, al.getLastName());
		pst.setString(3, al.getDOBMonth());
		pst.setString(4, al.getDOBDay());
		pst.setString(5, al.getDOBYear());
		pst.setString(6, al.getAddress());
		pst.setString(7, al.getEmail());
		pst.setLong(8, al.getPhoneNumber());
		pst.setString(9, al.getReferenceBy());
		pst.setString(10, al.getZone());
		pst.setInt(11, al.getYearsOfExperience());
		pst.setString(12, al.getPanCard());
		
		pst.setString(13, s);
		rs= pst.executeUpdate();
		
		/*if(rs.next())
		{
			Agent agent1 = new Agent();
		
			agent1.setMiddleName(rs.getString(2));
			agent.setLastName(rs.getString(3));
			agent.setDOBMonth(rs.getString(4));
			agent.setDOBDay(rs.getString(5));
			agent.setDOBYear(rs.getString(6));
			agent.setAddress(rs.getString(7));
			agent.setEmail(rs.getString(8));
			agent.setPhoneNumber(rs.getLong(9));
			agent.setYearsOfExperience(rs.getInt(10));
			agent.setZone(rs.getString(11));
			agent.setReferenceBy(rs.getString(12));
			agent.setPanCard(rs.getString(13));

		}*/
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	return rs;
	}
}