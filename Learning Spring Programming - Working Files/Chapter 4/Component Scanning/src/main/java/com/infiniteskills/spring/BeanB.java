package com.infiniteskills.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

@Service("thisIsComponentScanning")
@MagicBean
public class BeanB implements BeanNameAware, AccessibleBeanName {

	private String beanName;

	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return this.beanName;
	}

}
