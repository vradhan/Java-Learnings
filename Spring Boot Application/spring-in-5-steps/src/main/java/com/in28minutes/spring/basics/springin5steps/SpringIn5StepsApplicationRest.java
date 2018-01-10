package com.in28minutes.spring.basics.springin5steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@ComponentScan("com.in28minutes.spring.basics.rest")
@EnableWebMvc
public class SpringIn5StepsApplicationRest {
	
	private static Logger logger = LoggerFactory.getLogger(SpringIn5StepsApplicationRest.class);

	public static void main(String[] args) {
		
		
		
		SpringApplication.run(SpringIn5StepsApplicationRest.class);
		
		/*HashMap<String, Object> props = new HashMap<>();
		props.put("server.port", 9999);

		new SpringApplicationBuilder()
		    .sources(BookController.class)                
		    .properties(props)
		    .run(args);*/
	}
}
