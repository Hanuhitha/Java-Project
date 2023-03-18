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

import DAO.registrationDao;
import bean.Customerdetails;

/**
 * Servlet implementation class viewcust
 */
@WebServlet("/viewcust")
public class viewcust extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewcust() {
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
		Customerdetails cd= new Customerdetails();
		String id=request.getParameter("id");
		
		HttpSession session=request.getSession(false);  
        String userid=(String)session.getAttribute("userid");
        if(id.equalsIgnoreCase(userid))
        {
		registrationDao d=new registrationDao();
		System.out.println("search customer");
		Customerdetails cd2 = d.serachcustomer(cd,id);
		System.out.println("after search customer");
		//System.out.println(agent1.getFirstName());
		request.setAttribute("cd2", cd2);
		RequestDispatcher rd = request.getRequestDispatcher("viewcust.jsp");
		
		rd.forward(request, response);	
        }
        else
        {
        	out.println("\n"+"<html><head></head><body>\n"+"<font size=\"20px\">You are not authorised user to vew this</font>");
        }
	}

}
