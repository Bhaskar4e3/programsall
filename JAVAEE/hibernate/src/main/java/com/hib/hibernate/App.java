package com.hib.hibernate;

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
ApplicationContext cun=new ClassPathXmlApplicationContext("hibernateConfg.xml");
 Business jobbers=(Business)cun.getBean("business");
 jobbers.getAll();
    }
}