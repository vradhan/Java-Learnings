package com.hackerrank.practiceprograms;

public class InsertionSort {
	
	public static void main(String a[]){
		int arr[] = {15,20,5,1,50,17,26};
		long startTime = System.nanoTime();
		insertionSort(arr);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("duration of insertion sort is-->"+duration);
		
		for ( int i : insertionSort(arr)){
			System.out.println(i);
		}
		
		
	}
	
	static int [] insertionSort(int[] arr){
		
		int i, j, swapValue;
		
		for(i = 1; i < arr.length; i++){
			swapValue=arr[i];
			j = i;
			while( j > 0 && arr[j-1] > swapValue){
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = swapValue;
		}
		return arr;
	}

}
