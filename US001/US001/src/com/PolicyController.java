package com;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import bean.PolicyDetails;
import Service.PolicyService;


public class PolicyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PolicyController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source=request.getParameter("source");
		
		PolicyService service=new PolicyService();
		
		PrintWriter out=response.getWriter();
		
		try
		{
			
			if(source.equalsIgnoreCase("addPolicy"))
			{
		
				PolicyDetails pd=new PolicyDetails();
				pd.setPolicyname(request.getParameter("policyname"));
				pd.setPolicytype(request.getParameter("policytype"));
				pd.setNom_number(Integer.parseInt(request.getParameter("nom_number")));
				pd.setTenure(Integer.parseInt(request.getParameter("tenure")));
				pd.setSum(Double.parseDouble(request.getParameter("sum")));
				pd.setPrerequisites(request.getParameter("prerequisites"));
			
				
				System.out.println("policy details : " +pd.getPolicyname());

				int policyid=service.addPolicy(pd);
				System.out.println(policyid);
				if(policyid!=0)
				{
					System.out.println("data inserted "+policyid);
					out.println("\n"+"<html><head></head><body>\n"+"<font size=\"20px\">policy created successfully </font>");
					RequestDispatcher rd=request.getRequestDispatcher("successfull.jsp");
			    	rd.forward(request, response);
				}
				else
				{
					System.out.println("data not inserted");
					out.println("Policy not created successfully");
					RequestDispatcher rd=request.getRequestDispatcher("successfull.jsp");
			    	rd.forward(request, response);
				}
				 
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

