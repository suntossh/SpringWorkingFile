package com.infiniteskills.spring;

public class BeanA {

	private BeanB beanB;

	public BeanA() {
	}
	
	public void destroy() {
		System.out.println("Destroying our bean");
	}
	
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
