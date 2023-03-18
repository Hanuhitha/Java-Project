package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PolicyDetails;
import Service.PolicyService;


public class PolicyModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public PolicyModifyController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String source1=request.getParameter("source1");
		System.out.println(source1);
		
		PolicyService service1=new PolicyService();
		try
		{
		if(source1.equalsIgnoreCase("modifyPolicy"))
		{
			PolicyDetails pd1=new PolicyDetails();
		
		int id=(Integer.parseInt(request.getParameter("policyid")));
		
		
		pd1.setPolicyname(request.getParameter("policyname"));
		pd1.setPolicytype(request.getParameter("policytype"));
		pd1.setNom_number(Integer.parseInt(request.getParameter("nom_number")));
		pd1.setTenure(Integer.parseInt(request.getParameter("tenure")));
		pd1.setSum(Double.parseDouble(request.getParameter("sum")));
		pd1.setPrerequisites(request.getParameter("prerequisites"));
			
			
			System.out.println("policy ID : " +pd1.getPolicyid());

			int policyid=service1.modifyPolicy(pd1,id);
			
			System.out.println("The data modified successfully. The policy id is --->" +policyid);
			
			RequestDispatcher rd=request.getRequestDispatcher("modSuccess.jsp");
	    	rd.forward(request, response);
		}
		
	}
		
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
