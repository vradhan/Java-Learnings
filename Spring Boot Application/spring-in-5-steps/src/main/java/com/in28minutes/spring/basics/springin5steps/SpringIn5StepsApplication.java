package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplication.class);

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		logger.info("{}",binarySearchImpl);
		logger.info("{}",binarySearchImpl1);
		
		int result = binarySearchImpl.binarySearch(new int[]{12, 4,5,7},5);
		logger.info("{}",String.valueOf(result));
		
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		logger.info("{}",personDao);
		logger.info("{}",personDao.getJdbcConnection());
		
		logger.info("{}",personDao2);
		logger.info("{}",personDao2.getJdbcConnection());
	}
}
