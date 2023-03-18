package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.dateutil;
import DAO.registrationDao;
import Service.registercustomer;
import bean.Customerdetails;

/**
 * Servlet implementation class updatecust
 */
@WebServlet("/updatecust")
public class updatecust extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public updatecust() 
    {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		//String source=request.getParameter("source");
		registrationDao s=new registrationDao();
		
		try
		{
			//String userid = (String)request.getAttribute("userid");
		Customerdetails cd=new 	Customerdetails();
		String id=request.getParameter("regid");
		
		String firstname= (String)request.getParameter("txtFirstName");
		String middlename= (String)request.getParameter("txtMiddleName");
		String lastname= (String)request.getParameter("txtLastName");
		Date dob=dateutil.convertStringToDate(request.getParameter("dob"),"dd/MM/yyyy");
		
		System.out.println(dob);
		String gender= (String)request.getParameter("Gender");
		String permanentaddress= (String)request.getParameter("Address");
		//String presentaddress= (String)request.getParameter("presentaddress");
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
		String maritalstatus= (String)request.getParameter("rdmarried");
		String children= (String)request.getParameter("rdchildren");
		String email= (String)request.getParameter("email");
		//Integer phonenumber= (Integer.parseInt(request.getParameter("phonenumber")));
		String pancard= (String)request.getParameter("txtPancard");
		
		
		cd.setFirstname(firstname);
		cd.setMiddlename(middlename);
		System.out.println("middle name is "+cd.getMiddlename());
		cd.setLastname(lastname);
		System.out.println("Last name is "+cd.getLastname());
		cd.setGender(gender);
		cd.setPemanentaddress(permanentaddress);
		cd.setPresentaddress(city);
		cd.setOccupation(occupation);
		cd.setDateofbirth(dob);
		
		System.out.println("get date of birth "+cd.getDateofbirth());
		cd.setMaritalstatus(maritalstatus);
		cd.setChildren(children);
		cd.setEmail(email);
		cd.setId(id);
		cd.setPancard(pancard);
		
		//'out.print("registration successfull");	
		
		
		int customerId=s.updateCustomer(cd);
		
    	if(customerId!=0)
    	{
    		out.println("details are updated");
    		
    	}
    	else
    	{
    		out.println("\n"+"<html><head></head><body>\n"+"<font  color=\"red\">Your data not updated successfully/font>"+"<br>"+"<a href=\"customer.jsp\"><font size=\"10px\">Home</font></a>");
    	}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		
	

}
