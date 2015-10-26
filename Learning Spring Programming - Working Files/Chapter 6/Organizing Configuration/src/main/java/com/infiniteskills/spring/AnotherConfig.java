package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfig {

	@Bean
	public BeanB beanB() {
		BeanB b = new BeanB();
		b.setMessage("Java config Import");
		return b;
	}
}
