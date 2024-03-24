package com.again.temp.jdbcTemplate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Data {
	private JdbcTemplate jdbcTemplate;
	Pojo pojo=new Pojo();

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	List<Pojo> l=new ArrayList<Pojo>();
	public List<Pojo> insertEmp() {
		
		EmployeRowMapper rowMapper=new EmployeRowMapper();
		String sql="select * from jobber where exp<=?";
		List<Pojo> l=jdbcTemplate.query(sql,rowMapper,5);
		System.out.println("inserted successfully");
		for(Pojo emp:l) {
		System.out.println(emp);}
		System.out.println();
		return l;
	}
}
