package com.bk.myfirstMavenProject;

public class Order {
	private String productName;
	private String productID;
	private int price;
	private Customer customer;
	

	public Order(String productName, String productID, int price, Customer customer) {
		super();
		this.productName = productName;
		this.productID = productID;
		this.price = price;
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [productName=" + productName + ", productID=" + productID + ", price=" + price + ", customer="
				+ customer + "]";
	}
	 
	
	

}
