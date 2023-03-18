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


@WebServlet("/ModifyManager")
public class ModifyManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModifyManager() {
		super();


	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");

		if(action.equalsIgnoreCase("view")){
			String full_name = request.getParameter("Fullname");
			ManagerDao dao = new ManagerDao();
			Manager Manager = dao.viewManager(full_name);
			RequestDispatcher rd = request.getRequestDispatcher("./ViewManagerDetails.jsp");
			request.setAttribute("Manager", Manager);
			rd.forward(request, response);		
		}
		if(action.equalsIgnoreCase("update")){
			Manager Manager= new Manager();
			String fname=request.getParameter("Fullname");
			ManagerDao dao = new ManagerDao();
			Manager Manager1 = dao.viewManager(fname);
			RequestDispatcher rd = request.getRequestDispatcher("UpdateManagerDetails.jsp");
			request.setAttribute("Manager1", Manager1);
			rd.forward(request, response);
		}
		if(action.equalsIgnoreCase("delete")){
			Manager Manager= new Manager();
			String fname=request.getParameter("Fullname");
			ManagerDao dao = new ManagerDao();
			Manager Manager1 = dao.deleteManager(Manager,fname);
			RequestDispatcher rd = request.getRequestDispatcher("DeleteManager.jsp");
			request.setAttribute("Manager1", Manager1);
			rd.forward(request, response);
			
		}
	}
	
	
}


