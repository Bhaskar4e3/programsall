package com.kb.secondMaven;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("configCollege.xml");
    	//get the student java bean
    	Student student=(Student)context.getBean("student");
    	
    	System.out.println("student details are :"+student.toString());
    	System.out.println();
    	
    	
    	// get the  teacher java bean
    	//Teacher teacher=(Teacher)context.getBean("teacher");
    	

    // System.out.println("teacher details :"+teacher.toString());
    	
    	
    	
    	
    	
    	
    	
    }
}
