package com.kb.secondMaven;

import java.util.Map;

public class Student {
	private String name;
	private String ID;
	private Map<Integer,String> subjects;
	
	
	public Student() {
		System.out.println("student constructor");}


	public Student(String name, String iD, Map<Integer, String> subjects) {
	
		this.name = name;
		this.ID = iD;
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", ID=" + ID + ", subjects=" + subjects + "]";
	}
	
	


}
