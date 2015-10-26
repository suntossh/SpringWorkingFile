package com.infiniteskills.spring;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class BeanA {
	
	@Autowired
	private Map<String, BeanB> beanBs;

	@Autowired
	private ApplicationContext context;
	
	public Map<String, BeanB> getBeanBs() {
		return beanBs;
	}

	public void setBeanBs(Map<String, BeanB> beanBs) {
		this.beanBs = beanBs;
	}

	
}
