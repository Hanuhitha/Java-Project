package com;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
//import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.dateutil;

//import DAO.registrationDao;
import Service.registercustomer;
import bean.Customerdetails;




public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public registration() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("servlet");
		
		
		 String option=request.getParameter("source");
	     PrintWriter out=response.getWriter();
		//String source=request.getParameter("source");
		registercustomer s=new registercustomer();
		if("registration".equalsIgnoreCase(option))
		{
		try
		{
			HttpSession session=request.getSession(false);  
		 String userid=(String)session.getAttribute("userid"); 
			//String userid = (String)request.getAttribute("userid");
		Customerdetails cd=new 	Customerdetails();
		String firstname= (String)request.getParameter("txtFirstName");
		String middlename= (String)request.getParameter("txtMiddleName");
		String lastname= (String)request.getParameter("txtLastName");
		Date dob=dateutil.convertStringToDate(request.getParameter("dob"),"dd/MM/yyyy");
		String gender= (String)request.getParameter("Gender");
		if(gender.equalsIgnoreCase("M"))
		{
			cd.setGender("Male");
		}
		else
		{
			cd.setGender("FeMale");
		}
		String permanentaddress= (String)request.getParameter("Address");
		//String presentaddress= (String)request.getParameter("presentaddress");
		String maritalstatus= (String)request.getParameter("rdmarried");
		String children= (String)request.getParameter("rdchildren");
		String email= (String)request.getParameter("email");
		String city=request.getParameter("city");
		String occupation= (String)request.getParameter("txtOccupation");
		try
		{
		Double annualsalary= (Double.parseDouble(request.getParameter("txtAnnualSalary")));
		
		cd.setAnnualsalary(annualsalary);
		
		Integer phonenumber= (Integer.parseInt(request.getParameter("phonenum")));
		cd.setPhonenumber(phonenumber);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		//Integer phonenumber= (Integer.parseInt(request.getParameter("phonenumber")));
		String pancard= (String)request.getParameter("txtPancard");
		cd.setId(userid);
		cd.setFirstname(firstname);
		cd.setMiddlename(middlename);
		System.out.println("middle name is "+cd.getMiddlename());
		cd.setLastname(lastname);
		System.out.println("Last name is "+cd.getLastname());
		cd.setDateofbirth(dob);
		
		cd.setPemanentaddress(permanentaddress);
		cd.setPresentaddress(city);
		cd.setOccupation(occupation);
		cd.setMaritalstatus(maritalstatus);
		cd.setChildren(children);
		cd.setEmail(email);
		//cd.setPresentaddress(presentaddress);
		cd.setPancard(pancard);
		
		//'out.print("registration successfull");	
		
		
		int customerId=s.regcustomer(cd);
		
    	if(customerId!=0)
    	{
    		out.println("u are registered successfully");
    		
    		//out.println("Your registrattion id is "+customerId);
    		
    	}
    	else
    	{
    		out.println("<html><head></head><body><font size=\"12px\">Registration is not complete,fill the form once again</font></body></html>");
    	
    		RequestDispatcher rd=request.getRequestDispatcher("Registration.jsp");
    		rd.forward(request, response);
    	}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		
		
		
		/*else if("modify".equalsIgnoreCase(option))
		{
			String user=request.getParameter("user");
			String password=request.getParameter("psw");
			//s.modifycustomer(user,password);
		}
		
		
		
		else
		{
			
		}*/
	}
}
