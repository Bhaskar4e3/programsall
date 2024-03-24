package com.hib.spring.hibernateSpring;

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
        System.out.println( "Hello World!" );
        
 ApplicationContext cun=new ClassPathXmlApplicationContext("Newconfig.xml") ;
 
 Business bu=(Business)cun.getBean("business");
// bu.getAll();
 bu.call();
 //bu.printById(1);
 Employee employee=new Employee(3,"steve","australia","777777",5);
 //bu.delete(employee);
 bu.save(employee);
 
    }
}
