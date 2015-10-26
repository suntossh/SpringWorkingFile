package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanA {

	private BeanB beanB;
	private BeanC beanC;

	@Autowired(required=false)
	public BeanA(BeanB beanB) {
		super();
		System.out.println("Constructor called: BeanA(BeanB beanB)");
		this.beanB = beanB;
	}
	
	@Autowired(required=false)
	public BeanA(BeanB beanB, BeanC beanC) {
		super();
		System.out.println("Constructor called: BeanA(BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanB getBeanB() {
		return beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}

}
