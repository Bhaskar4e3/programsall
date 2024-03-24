package com.kb.Spring.jdbcSpring.business;

import java.util.List;

import com.kb.Spring.jdbcSpring.dao.EmployeeDao;
import com.kb.Spring.jdbcSpring.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {

	private EmployeeDao employeeDao;
	private Employee employee;
	
	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}


	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	public void insert() {
		employeeDao.insertEmployee(employee);
	}

	public void printEmployeeHikes() {
      //ask dao for data
		
     List<Employee> employee = employeeDao.fingAllEmployees();
     if(employee!=null) {
    	 for(Employee employe:employee) {
    		 if(employe.getExp()>15) {
    	System.out.println("employee id "+employe.getId()+" name "+employe.getName()+" and expieirence "+employe.getExp()+" got 30% hike");
    		 }
    		 else if(employe.getExp()>=10) {
    			 System.out.println("employee id "+employe.getId()+" name "+employe.getName()+" and expieirence "+employe.getExp()+" got 20% hike");
    		 }
    		 else if(employe.getExp()>=5) {
    			 System.out.println("employee id "+employe.getId()+" name "+employe.getName()+" and expieirence "+employe.getExp()+" got 15% hike");
    		 }
    		 else {
    			 System.out.println("employee id "+employe.getId()+" name "+employe.getName()+" and expieirence "+employe.getExp()+" got 10% hike");
    		 }
    	 }
     }
	}



	@Override
	public void printEmployeeById() {
		String id=employee.getId();
		Employee employee=employeeDao.getEmployeeById(id);
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getExp());
		
	}
	





}
