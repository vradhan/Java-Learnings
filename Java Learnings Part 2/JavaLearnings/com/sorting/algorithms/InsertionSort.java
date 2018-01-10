package com.sorting.algorithms;

/**
 * @author visravi
 * It removes one element from an index, compares that element to all the elements in the array
 * and it inserts it into the postion where it belongs
 * sorts elements one item at a time
 * very less efficient
 * time complexity: best,worst,average-O(N^2)
 */


public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		
		
		

	}
	void insertionSort(int[] arr) {
	      int i, j, newValue;
	      
	      for (i = 1; i < arr.length; i++) {
	    	  // assigning a the item to be arranged to new value var
	            newValue = arr[i];
	            j = i;
	            while (j > 0 && arr[j - 1] > newValue) {
	                  arr[j] = arr[j - 1];
	                  j--;
	            }
	            arr[j] = newValue;
	      }
	}

}
