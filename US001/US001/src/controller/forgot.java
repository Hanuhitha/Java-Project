package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.forgotDao;


public class forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		
		//String option=request.getParameter("checkuser");
		
			String userid=request.getParameter("username");
			String Squestion=request.getParameter("securityQuestion");
			System.out.println(Squestion);
			String Sanswer=request.getParameter("securityAnswer");
			System.out.println(Sanswer);
			forgotDao f=new forgotDao();
			boolean b=f.securityquestion(userid,Squestion,Sanswer);
			if(b)
			{
				RequestDispatcher rd1=request.getRequestDispatcher("/setPassword.jsp");
				rd1.include(request,response);
			}
			else
			{
				out.println("U have entered wrong secret question and answer");
				RequestDispatcher rd2=request.getRequestDispatcher("/new_user.jsp");
				rd2.include(request,response);
			}
		
			HttpSession session=request.getSession();  
	        session.setAttribute("userid",userid); 
			
		/*request.setAttribute("userid", userid);
		RequestDispatcher rd=request.getRequestDispatcher("usercontroller");
		rd.include(request,response);	*/
		
	}

}
