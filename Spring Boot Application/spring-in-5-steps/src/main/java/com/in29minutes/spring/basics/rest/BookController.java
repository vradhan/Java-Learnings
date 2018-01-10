package com.in29minutes.spring.basics.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public @ResponseBody Book getAllBooks(@RequestParam(value="/book", required = false, defaultValue = "Stranger") String name){
		return new Book(11,"harry potter", "JK Rowling");
	}
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(11,"harry potter", "JK Rowling"));
	}

}
