package bk.jdbc.insertJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bk.jdbc.insertJDBC.bl.Empbl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext con=new ClassPathXmlApplicationContext("Config.xml");
   Empbl emp=(Empbl) con.getBean("empbl");
   
   emp.insertEmp();
    }
}
