package com.infiniteskills.spring;

public class BeanA {
	
	private int age;
	private BeanB beanb;
	
	public void setAge(int age) {
		System.out.println("Setting the age value using the setter");
		this.age = age;
	}

	public BeanB getBeanb() {
		return beanb;
	}

	public void setBeanb(BeanB beanb) {
		this.beanb = beanb;
	}

	public int getAge() {
		return age;
	}
	
}
