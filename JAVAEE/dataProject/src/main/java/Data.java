

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Data
 */
@WebServlet("/Data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Data() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		int amount=Integer.parseInt(request.getParameter("amount"));
		
		out.println(name);
		out.println(pwd);
		out.println(amount);
		
try {
	String reg="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/bhaskardb1";
	String unme="root";
	String passwd="root";
		 Class.forName(reg);
		 Connection con=DriverManager.getConnection(url,unme,passwd);
		 String qry="insert into bank values(?,?,?)";
		
		// Statement stmt=con.createStatement();
		 PreparedStatement stmt=con.prepareStatement(qry);
		 stmt.setString(1, name);
		 stmt.setString(2, pwd);
		 stmt.setInt(3, amount);
		
		// String qry="insert into bank values('"+uname+"','"+passwd+"',"+amount+")";
		 System.out.println(qry);
		 stmt.executeUpdate();
		 con.close();
		 out.println("done successfully");
		 
		 }
		catch(Exception e) {
			System.out.println(e);
		}
		 

		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
