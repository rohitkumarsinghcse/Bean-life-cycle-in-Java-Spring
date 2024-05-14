package com.spring.bean.Bean_Life_Cycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.scan("com.*");
    	context.refresh();
    	
//    	Customer customer = context.getBean(Customer.class);
//    	customer.setCustomerId("1565");
//    	customer.setCustomerName("Rohit Kumar Singh");
//    	System.out.println("Customer Object : "+customer);
    	context.close();
    }
}
