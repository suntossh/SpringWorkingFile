package com.infiniteskills.spring;

public class BeanA {

	@SuppressWarnings("unused")
	private BeanB beanB;
	
	@SuppressWarnings("unused")
	private BeanC beanC;

	public BeanA(BeanB beanB) {
		System.out.println("Constructor Called: public BeanA(BeanB beanB)");
		this.beanB = beanB;
	}
	
	public BeanA(BeanB beanB, BeanC beanC) {
		super();
		System.out.println("Constructor Called: public BeanA(BeanB beanB, BeanC beanC)");
		this.beanB = beanB;
		this.beanC = beanC;
	}

	public BeanA(BeanB beanB, BeanC beanC, BeanR beanR) {
		super();
		System.out.println("Constructor Called: public BeanA(BeanB beanB, BeanC beanC, BeanR beanR)");
		this.beanB = beanB;
		this.beanC = beanC;
	}

}
