package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.forgotDao;

/**
 * Servlet implementation class usercontroller
 */
@WebServlet("/usercontroller")
public class usercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public usercontroller() {
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
		String newpswd=request.getParameter("newPassword");
		System.out.println(newpswd);
		 HttpSession session=request.getSession(false);  
		 String userid=(String)session.getAttribute("userid");  
		System.out.println("userid in controller"+userid);
		//String option=request.getParameter("setpassword");
		
			int i=0;
			forgotDao f=new forgotDao();
			i=f.updatepassword(newpswd,userid);
			if(i!=0)
			{
				out.println("paassword updated successfully");
			}
		
	}

}
