package com.hib.hibernate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Business {
	@Autowired
	private Dao dao;
	
	
	public Dao getDao() {
		return dao;
	}


	public void setDao(Dao dao) {
		this.dao = dao;
	}


	public void getAll() {
		List<Employee> employe=dao.findAll();
		for(Employee em:employe) {
			System.out.println(em);
		}
	}

}

