package com.kb.Spring.jdbcSpring.dto;

public class Employee {
	private String id;
	private String name;
	private int exp;
	public Employee() {}
	public Employee(String id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}
	public Employee(String id) {
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
}