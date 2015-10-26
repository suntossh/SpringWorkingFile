package com.infiniteskills.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BeanA {

	private AccessibleBeanName myBean;
	
	public BeanA() {
		System.out.println("Instantiating BeanA()");
	}
	
	public AccessibleBeanName getBean() {
		return myBean;
	}
	
	@Autowired
	@MagicBean
	public void setMyBean(AccessibleBeanName myBean) {
		this.myBean = myBean;
	}

}
