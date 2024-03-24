package com.bk.myfirstMavenProject;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 //create the spring container
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	//get the bean for Customer
  
    	Customer customer=(Customer)context.getBean("cus");
    	
  System.out.println("customer details:"+customer.toString());
    	
    	//create the spring container
    	
    	//get the bean for Order
  Order order=(Order) context.getBean("ord");
   System.out.println("order details:"+order.toString());
  
    	
    }
}
