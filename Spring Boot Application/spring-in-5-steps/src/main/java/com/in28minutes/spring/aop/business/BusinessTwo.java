package com.in28minutes.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.data.DAOTwo;

@Service
public class BusinessTwo {

	@Autowired
	DAOTwo dao2;
	
	public String calculateSomething(){
		return dao2.retriveSomething();
	}
}
