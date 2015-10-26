package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}

}
