package com;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import util.dateutil;

import DAO.registrationDao;
import bean.Customerdetails;



/**
 * Servlet implementation class modify
 */
@WebServlet("/modify")
public class modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modify() {
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
		
		String option=request.getParameter("source");
		Customerdetails cd2= new Customerdetails();
		String id=request.getParameter("id");
		
		HttpSession session=request.getSession(false);  
        String userid=(String)session.getAttribute("userid");
        
        registrationDao d=new registrationDao();
        if(id.equalsIgnoreCase(userid))
        {
        
        	Customerdetails cd3 = d.modifycustomer(cd2,id);
    		request.setAttribute("cd3", cd3);
    		RequestDispatcher rd = request.getRequestDispatcher("modify.jsp");
    		rd.forward(request, response);
        }
    		
       
        else
        {
        	out.println("\n"+"<html><head></head><body>\n"+"<font size=\"10px\" color=\"red\">You are not authorised user to update this</font>"+"<br>"+"<a href=\"customer.jsp\"><font size=\"10px\">Home</font></a>");
        }
		
	}

}
