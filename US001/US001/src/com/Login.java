package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Customerdetails;



import DAO.LoginDao;
//import DAO.registrationDao;
import DAO.registrationDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*String useriddb = null;
		String passworddb = null;
		String roledb = null;*/
		String userid = request.getParameter("userid");
		HttpSession session=request.getSession();  
        session.setAttribute("userid",userid);   
		String password = request.getParameter("password");
		String Role = request.getParameter("Role");
		PrintWriter out = response.getWriter();
		String option=request.getParameter("source");
		
		if(option.equalsIgnoreCase("Login"))
		{
			LoginDao l=new LoginDao();
			boolean b=l.loginuser(userid, password, Role);
			if(b)
			{
				if(Role.equalsIgnoreCase("customer"))
				{
					
					out.println("welcome");
					RequestDispatcher rd=request.getRequestDispatcher("frames.jsp");
					rd.forward(request,response);
					String option1=request.getParameter("source");
					if(option1.equalsIgnoreCase("registration"))
					{
						System.out.println(userid);
					
						//getServletContext().getRequestDispatcher("/registration.jsp").forward(request,response);
						RequestDispatcher rd1=request.getRequestDispatcher("registration.jsp");
						rd1.forward(request, response);
					}
					if(option1.equalsIgnoreCase("modify"))
					{
						System.out.println(userid);
						Customerdetails cd= new Customerdetails();
						registrationDao d=new registrationDao();
						//getServletContext().getRequestDispatcher("/registration.jsp").forward(request,response);
					
						RequestDispatcher rd1=request.getRequestDispatcher("modify.java");
						rd1.forward(request, response);
					}
				}
				if(Role.equalsIgnoreCase("admin") )
				{
					RequestDispatcher rd=request.getRequestDispatcher("ManagerHome.jsp");
					rd.forward(request,response);
				}
				if(Role.equalsIgnoreCase("Agent") )
				{
					out.println("welcome");
					RequestDispatcher rd=request.getRequestDispatcher("welcomeagent.jsp");
					rd.forward(request,response);
					String option1=request.getParameter("source");
					if(option1.equalsIgnoreCase("addagent"))
					{
						System.out.println(userid);
					
						//getServletContext().getRequestDispatcher("/registration.jsp").forward(request,response);
						RequestDispatcher rd1=request.getRequestDispatcher("welcomeagent.jsp");
						rd1.forward(request, response);
					}
					/*RequestDispatcher rd=request.getRequestDispatcher("addAgent.jsp");
					rd.forward(request,response);*/
				}
			}
		}
	}	
}
