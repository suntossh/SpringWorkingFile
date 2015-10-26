
package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("DEV")
public class ApplicationConfig {

	@Bean
	public BeanA beanA() {
		BeanA beanA = new BeanA();
		beanA.setConfigParameter("DEV Annotation Configuration");
		return beanA;
	}
	
}
