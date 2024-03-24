 package com.hib.spring.springHibernate.EmployeeDao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hib.spring.springHibernate.Entity.Employee;
@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	public void save(Employee employee) {
		hibernateTemplate.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		hibernateTemplate.update(employee);
	}

	public Employee findById(int id) {
		Employee employee=(Employee) hibernateTemplate.get(Employee.class,id);
		return employee ;
		
	}  

	public List<Employee> findAll() {
		List<Employee> employee=hibernateTemplate.loadAll(Employee.class);
		return employee;
	}

}
