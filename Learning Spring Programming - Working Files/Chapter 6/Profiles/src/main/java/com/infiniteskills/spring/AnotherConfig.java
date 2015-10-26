package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("TEST")
public class AnotherConfig {

	@Bean
	public BeanA beanA() {
		BeanA beanA = new BeanA();
		beanA.setConfigParameter("TEST Annotation Configuration");
		return beanA;
	}
}
