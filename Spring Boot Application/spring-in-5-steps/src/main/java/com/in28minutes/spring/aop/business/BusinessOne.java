package com.in28minutes.spring.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in28minutes.spring.aop.data.DAOOne;

@Service
public class BusinessOne {

	@Autowired
	DAOOne dao1;
	
	public String calculateSomething(){
		return dao1.retriveSomething();
	}
}
