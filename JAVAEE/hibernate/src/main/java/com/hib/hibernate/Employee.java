package com.hib.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="employee")
public class Employee {
@Id
private int id;
private String name;
private String contact;
private String address;
private int exp;
public Employee(int id, String name, String contact, String address, int exp) {
	super();
	this.id = id;
	this.name = name;
	this.contact = contact;
	this.address = address;
	this.exp = exp;
}
public Employee() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}

}
