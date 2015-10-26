package com.infiniteskills.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
public class BeanA {
	
}
