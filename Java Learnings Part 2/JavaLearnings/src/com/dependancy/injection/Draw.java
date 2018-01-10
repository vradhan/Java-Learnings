package com.dependancy.injection;

public class Draw {
	 public static void methodA(int i){
		 System.out.println(i);
	 }
	
	public static void main(String s[]){
		Shape s1= new Triangle();
		Drawing d= new Drawing();
		d.setShape(s1);
		d.drawShape();
		
	}

}
