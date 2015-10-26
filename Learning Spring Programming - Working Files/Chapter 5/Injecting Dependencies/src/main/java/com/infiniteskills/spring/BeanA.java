package com.infiniteskills.spring;

public class BeanA {

	private BeanB beanB;

	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}

	public void execute() {
		System.out.println(this.beanB.getBeanC().getMessage());
	}
}
