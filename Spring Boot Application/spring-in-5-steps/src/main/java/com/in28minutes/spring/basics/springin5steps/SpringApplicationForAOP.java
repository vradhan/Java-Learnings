package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.aop.business.BusinessOne;
import com.in28minutes.spring.aop.business.BusinessTwo;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.aop")
public class SpringApplicationForAOP implements CommandLineRunner {
	
	Logger log = LoggerFactory.getLogger(SpringApplicationForAOP.class);
	
	@Autowired
	BusinessOne b1;
	
	@Autowired
	BusinessTwo b2;
	
	public static void main(String a[]) {
		SpringApplication.run(SpringApplicationForAOP.class);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(b1.calculateSomething());
		log.info("inside ru for spring aop");
		//log.info(b2.calculateSomething());
	}

}
