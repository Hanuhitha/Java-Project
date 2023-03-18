package com;

import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import DAO.PolicyDao;


@WebServlet("/policy")
public class certificate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public certificate() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			String option=request.getParameter("source");
			PolicyDao d=new PolicyDao();
           // PrintWriter out=response.getWriter();
			ArrayList<Integer> al=new ArrayList<Integer>();
			if(option.equalsIgnoreCase("payment"))
			{
				try
				{
					ArrayList<String> al1=new ArrayList<String>();
					HttpSession session=request.getSession(false);  
					String userid=(String)session.getAttribute("userid");
					String userid1="sheelasm@123";
					al1=d.getpolicyname(userid1);
					request.setAttribute("al1",al1);
					RequestDispatcher rd=request.getRequestDispatcher("PayPremium.jsp");
					rd.forward(request, response);
				} 
				catch (ClassNotFoundException | SQLException e)
				{
				e.printStackTrace();
				}
			}
			
			
			if(option.equalsIgnoreCase("certificate"))
			{
				try
				{
					al=d.getpolicyid();
				
					request.setAttribute("al",al);
					RequestDispatcher rd=request.getRequestDispatcher("cert.jsp");
					rd.forward(request, response);
				} 
				catch (ClassNotFoundException | SQLException e)
				{
				e.printStackTrace();
				}
			}
			
			
			if(option.equalsIgnoreCase("PayPremium"))
			{
				System.out.println("inside paypremium");
				String radio=request.getParameter("medques3");
				if(radio.equalsIgnoreCase("NetBanking"))
				{
					try
					{
						
					System.out.println("inside netbankng");
					String pname=request.getParameter("pname");
					
					HttpSession session=request.getSession();  
					session.setAttribute("pname",pname);
					String userid1="sheelasm@123";
					
					int amount=d.getpremamount(userid1,pname);
					request.setAttribute("amount",amount);
					
					RequestDispatcher rd=request.getRequestDispatcher("NetBanking.jsp");
					rd.forward(request, response);
					}catch(Exception e)
					{
						
					}
				}
				if(radio.equalsIgnoreCase("card"))
				{
					try
					{
						
					System.out.println("inside card");
					String pname=request.getParameter("pname");
					String userid1="sheelasm@123";
					int amount=d.getpremamount(userid1,pname);
					request.setAttribute("amount",amount);
					
					RequestDispatcher rd=request.getRequestDispatcher("Card.jsp");
					rd.forward(request, response);
					}catch(Exception e)
					{
						
					}
				}
			}
			
		}
	}

	

}
