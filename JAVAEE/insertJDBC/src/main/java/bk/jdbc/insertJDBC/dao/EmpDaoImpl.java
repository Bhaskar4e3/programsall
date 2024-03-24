package bk.jdbc.insertJDBC.dao;

import bk.jdbc.insertJDBC.dto.Employee;
import java.sql.*;

public class EmpDaoImpl implements EmpDao {

	@Override
	public void insert(Employee emp) {
	
		
       try {
    	   String id=emp.getId();
    	   String name=emp.getName();
    	   int exp=emp.getExp();
    	   
    	   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
   PreparedStatement stmt=con.prepareStatement("insert into jobber(?,?,?)");
       stmt.setString(1, id);
       stmt.setString(2, name);
       stmt.setInt(3, exp);
       stmt.executeUpdate();
       
       con.close();
       
	}
       catch(Exception e) {
    	   
       }

}
}
