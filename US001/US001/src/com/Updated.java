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


@WebServlet("/Updated")
public class Updated extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Updated() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Manager Manager= new Manager();
		
		String FullName = request.getParameter("Fullname");
		String Dob = request.getParameter("dob");
		String Area = request.getParameter("Area");
		String City = request.getParameter("City");
		String StateZone = request.getParameter("StateZone");
		String Designation = request.getParameter("Designation");
		Manager.setFullName(FullName);
		Manager.setDob(Dob);
		Manager.setArea(Area);
		Manager.setCity(City);
		Manager.setStateZone(StateZone);
		Manager.setDesignation(Designation);
		ManagerDao dao = new ManagerDao();
		Manager Manager1 = dao.updateManager(Manager,FullName);
		RequestDispatcher rd = request.getRequestDispatcher("UpdatedManager.jsp");
		request.setAttribute("Manager1", Manager1);
		rd.forward(request, response);
	}

}
