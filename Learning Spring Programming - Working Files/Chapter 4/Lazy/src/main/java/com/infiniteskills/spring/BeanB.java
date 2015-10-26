package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service("thisIsComponentScanning")
@MagicBean
@Lazy
public class BeanB implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	public BeanB() {
		System.out.println("Instantiating BeanB()");
	}
	
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return this.beanName;
	}

}
