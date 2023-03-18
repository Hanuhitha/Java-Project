package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao 
{
	public boolean loginuser(String userid,String password,String role)
	{
		boolean b=false;
		String useriddb = null;
		String passworddb = null;
		String roledb = null;
	
		Connection conn = null ;
		String url="jdbc:oracle:thin:@172.25.192.82:1521:javadb";
		String user = "HJA12ORAUSER1D";
		String pawd = "tcshyd";
		String driver ="oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,pawd);
			

			String query = "select userid,password,role from Userdetails where userid=? and password=? and role=?" ;
			PreparedStatement st =conn.prepareStatement(query);
			st.setString(1, userid);
			st.setString(2,password);
			st.setString(3,role);
			ResultSet rs= st.executeQuery();
			while(rs.next())
			{
					useriddb=(rs.getString("userid"));
					passworddb=rs.getString("password");
					roledb=rs.getString("role");	
			}
			if(userid.equals(useriddb)&&password.equals(passworddb) && role.equalsIgnoreCase(roledb))
			{
				System.out.println(useriddb);
				b=true;
				//RequestDispatcher rd=request.getRequestDispatcher("./User.jsp");
				//rd.forward(request,response);
			}
			else
			{
				System.out.println("User not exists");
				b=false;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
}
