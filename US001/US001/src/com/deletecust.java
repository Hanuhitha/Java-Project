package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.registrationDao;
import bean.Customerdetails;

/**
 * Servlet implementation class deletecust
 */
@WebServlet("/deletecust")
public class deletecust extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletecust() {
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
		registrationDao d=new registrationDao();
		System.out.println("delete customer");
		int cd2 = d.deletecustomer(cd,id);
		if(cd2!=0)
		{
			out.println("The customer having "+id+" is deleted successfully");
		}
		
		else
		{
			out.println("The customer having "+id+" is not deleted successfully");
		}
		
		
	}

}
