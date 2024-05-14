package com.secondApproch;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	private String customerId;
	private String customerName;

	public Customer() {
		super();
		System.out.println("Object Created For The Customer");
	}
	
	@PostConstruct
	public void initilizationBean() {
		System.out.println("This is the logic for init()");
	}
	
	@PreDestroy
	public void destroyBean() {
		System.out.println("This is the logic for distroy()");
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
