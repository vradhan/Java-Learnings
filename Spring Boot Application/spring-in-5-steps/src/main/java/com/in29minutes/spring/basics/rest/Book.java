package com.in29minutes.spring.basics.rest;

import org.springframework.stereotype.Component;

@Component
public class Book {
	
	long id;
	String author;
	String isbn;
	
	public Book(long id, String author, String isbn) {
		super();
		this.id = id;
		this.author = author;
		this.isbn = isbn;
	}
	
	

}
