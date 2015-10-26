package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	private AccessibleBeanName myBean;

	public AccessibleBeanName getBean() {
		return myBean;
	}
	
	@Autowired
	@MagicBean
	public void setMyBean(AccessibleBeanName myBean) {
		this.myBean = myBean;
	}

}
