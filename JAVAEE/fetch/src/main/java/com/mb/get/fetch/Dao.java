 package com.mb.get.fetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Dao {
	public Dao() {}
	
	private Employe employe;
	
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Dao(Employe employe) {
		super();
		this.employe = employe;
	}

	public Employe get(String id) {
	System.out.println("dao");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
					PreparedStatement stmt=con.prepareStatement("select * from jobber where id=?");
					stmt.setString(1, id);
					
					ResultSet rs=stmt.executeQuery();
					if(rs.next()) {
						String ID=rs.getString(1);
						String name=rs.getString(2);
						int exp=rs.getInt(3);
			
					
						
				System.out.println(ID+" "+name+" "+exp);		
					}
					con.close();
			}
			catch(Exception e) {
				System.out.println(e);}
		
		return employe;
			
	} 
}

