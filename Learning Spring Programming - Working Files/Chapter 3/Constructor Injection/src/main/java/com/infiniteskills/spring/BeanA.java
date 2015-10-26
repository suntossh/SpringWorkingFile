package com.infiniteskills.spring;

public class BeanA {
	
	/*
	 * Constructor accepting a single string argument
	 */
	public BeanA(String value) {
		System.out.println("In the String constructor");
	}
	
	public BeanA(int value) {
		System.out.println("In the Int Constructor");
	}
	
	public BeanA(String value, String value2) {
		System.out.println("In the two argument constructor");
	}
	/*
	 * Constructor accepting an object argument
	 */
	public BeanA(BeanB beanB) {
		System.out.println("In the Object constructor");
		beanB.execute();
	}

}
