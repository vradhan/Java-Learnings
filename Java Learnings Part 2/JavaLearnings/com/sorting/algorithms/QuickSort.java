package com.sorting.algorithms;

import java.util.*;

//import org.apache.commons.lang.ArrayUtils;

public class QuickSort {

	/*
	 * needed elements: pivot, lowerindex,higherindex, array calculate if
	 * lowerindex is lesser than pivot calculate if higherindex is greater than
	 * pivot time complexity-o(n log n) worst case-o(n2)
	 * space complexity=>O(log n)
	 * does not need additional space
	 * in place sorting(without regard to internal storage space)
	 */

	private int array[];
	private int length;

	public void sort(int[] inputArr) {
		this.array = inputArr;
		length = inputArr.length;
		quicksort(0, length - 1);
	}

	private void quicksort(int lowerindex, int higherindex) {

		int i = lowerindex;
		int j = higherindex;
		// creating pivot element: essentially the middle element
		int pivot = array[lowerindex + (higherindex - lowerindex) / 2];
		// comparing 1st element to the highest to sort recursively
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search  is done, then we exchange both numbers.    
			 */
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangenumbers(i, j);
				i++;
				j--;
			}

		}

		// call the quicksort method recursively to sort the numbers

		if (lowerindex < j) {
			quicksort(lowerindex, j);
		}
		if (i < higherindex) {
			quicksort(i, higherindex);
		}
	}

	private void exchangenumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]) {
		List<Integer> ll = new ArrayList<Integer>();

		ll.add(15);
		ll.add(20);
		ll.add(5);
		ll.add(1);
		ll.add(50);
		ll.add(17);

		//Integer[] array = ll.toArray(new Integer[ll.size()]);
		
		int[] newArray= new int [ll.size()];
	
		for(int j=0;j<ll.size();j++){
			newArray[j]=ll.get(j);
		}
		
		System.out.println(newArray.length);
		
		int [] array={15,20,5,1,50,17,26};
		
		QuickSort quickSort= new QuickSort();
		quickSort.sort(array);
		for(int i:array){
            System.out.print(i);
            System.out.print(" ");
        }

	}

}
