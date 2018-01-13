package com.in28minutes.spring.aop.data;

import org.springframework.stereotype.Repository;

@Repository
public class DAOOne {

	public String retriveSomething(){
		return this.getClass().getName();
	}
}
