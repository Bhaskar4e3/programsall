package bk.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Dao {
	
	public void get(String id) {
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
						
						}
					con.close();
		}
		catch(Exception e) {
		}
		}
	}

