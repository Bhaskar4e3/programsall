package com.hib.spring.springHibernate.EmployeeBusiness;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hib.spring.springHibernate.EmployeeDao.EmployeeDaoImpl;
import com.hib.spring.springHibernate.Entity.Employee;
@Component
public class EmployeeBusinessImpl implements EmployeeBusiness {

	private EmployeeDaoImpl EmployeeDaoImpl;
	
	public void save(Employee employee) {
		EmployeeDaoImpl.save(employee);

	}

	public void update(Employee employee) {
		EmployeeDaoImpl.update(employee);

	}

	
	public Employee findById(int id) {
		Employee emp=EmployeeDaoImpl.findById(id);
		return emp;
	}

	public List<Employee> findAll() {
		return EmployeeDaoImpl.findAll();
	}

}
