package com.kb.Spring.jdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kb.Spring.jdbcSpring.business.EmployeeBusiness;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
      
      EmployeeBusiness employeeBusiness=(EmployeeBusiness)context.getBean("employeeBusiness");
     
    // employeeBusiness.insert();
    employeeBusiness.printEmployeeHikes();
      employeeBusiness.printEmployeeById();
    }
}
