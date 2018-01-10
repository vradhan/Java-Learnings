package com.general.topics;

class A{
	A(int a){
		System.out.println(a);
	}
}

public class ConstructorExample extends A{

	private int a = 0;
	ConstructorExample(int a) {
		super(a);
		this.a = a;
	}
	
	A objA = new ConstructorExample(17);

}
