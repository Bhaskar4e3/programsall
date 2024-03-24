package bk.pract.practice;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;




public class Store {

private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}

public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}

	public void insert(Constru constru) {
		try{
			String id=constru.getId();
			String name=constru.getName();
			int exp=constru.getExp();
			
			String sql="insert into jobber values(?,?,?)";
		jdbcTemplate.update(sql,id,name,exp);
			
		
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	
	public List<Constru> getEmployeeByid(String id) {
	List<Constru> emp=new ArrayList<Constru>();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
				PreparedStatement stmt=con.prepareStatement("select * from jobber where id=?");
				stmt.setString(1, id);
				
				ResultSet rs=stmt.executeQuery();
				while(rs.next()) {
					String ID=rs.getString(1);
					String name=rs.getString(2);
					int exp=rs.getInt(3);
					
					Constru employe=new Constru(ID,name,exp);
					emp.add(employe);
					}
				con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return emp;
		
	}

	}
	
