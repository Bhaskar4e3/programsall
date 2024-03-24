package com.hib.spring.hibernateSpring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Business {
@Autowired
private Dao dao;
	
	public void call() {
		System.out.println("hiiiiii");
	}

public void save(Employee employee) {
	dao.put(employee);
}

	public void getAll() {
		
		List<Employee> emp=dao.findAll();
		for(Employee empl:emp)
		System.out.println(empl.getId()+" "+empl.getName()+" "+empl.getAddress()+" "+empl.getContact()+" "+empl.getExp());
	}
	public void printById(int id) {
		Employee emp=dao.getById(id);
		System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getAddress()+" "+emp.getContact()+" "+emp.getExp());
	}
	public void delete(Employee employee) {
		dao.del(employee);
	}
	
}
