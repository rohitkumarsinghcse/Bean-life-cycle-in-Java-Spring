package com.xml;

public class Customer {

	private String customerId;
	private String customerName;

	public Customer() {
		super();
		System.out.println("Object Created For The Customer");
	}

	public void beanInitilization() {
		System.out.println("Bean Initilization");
	}

	public void beanDestuction() {
		System.out.println("Bean Destruction");
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
