package Service;

import java.sql.SQLException;

import bean.PolicyDetails;
import DAO.PolicyDao;



public class PolicyService {
	
	PolicyDao pdao=new PolicyDao();
	
	public Integer addPolicy(PolicyDetails pd) throws SQLException,ClassNotFoundException
	{
	int id= pdao.addPolicy(pd);
		System.out.println(id);
		return id;
	}

	
	public Integer modifyPolicy(PolicyDetails pd, int id) throws SQLException,ClassNotFoundException
	{
	
		
		return pdao.modifyPolicy(pd, id);
	}
	
	
}
