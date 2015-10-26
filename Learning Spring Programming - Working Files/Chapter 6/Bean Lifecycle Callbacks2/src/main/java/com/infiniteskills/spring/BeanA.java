package com.infiniteskills.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanA {

	private BeanB beanB;

	public BeanA() {
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying our bean");
	}

	@PostConstruct
	public void init() {		
		System.out.println(beanB.getMessage());
	}
	
	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
}
