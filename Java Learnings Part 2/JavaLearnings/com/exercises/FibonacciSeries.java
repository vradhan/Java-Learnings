package com.exercises;

public class FibonacciSeries {

	public static int fibonacci(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		System.out.println("number is"+number);
		return fibonacci(number - 1) + fibonacci(number - 2); // tail recursion
																// }
	}

	public static void main(String a[]) {
		
		Integer x= 45;
		Integer z= new Integer(45);
		int y=45;
		System.out.println(x.equals(y));
		System.out.println(x==y);
		
		System.out.println(x.equals(z));
		System.out.println(x==z);
		
		//System.out.println(fibonacci(3));
		
		int feb[] = new int[5];
		feb[0] = 0;
		feb[1] = 1;

		for (int i = 2; i < feb.length; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		for (int i = 0; i < feb.length; i++) {
			//System.out.print(feb[i] + " ");
		}

	}
}
