package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.buypolicyDao;
import DAO.registrationDao;
import bean.Customerdetails;
import bean.buypolicy;

/**
 * Servlet implementation class policy
 */
@WebServlet("/policy")
public class policy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public policy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String option=request.getParameter("source");
		if("viewpolicy".equalsIgnoreCase(option))
		{
			String policyname=request.getParameter("Policy");
			HttpSession session=request.getSession(false);  
	        String userid=(String)session.getAttribute("userid");  
	        buypolicyDao d1=new buypolicyDao();
	        buypolicy b=new buypolicy();
	        b=d1.viewcustomerpolicy(policyname, userid);
	        request.setAttribute("b",b);
	        RequestDispatcher rd=request.getRequestDispatcher("viewcustpolicies.jsp");
    		rd.forward(request, response);
		}
		
		
		if("BuyPolicy".equalsIgnoreCase(option))
		{
			String a1,a2,a3;
			PrintWriter out=response.getWriter();
			buypolicy b=new buypolicy();
			HttpSession session=request.getSession(false);  
			 String userid=(String)session.getAttribute("userid"); 
			 System.out.println(userid);
			String insurance=request.getParameter("Insurance");
			String policy=request.getParameter("Policy");
			String Tenure=request.getParameter("Tenure");
			String Nominee=request.getParameter("nomname");
			String Nomrel=request.getParameter("Nomineerel");
			String Premiumtype=request.getParameter("Premiumtype");
			String SumAssured=request.getParameter("SumAssured");
			String PremiumAmount=request.getParameter("PremiumAmount");
			String q1=request.getParameter("medques1");
			String q2=request.getParameter("medques2");
			String q3=request.getParameter("medques3");
			if(q1.equalsIgnoreCase("yes"))
			{
				a1="yes";
				
			}
			else
			{
				a1="no";
			}
			if(q2.equalsIgnoreCase("yes"))
			{
				a2="yes";
				
			}
			else
			{
				a2="no";
			}
			
			if(q3.equalsIgnoreCase("yes"))
			{
				a3="yes";
				
			}
			else
			{
				a3="no";
			}
			String agentid=request.getParameter("Agentid");
			b.setInsurance(insurance);
			b.setNominee(Nominee);
			b.setPolicy(policy);
			b.setPremiumAmount(PremiumAmount);
			b.setPremiumtype(Premiumtype);
			b.setTenure(Tenure);
			b.setSumAssured(SumAssured);
			b.setNomineerel(Nomrel);
			b.setQ1(a1);
			b.setQ2(a2);
			b.setQ3(a3);
			
			buypolicyDao d=new buypolicyDao();
			int n=d.addbuypolicy(b,userid,agentid);
			if(n!=0)
			{
				out.println("successfull");
				d.insertpolicy(b, userid);
			}
			
		}
		if("changenom".equalsIgnoreCase(option))
		{
			HttpSession session=request.getSession(false);  
	        String userid=(String)session.getAttribute("userid");
			buypolicy b=new buypolicy();
			
			String Policy=request.getParameter("Policy");
			buypolicyDao d=new buypolicyDao();
			
			System.out.println("update customer");
			buypolicy cd1 = d.viewcustomerpolicy(Policy,userid);
			System.out.println("after update customer");
			HttpSession session1=request.getSession();  
	        session1.setAttribute("Policy",Policy);
			
			request.setAttribute("cd1", cd1);
			RequestDispatcher rd = request.getRequestDispatcher("updatenominee.jsp");
			
			rd.forward(request, response);
		}
	}
	

}
