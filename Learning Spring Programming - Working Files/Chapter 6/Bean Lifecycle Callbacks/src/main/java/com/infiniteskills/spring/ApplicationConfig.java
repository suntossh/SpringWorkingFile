package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public BeanA beanA() {
		BeanA beanA = new BeanA();
		beanA.setBeanB(beanB());
		return beanA;
	}

	public BeanB beanB() {
		BeanB beanB = new BeanB();
		beanB.setMessage("Testing PostConstruct");
		return beanB;
	}
}
