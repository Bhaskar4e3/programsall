package com.kb.secondMaven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
	private String Tname;
	private String subject;
	private int salary;
	
   @Autowired
   @Qualifier("student1")
	private Student student;
	
	public Teacher() {
		System.out.println("teacher constructor");
	}
 

	public Teacher(String Tname, String subject, int salary, Student student) {
		this.Tname = Tname;
		this.subject = subject;
		this.salary = salary;
	
		this.student = student;
	}


	@Override
	public String toString() {
		return "Teacher [Tname=" + Tname + ", subject=" + subject + ", salary=" + salary + ", student=" + student
				+ "]";
	}


	
	
	
	
	
	

}
