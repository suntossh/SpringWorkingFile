package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Repository;

@Repository
public class BeanC implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return this.beanName;
	}

}
