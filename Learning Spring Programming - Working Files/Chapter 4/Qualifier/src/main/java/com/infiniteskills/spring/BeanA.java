package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}
	
	@Autowired
	@MagicBean
	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}

}
