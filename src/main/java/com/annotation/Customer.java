package com.annotation;

public class Customer {

	private String customerId;
	private String customerName;

	public Customer() {
		super();
		System.out.println("Object Created For Customer");
	}

	public void beanInitilization() {
		System.out.println("Bean Initilization ............");
	}
	
	public void beanDistruction() {
		System.out.println("Bean Distruction ............");
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	

}
