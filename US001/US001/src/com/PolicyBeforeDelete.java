package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PolicyDetails;
import util.PolicyDatabase;


public class PolicyBeforeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PolicyBeforeDelete() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String source2=request.getParameter("source2");
		System.out.println(source2);
	
		
		try
		{
		if(source2.equalsIgnoreCase("viewPolicy"))
		{
			PolicyDetails pd2=new PolicyDetails();
		
		int id=(Integer.parseInt(request.getParameter("policyid")));
		
		System.out.println(id);
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		
		con=PolicyDatabase.getConnection();
		
		
		ps=con.prepareStatement("select * from policydetails where policyid=?");
		
		ps.setInt(1, id);
	   
		
		
		System.out.println("Policy ID : " +id);
	    
	    
		
	  
	     
		rs=ps.executeQuery();
	    
	    System.out.println("result set value is " +rs);
	    
	    
	    
	    
	   while(rs.next())
	   {
		   pd2.setPolicyid(rs.getInt(1));
		   pd2.setPolicyname(rs.getString(2));
		   pd2.setPolicytype(rs.getString(3));
		   pd2.setNom_number(rs.getInt(4));
		   pd2.setTenure(rs.getInt(6));
		   pd2.setSum(rs.getDouble(5));
		   pd2.setPrerequisites(rs.getString(7));
		   
	   }
	    
	    
	    System.out.println("success");
	    
	    
	   
		
		
		
		request.setAttribute("pd2",pd2);
		RequestDispatcher rd=request.getRequestDispatcher("PolicyBeforeDelete.jsp");
    	rd.forward(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
