package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Manager;
import DAO.ManagerDao;


@WebServlet("/AddManager")
public class AddManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddManager() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String FullName = request.getParameter("Fullname");
		String Dob = request.getParameter("Dob");
		String Area = request.getParameter("Area");
		String City = request.getParameter("City");
		String StateZone = request.getParameter("StateZone");
		String Designation = request.getParameter("Designation");
		//HttpSession session=session.
		
		
		Manager Manager= new Manager(FullName,Dob,Area,City,StateZone,Designation);
		ManagerDao dao = new ManagerDao();
		boolean success = dao.addManager(Manager);
		String resultMessage = "";
		
		if(success)
		{			
			resultMessage = "Manager  Added Successfully";
		}
		else
		{
			resultMessage = "Error in adding Manager Details";
		}
		RequestDispatcher rd = request.getRequestDispatcher("./AddManagerResult.jsp");
		request.setAttribute("resultMessage", resultMessage);	
		rd.forward(request, response);	
	}

	

}
