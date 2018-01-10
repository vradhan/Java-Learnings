package com.general.topics;

public class ExceptionExample {
	
	int x;
	
	public void methodA(){
		methodB();
		
	}
	
	public void methodB(){
		
			methodC();
		
			
		
		
	}
	
	public void methodC(){
		
			x=5/0;
			System.out.println(x);
		
	}
	
	public static void main(String a[]){
		try{
		ExceptionExample ee= new ExceptionExample();
		ee.methodA();
	}
		catch(Exception e){
			System.out.println("main block");
		}
	}
	

}
