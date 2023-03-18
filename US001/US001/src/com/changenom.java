package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.buypolicy;

import DAO.buypolicyDao;

/**
 * Servlet implementation class changenom
 */
@WebServlet("/changenom")
public class changenom extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changenom() {
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
		
		
		PrintWriter out=response.getWriter();
		buypolicy b=new buypolicy();
		
		HttpSession session=request.getSession(false);  
		String userid=(String)session.getAttribute("userid"); 
		 System.out.println(userid);
		
		 HttpSession session1=request.getSession(false);  
			String Policy=(String)session.getAttribute("Policy"); 
			 System.out.println(userid);
		String Nominee=request.getParameter("nomname");
		String Nomrel=request.getParameter("Nomineerel");
		
		
		b.setNominee(Nominee);
		
		
		b.setNomineerel(Nomrel);
		buypolicyDao d=new buypolicyDao();
		int n=d.updatenominee(Nominee,Nomrel,userid,Policy);
		if(n!=0)
		{
			out.println("successfully updated");
			d.insertpolicy(b, userid);
		}
		
		
	}

}
