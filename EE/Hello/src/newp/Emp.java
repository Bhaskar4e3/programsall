package newp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emp {
	public static void main(String [] args) {
	 Employee emp=new Employee("9","lk",21);
	 
	 emp.call();
	System.out.println( emp.getExp()); 
	List<Employee> l1=new ArrayList<Employee>();
	l1.add(emp);
	l1.add(new Employee("210","bhaskar",22));
	l1.add(new Employee("211","pawan",23));
	l1.add(new Employee("220","virat",22));
	l1.add(new Employee("112","kiran",23));
	l1.add(new Employee("102","kohli",22));
	l1.add(new Employee("111","laal",23));
	Jdbc j=new Jdbc();
	for(Employee emp1:l1) {
	j.insert(emp1);
	}
	
	for(Employee empl:l1) {
		System.out.println(empl.getId()+" "+empl.getName()+" "+empl.getExp());
	}
	}

}
