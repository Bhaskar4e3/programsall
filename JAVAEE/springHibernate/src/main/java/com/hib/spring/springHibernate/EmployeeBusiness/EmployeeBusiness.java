package com.hib.spring.springHibernate.EmployeeBusiness;

import java.util.List;

import com.hib.spring.springHibernate.Entity.Employee;

public interface EmployeeBusiness {
	public void save(Employee employee);
	public void update(Employee employee);
	public Employee findById(int id);
	public List<Employee> findAll();
	

}
