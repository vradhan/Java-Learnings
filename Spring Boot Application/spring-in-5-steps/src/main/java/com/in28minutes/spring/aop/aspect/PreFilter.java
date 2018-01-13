package com.in28minutes.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP aspect filter
//Configuration
@Aspect
@Configuration
public class PreFilter {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	/*//point cuts
	@Pointcut("execution(* com.in28minutes.spring.aop.business"
            + "BusinessTwo.calculateSomething(..)")
    public void thinking(){
    }*/
	
	
	//method calls to intercept
	//input - execution format - execution(return_type package.class_name.method_name(args))
	// 1st * -> return type
	//2nd .*->class
	//3rd .*->method
	//4th (..) -> arguements
	@Before("execution(* com.in28minutes.spring.aop.business.*.*(..))")
	public void before(JoinPoint jp){
		log.info("intercepted calculatesomething method call - {}");
	}
}
