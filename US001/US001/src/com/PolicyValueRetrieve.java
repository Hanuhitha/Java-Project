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


public class PolicyValueRetrieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PolicyValueRetrieve() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source3=request.getParameter("source3");
		System.out.println(source3);
		
		//PolicyService service3=new PolicyService();
		
		try
		{
		if(source3.equalsIgnoreCase("retrievePolicy"))
		{
			PolicyDetails pd3=new PolicyDetails();
		
		int id=(Integer.parseInt(request.getParameter("policyid")));
		
		
		
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
		   pd3.setPolicyid(rs.getInt(1));
		   //System.out.println("Policy ID : "+pd3.getPolicyid());
		   
		   pd3.setPolicyname(rs.getString(2));
		   //System.out.println("Policy Name : "+pd3.getPolicyname());
		   
		   pd3.setPolicytype(rs.getString(3));
		   //System.out.println("Policy Type : "+pd3.getPolicytype());
		   
		   pd3.setNom_number(rs.getInt(4));
		   //System.out.println("Number of nominees : "+pd3.getNom_number());
		   
		   pd3.setTenure(rs.getInt(6));
		   //System.out.println("Tenure : "+pd3.getTenure());
		   
		   pd3.setSum(rs.getDouble(5));
		   //System.out.println("Sum : "+pd3.getSum());
		   
		   pd3.setPrerequisites(rs.getString(7));
	   }
	    
	    
	    System.out.println("success");
	    
	    
	   
		
		
		
		request.setAttribute("pd3",pd3);
		RequestDispatcher rd=request.getRequestDispatcher("modifypolicy.jsp");
    	rd.forward(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
