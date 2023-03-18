package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.user;

import util.dateutil;

import DAO.SignDao;


public class Signservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Signservlet()
    {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		Date dob=dateutil.convertStringToDate(request.getParameter("dob"),"dd/MM/yyyy");
		//String dob=request.getParameter("dob");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		String UserId=request.getParameter("userid");
		String Squestion=request.getParameter("squestion");
		String Sanswer=request.getParameter("sans");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		SignDao s=new SignDao();
		user u=new user();
		u.setFname(fname);
		
		u.setLname(lname);
		u.setDob(dob);
		u.setEmail(email);
		try
		{
		int phonenum=(Integer.parseInt(phno));
		u.setPhonenum(phonenum);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		u.setUserId(UserId);
		u.setSquestion(Squestion);
		u.setSanswer(Sanswer);
		u.setPassword(password);
		u.setRole(role);
		int n=s.addUser(u);
		if(n!=0)
		{
			
			out.println("\n"+"<html><head></head><body>\n"+"<font size=\"20px\">U signed in successfully</font>"+"<br>"+"<a href=\"Login.jsp\"><font size=\"20px\">login</font></a>");
		}
	}

}
