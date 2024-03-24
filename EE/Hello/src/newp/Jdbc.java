package newp;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;
public class Jdbc {
	
	
	public void insert(Employee emp1) {
		 try {
	    	   String id=emp1.getId();
	    	   String name=emp1.getName();
	    	   int exp=emp1.getExp();
	    	   
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
	   PreparedStatement stmt=con.prepareStatement("insert into jobber values(?,?,?)");
	       stmt.setString(1, id);
	       stmt.setString(2, name);
	       stmt.setInt(3, exp);
	       stmt.executeUpdate();
	       con.close();}
	       catch(Exception e) {
	    	   System.out.println(e);
	       }
	       
	
	}
	
}
