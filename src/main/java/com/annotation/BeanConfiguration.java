package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean(initMethod = "beanInitilization",destroyMethod = "beanDistruction")
	public Customer getCustomer() {
		return new Customer();
	}
}
