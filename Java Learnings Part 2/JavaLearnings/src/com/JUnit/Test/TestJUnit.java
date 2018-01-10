package com.JUnit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJUnit {
	   protected int value1, value2;
	   
	   // assigning the values
	   // is used to do preprocessing before runninga test case
	   protected void setUp(){
	      value1 = 3;
	      value2 = 3;
	   }
	   @Test
	   // test method to add two values
	   public void testAdd(){
	      double result = value1 + value2;
	      assertTrue(result == 6);
	   }
	
	   // used to do any post processing before closing the unit test case
	protected void tearDown(){
		
	}
	   
	   
	}