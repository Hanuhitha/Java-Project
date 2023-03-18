package Service;

import java.sql.SQLException;

import bean.Customerdetails;
import DAO.registrationDao;





public class registercustomer 
{
	registrationDao rdao=new registrationDao();
	public int regcustomer(Customerdetails cd)throws SQLException,ClassNotFoundException
	{
		int i=rdao.regCustomer(cd);
		System.out.println(i);
		return i;
	}
	/*public void modifycustomer(String user,String password)
	{
		return rdao.modifycustomer(user,password);
	}*/
	
}
