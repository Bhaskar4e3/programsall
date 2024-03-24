package com.again.temp.jdbcTemplate;

public class Pojo {
	private String id;
	private String name;
	private int exp;
	public Pojo() {}
	public Pojo(String id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
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
	@Override
	public String toString() {
		return "Pojo [id=" + id + ", name=" + name + ", exp=" + exp + "]";
	}
	

}
