package com.bk.myfirstMavenProject;

import java.util.Map;
import java.util.Properties;
//import java.util.List;
//import java.util.Set;

public class Customer {
	private String name;
	private String contact;
	private Properties address;
	
	public Customer(String name,String contact,Properties address) {
		this.name=name;
		this.contact=contact;
		this.address=address;
		
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
  
   public void say() {
	   System.out.println("hii,hello");
   }
  
   
   }

