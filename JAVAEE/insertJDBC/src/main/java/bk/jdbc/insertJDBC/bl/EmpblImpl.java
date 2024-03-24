package bk.jdbc.insertJDBC.bl;



import java.util.ArrayList;
import java.util.List;

import bk.jdbc.insertJDBC.dao.EmpDao;


public class EmpblImpl implements Empbl {


	private String id;
	public EmpblImpl(String id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}

	private String name;
	private int exp;

		
	private EmpDao empDao;
	
	

	public EmpDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public void insertEmp() {
		
		empDao.insert(emp) ;
		
		
	
	}

}
