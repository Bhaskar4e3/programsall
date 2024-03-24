package bk.pract.practice;

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
    	System.out.println("hiii");
   ApplicationContext con=new ClassPathXmlApplicationContext("configuration.xml");
   Constru cun=(Constru)con.getBean("constru");
   System.out.println(cun.toString());
   
   Obj ob=(Obj)con.getBean("obj");
    ob.call();
   // System.out.println(ob.getConstru());
   // ob.get();
    
    
    }
    
}
