package com.again.temp.jdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class User {
public User() {}
	private Data data;
	private Pojo pojo;
	
	public User(Pojo pojo) {
		super();
		this.pojo = pojo;
	}

	public Pojo getPojo() {
		return pojo;
	}

	public void setPojo(Pojo pojo) {
		this.pojo = pojo;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void insert()
	{
		List<Pojo> em=new ArrayList<Pojo>();
		 em=data.insertEmp();
		 for(Pojo empl:em) {
	 if(empl.getExp()>15) {
System.out.println("employee id "+empl.getId()+" name "+empl.getName()+" and expieirence "+empl.getExp()+" got 30% hike");
	    		 }
else if(empl.getExp()>=10) {
 System.out.println("employee id "+empl.getId()+" name "+empl.getName()+" and expieirence "+empl.getExp()+" got 20% hike");
	    		 }
	else if(empl.getExp()>=5) {
		System.out.println("employee id "+empl.getId()+" name "+empl.getName()+" and expieirence "+empl.getExp()+" got 15% hike");
	}
	    		 
	else {
	   System.out.println("employee id "+empl.getId()+" name "+empl.getName()+" and expieirence "+empl.getExp()+" got 10% hike");
	    		 }	 
}
	
}
}