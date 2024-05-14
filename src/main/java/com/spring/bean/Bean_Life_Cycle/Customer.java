package com.spring.bean.Bean_Life_Cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Customer implements InitializingBean,DisposableBean {

	private String customerId;
	private String customerName;

	public Customer() {
		super();
		System.out.println("Object Created For The Customer");
	}
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is Init logic from afterPropertiesSet()");
		System.out.println("Initialization logic goes here");
	}

	


	@Override
	public void destroy() throws Exception {
		System.out.println("This is destroying logic from destroy()");
		System.out.println("Cleanup logic goes here");
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
