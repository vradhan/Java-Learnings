package com.exercises;

import java.util.Scanner;

public class VenturesityPuzzle {

	private static final String[] bigNames = { "thousand", "million", "billion" };

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	public String convertIntoString() {
		return "A";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		System.out.println(a);
		System.out.println(Integer.toString(a));
		scanner.close();

	}

}
