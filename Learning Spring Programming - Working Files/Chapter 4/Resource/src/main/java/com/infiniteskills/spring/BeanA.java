package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanA {

	private AccessibleBeanName bean;

	public AccessibleBeanName getBean() {
		return bean;
	}
	
	@Autowired
	@Qualifier(value="uniqueBeanName")
	public void setUniqueBeanName(AccessibleBeanName bean) {
		this.bean = bean;
	}

}
