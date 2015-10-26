package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AnotherConfig.class)
@ComponentScan("com.infiniteskills.spring")
public class ApplicationConfig {

	@Autowired
	private AnotherConfig anotherConfig;
	
	@Bean
	public BeanA beanA() {
		BeanA beanA = new BeanA();
		beanA.setBeanB(anotherConfig.beanB());
		return beanA;
	}
}
