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


public class PolicyDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public PolicyDeleteController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source4=request.getParameter("source4");
		System.out.println(source4);
		
		try
		{
		if(source4.equalsIgnoreCase("deletePolicy"))
		{
			PolicyDetails pd4=new PolicyDetails();
		
		int id=(Integer.parseInt(request.getParameter("policyid")));
		
		
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		
		
		con=PolicyDatabase.getConnection();
		
		
		ps=con.prepareStatement("delete from policydetails where policyid=?");
		
		ps.setInt(1, id);
		System.out.println("Policy ID : " +id);
		
		rs=ps.executeQuery();
	    System.out.println("result set value is " +rs);
	    
	    
	    System.out.println("success");
		
		
		request.setAttribute("pd4",pd4);
		RequestDispatcher rd=request.getRequestDispatcher("policyDeleteStatus.jsp");
    	rd.forward(request, response);
		}
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
