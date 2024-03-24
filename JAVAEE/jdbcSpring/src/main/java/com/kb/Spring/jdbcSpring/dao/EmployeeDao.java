package com.kb.Spring.jdbcSpring.dao;

import java.util.ArrayList;
import java.util.List;

import com.kb.Spring.jdbcSpring.dto.Employee;

public interface EmployeeDao {

	void insertEmployee(Employee employee);
	Employee getEmployeeById(String id);
	List<Employee> fingAllEmployees();
	
	
}
