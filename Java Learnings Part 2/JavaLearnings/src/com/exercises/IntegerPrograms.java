package com.exercises;

import java.util.ArrayList;
import java.util.List;

public class IntegerPrograms {

	public static int reverseNumber(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String a[]) {
		int array[] = { 1, 2, 2, 3, 4, 5, 5 };
		// System.out.println(findDuplicateInArray(array));
		// System.out.println(reverseNumber(12345));
		int newarr[] = removeDuplicates(array);
		//System.out.println(newarr);
		/*for (int i : newarr) {
			System.out.println("the arr is " + i);
		}*/
		List<Integer> lt=findPerfectNumber(6,500);
		for(Integer in:lt){
			System.out.println(in.intValue());
		}
		
		
	}

	public static int findDuplicateInArray(int arr[]) {
		int length = arr.length;
		int dup = 0;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1; j++) {
				if (arr[i] == arr[j]) {
					dup = arr[i];
				} else {
					dup = 0;
				}
			}
		}
		return dup;

	}
	
	public static List<Integer> findPerfectNumber(int from, int to){
		List<Integer> list= new ArrayList<Integer>();
		if(from>to){
			return list;
		}
		int tempFrom=0;

		while(from<=to){
			tempFrom=returnPerfectNumber(from);
			 if(tempFrom == from){
		            list.add(tempFrom);
		        }
			 from+=1;
		
		}
		return list;
	}
	
	public static int returnPerfectNumber(int number){
		int tempFrom=0;
        for(int i=1;i<number;i++){
            if(number%i == 0){
            	tempFrom += i;
            }
        }
            return tempFrom;
          
	}
	
	public static boolean findArmstrong(int number){
		int result=0;
		int orig=number;
		
		while(number!=0){
			int remainder=number%10;
			result= result+remainder*remainder*remainder;
			number=number/10;
		}
		if(orig==result){
			return true;
		}
		return false;
	}

	public static int[] removeDuplicates(int[] input) {
		// int array[]={1,1,2,3,4,5,5};
		int j = 0;
		int i = 1;
		//System.out.println("length is " + input.length);
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				
				i++;
				
			} else {
				input[++j] = input[i++];
				
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}

		return output;
	}

	static int[] merge(int[] arr1, int[] arr2) {
		int arr1_Length = arr1.length;
		int arr2_Length = arr2.length;
		int[] result = new int[arr1_Length + arr2_Length];
		int i = 0, j = 0;

		for (int k = 0; k < (arr1_Length + arr2_Length); k++) {
			// If arr1 is empty, copy the elements of the array arr2 to the
			// result array .
			// When i equals the length of array arr1 , copy the remaining
			// elements in the array arr2 to result
			if (i >= arr1_Length) // for step1 & 4
			{
				result[k] = arr2[j];
				j++;
			}
			// If arr2 is empty, copy the elements of the array arr1 to the
			// result array .
			// When j equals the length of array arr2 , copy the remaining
			// elements in the array arr1 to result
			else if (j >= arr2_Length) // For step 2 &amp; 4
			{
				result[k] = arr1[i];
				i++;
			} else {

				if (arr1[i] < arr2[j]) // step 3
				{
					result[k] = arr1[i];
					i++;
				} else {
					result[k] = arr2[j];
					j++;
				}
			}
		}
		return result;
	}
	
	

}
