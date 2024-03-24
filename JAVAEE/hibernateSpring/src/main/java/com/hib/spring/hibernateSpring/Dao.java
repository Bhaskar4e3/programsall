package com.hib.spring.hibernateSpring;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class Dao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
  public void put(Employee employee) {
	  hibernateTemplate.save(employee);
  }

  
	public List<Employee> findAll(){
		
		List<Employee> employe=hibernateTemplate.loadAll(Employee.class);
		return employe;
		
	}
	
	public Employee getById(int id) {
	
		return hibernateTemplate.get(Employee.class,id);
	}
	@org.springframework.transaction.annotation.Transactional(readOnly = false)
	public void del(Employee employee) {
		
		hibernateTemplate.delete(employee);;
		
	}



}
