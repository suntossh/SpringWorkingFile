package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	private BeanB beanB;

	@Autowired
	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}

	public void execute() {
		System.out.println(this.beanB.getBeanC().getMessage());
	}
}
