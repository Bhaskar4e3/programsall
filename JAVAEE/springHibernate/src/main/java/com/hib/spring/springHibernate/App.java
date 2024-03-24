package com.hib.spring.springHibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hib.spring.springHibernate.EmployeeBusiness.EmployeeBusinessImpl;
import com.hib.spring.springHibernate.Entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con=new ClassPathXmlApplicationContext("File.xml"); 
        EmployeeBusinessImpl employe= (EmployeeBusinessImpl)con.getBean("EmployeeBusiness");
        Employee emp= new Employee();
        emp.setId(2);
        emp.setName("ram");
        emp.setContact("88888");
        emp.setAddress("bangalore");
        emp.setExp(2);
 
 //employe.save(emp);
        employe.findAll();
    }
}
