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


public class PolicySearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PolicySearchController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source2=request.getParameter("source2");
		System.out.println(source2);
		
		//PolicyService service3=new PolicyService();
		
		try
		{
		if(source2.equalsIgnoreCase("searchPolicy"))
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
		   //System.out.println("Policy ID : "+pd3.getPolicyid());
		   
		   pd2.setPolicyname(rs.getString(2));
		   //System.out.println("Policy Name : "+pd3.getPolicyname());
		   
		   pd2.setPolicytype(rs.getString(3));
		   //System.out.println("Policy Type : "+pd3.getPolicytype());
		   
		   pd2.setNom_number(rs.getInt(4));
		   //System.out.println("Number of nominees : "+pd3.getNom_number());
		   
		   pd2.setTenure(rs.getInt(6));
		   //System.out.println("Tenure : "+pd3.getTenure());
		   
		   pd2.setSum(rs.getDouble(5));
		   //System.out.println("Sum : "+pd3.getSum());
		  
		   pd2.setPrerequisites(rs.getString(7));
	   }
	    
	    
	    System.out.println("success");
	    
	    
	   
		
		
		
		request.setAttribute("pd2",pd2);
		RequestDispatcher rd=request.getRequestDispatcher("displaypolicy.jsp");
    	rd.forward(request, response);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
