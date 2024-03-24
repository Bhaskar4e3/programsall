package com.kb.Spring.jdbcSpring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.kb.Spring.jdbcSpring.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final Employee emp1 = null;
	private Employee employee;
	


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void insertEmployee(Employee employee) {
		try {
			
			String id=employee.getId();
			String name=employee.getName();
			int exp=employee.getExp();
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/world","root","root");
PreparedStatement stmt=con.prepareStatement("insert into jobber values(?,?,?)");
stmt.setString(1, id);
stmt.setString(2, name);
stmt.setInt(3, exp);
	stmt.executeUpdate();
	con.close();
		}
	catch(Exception e) {
	}
	
	}

	@Override
	public Employee getEmployeeById(String id) {
		
		try{
			Employee emp1;
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
				PreparedStatement stmt=con.prepareStatement("select * from jobber where id=?");
			stmt.setString(1, id);
				ResultSet rs=stmt.executeQuery();
				String ID=rs.getString(1);
				String name=rs.getString(2);
				int exp=rs.getInt(3);
		  Employee emp=new Employee(ID,name,exp);
		emp1=emp;
		con.close();}
		catch(Exception e) {
			System.out.println(e);
		}
return emp1;
		
	}
	

	@Override
	public List<Employee> fingAllEmployees() {
		List<Employee> employe=new ArrayList<Employee>();
		try{
			
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from jobber");
	
		while(rs.next()) {
			String id=rs.getString(1);
			String name=rs.getString(2);
			int exp=rs.getInt(3);
			
			Employee employee=new Employee(id,name,exp);
			employe.add(employee);
				
		}
		con.close();
		
		}
		catch(Exception e) {
			System.out.println(e);}
		return employe;
		
	}

}
