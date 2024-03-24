package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String reg="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/bhaskardb1";
			String unme="root";
			String pwd="root";
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a username:");
			String uname=sc.next();
			System.out.println("enter a password:");
			String passwd=sc.next();
			System.out.println("enter a amount:");
			int amount=sc.nextInt();
			
			 Class.forName(reg);
			 Connection con=DriverManager.getConnection(url,unme,pwd);
			 String qry="insert into bank values(?,?,?)";
			
			// Statement stmt=con.createStatement();
			 PreparedStatement stmt=con.prepareStatement(qry);
			 stmt.setString(1, uname);
			 stmt.setString(2, passwd);
			 stmt.setInt(3, amount);
			
			// String qry="insert into bank values('"+uname+"','"+passwd+"',"+amount+")";
			 System.out.println(qry);
			 stmt.executeUpdate();
			 con.close();
			 System.out.println("done successfully");}
		catch(Exception e){
			System.out.println(e);
		}

}
}
	