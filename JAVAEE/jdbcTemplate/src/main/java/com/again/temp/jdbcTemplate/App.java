package com.again.temp.jdbcTemplate;

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
        
        
ApplicationContext context=new ClassPathXmlApplicationContext("figcon.xml")   ;
User ui=(User)context.getBean("user");
ui.insert();
System.out.println( "Hello World!" );
    }
}
