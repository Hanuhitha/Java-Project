package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.PolicyDao;

/**
 * Servlet implementation class banking
 */
@WebServlet("/banking")
public class banking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public banking() {
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
		String IFSC=request.getParameter("ifsc");
		String bank=request.getParameter("bank");
		String accno=request.getParameter("accno");
		int amount=(Integer.parseInt(request.getParameter("amount")));
		PrintWriter out=response.getWriter();
		/*HttpSession session=request.getSession(false);  
		String userid=(String)session.getAttribute("userid");*/
		String userid1="sheelasm@123";
		
		HttpSession session1=request.getSession(false);  
		String pname=(String)session1.getAttribute("pname");
		
		PolicyDao d=new PolicyDao();
		double i=d.payamount(userid1, pname,IFSC,bank,accno,amount);
		if(i!=0)
		{
			System.out.println("Payed successfully");
			out.println("<html><head></head><body><font color=\"green\">Paid successfully<br>remaining amount is"+i+"</font></body></html>");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
