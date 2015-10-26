package com.infiniteskills.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	/*<bean id="beanA" class="com.infiniteskills.spring.BeanA">
		<constructor-arg type="com.infiniteskills.spring.BeanB" ref="beanB"/>
	</bean>*/ 
	@Bean
	public BeanA beanA() {
		BeanA beanA = new BeanA(beanB());
		
		BeanB beanB = beanB();
		BeanB beanB2 = beanB();
		System.out.println(beanB == beanB2 ? "Same":"Different");
		return beanA;
	}
	
	/*<bean id="beanB" class="com.infiniteskills.spring.BeanB">
		<property name="beanC" ref="beanC"/>
	</bean>*/
	@Bean
	public BeanB beanB() {
		BeanB beanB = new BeanB();
		beanB.setBeanC(beanC());
		return beanB;
	}
	
	/*<bean id="beanC" class="com.infiniteskills.spring.BeanC">
		<property name="message" value="Java Configuration!"/>
	</bean>*/
	@Bean
	public BeanC beanC() {
		BeanC beanC = new BeanC();
		beanC.setMessage("This is my message");
		return beanC;
	}
}
