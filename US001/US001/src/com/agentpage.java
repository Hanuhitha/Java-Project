package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Agent;
import DAO.AgentDao;

import DAO.buypolicyDao;
import bean.buypolicy;

/**
 * Servlet implementation class agentpage
 */
@WebServlet("/agentpage")
public class agentpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agentpage() {
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
		String option=request.getParameter("source");
		if("addagent".equalsIgnoreCase(option))
		{
			String policyname=request.getParameter("Policy");
			HttpSession session=request.getSession(false);  
	        String userid=(String)session.getAttribute("userid");  
	        String FirstName = request.getParameter("firstname");
			String LastName = request.getParameter("lastname");
			String MiddleName = request.getParameter("middlename");
			String DOBMonth = request.getParameter("dobmonth");
			String DOBDay = request.getParameter("dobday");
			String DOBYear = request.getParameter("dobyear");
			String Address = request.getParameter("address");
			String Email = request.getParameter("email");
			long PhoneNumber = Long.parseLong(request.getParameter("phonenumber"));
			int YearsOfExperience = Integer.parseInt(request.getParameter("yearsofexperience"));
			String Zone = request.getParameter("zone");
			String ReferenceBy = request.getParameter("referenceby");
			String PanCard = request.getParameter("pancard");
			Agent agent= new Agent(FirstName,LastName,MiddleName,DOBMonth,DOBDay,DOBYear,Address,Email,PhoneNumber,YearsOfExperience,Zone,ReferenceBy,PanCard);
			AgentDao dao = new AgentDao();
			
			int success = 0;
			String resultMessage = "";
			try {
				success = dao.addAgent(agent,userid);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			if(success!=0)
			{			
				resultMessage = "Agent has been given for validation";
			}
			else
			{
				resultMessage = "Error in adding Agent Details";
			}
			RequestDispatcher rd = request.getRequestDispatcher("./addResult.jsp");
			request.setAttribute("resultMessage", resultMessage);	
			rd.forward(request, response);	
		}
		if("addagent".equalsIgnoreCase(option))
		{
			
		}
	}

}
