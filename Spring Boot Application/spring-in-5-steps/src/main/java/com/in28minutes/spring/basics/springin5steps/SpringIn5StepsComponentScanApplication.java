package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.springin5steps.basic")
@ComponentScan("com.in28minutes.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsComponentScanApplication.class);
		
		ComponentDAO personDao2 = applicationContext.getBean(ComponentDAO.class);
		
		BinarySearchImpl bsearch = applicationContext.getBean(BinarySearchImpl.class);
		bsearch.binarySearch(new int[]{0,1,2,3}, 3);
		
		logger.info("{}",personDao2);
		logger.info("{}",personDao2.getComponentJDBCConnection());
	}
}
