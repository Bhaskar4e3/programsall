package com.mb.get.fetch;

import java.util.ArrayList;
import java.util.List;

public class Business {
	private Employe employe;
	public Business() {}
	


public Business(Employe employe) {
		super();
		this.employe = employe;
	}

private Dao dao;
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Dao getDao() {
		return dao;
	}
	

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	
public void call() {
	System.out.println("hii");
Employe emp=dao.get(employe.getId());

}
}
