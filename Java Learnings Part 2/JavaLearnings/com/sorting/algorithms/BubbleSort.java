package com.sorting.algorithms;

/**
 * @author visravi to sort integers iterates through the collection to length-1
 *         compares one element to another and swaps them if the element is
 *         greater than them
 *         useful for integer sorting
 *         time complexity: best-O(N) worst-O(n^2) average-O(N^2)
 *         space complexity:O(1)
 *
 */
public class BubbleSort {

	
	
	public static void main(String a[]){
		int[] intArray = { 1, 4, 23, 90, 54, 2, 7 };
		
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(intArray);
		for(int n:intArray){
			System.out.println(n);
			System.out.println("");
		}
		
	}

	public void bubbleSort(int[] array) {
		int n = array.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				// comparing one element to another
				if (array[j - 1] < array[j]) {
					
					// swap the elements if the 1st element is greater than next
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;

				}
			}
		}
	}

}
