package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class BeanC implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	public BeanC() {
		System.out.println("Instantiating BeanC()");
	}
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return this.beanName;
	}

}
