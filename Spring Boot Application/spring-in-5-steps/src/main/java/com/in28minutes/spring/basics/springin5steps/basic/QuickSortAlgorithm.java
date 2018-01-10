package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	/*
	 * needed elements: pivot, lowerindex,higherindex, array calculate if
	 * lowerindex is lesser than pivot calculate if higherindex is greater than
	 * pivot time complexity-o(n log n) worst case-o(n2)
	 * space complexity=>O(log n)
	 * does not need additional space
	 * in place sorting(without regard to internal storage space)
	 */

//	private static int array[];

	@Override
	public int[] sort(int[] inputArr) {
		int length = inputArr.length;
		quicksort(inputArr, 0, length - 1);
		return inputArr;
	}

	private void quicksort(int inputArr[], int lowerindex, int higherindex) {

		int i = lowerindex;
		int j = higherindex;
		// creating pivot element: essentially the middle element
		int pivot = inputArr[lowerindex + (higherindex - lowerindex) / 2];
		// comparing 1st element to the highest to sort recursively
		while (i <= j) {
			/**
			 * In each iteration, we will identify a number from left side which
			 * is greater then the pivot value, and also we will identify a
			 * number from right side which is less then the pivot value. Once
			 * the search  is done, then we exchange both numbers.    
			 */
			while (inputArr[i] < pivot) {
				i++;
			}

			while (inputArr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchangenumbers(inputArr, i, j);
				i++;
				j--;
			}

		}

		// call the quicksort method recursively to sort the numbers

		if (lowerindex < j) {
			quicksort(inputArr,lowerindex, j);
		}
		if (i < higherindex) {
			quicksort(inputArr,i, higherindex);
		}
		
		System.out.println("using quick sort");
	}

	private void exchangenumbers(int []inputArr,int i, int j) {
		int temp = inputArr[i];
		inputArr[i] = inputArr[j];
		inputArr[j] = temp;
	}

}
