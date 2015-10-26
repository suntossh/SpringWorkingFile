package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	//<bean id="beanA" class="com.infiniteskills.spring.BeanA"/>
	@Bean(name= {"beanB", "beanC"})
	public BeanA beanA() {
		return new BeanA();
	}
}
