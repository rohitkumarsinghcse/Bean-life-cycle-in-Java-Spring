package com.spring.bean.Bean_Life_Cycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean(name = "customerTwo")
	Customer getCustomer() {
		return new Customer();
	}
}
