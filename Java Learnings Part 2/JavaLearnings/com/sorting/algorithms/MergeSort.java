package com.sorting.algorithms;

/**
 * @author visravi
 * 
 *         merge sort splits the collection from middle element and sorts
 *         recursively takes additional space best & worst case scenario->
 *         O(n log n) 
 *         Arrays are partitioned equally and recursively sorted and merged
 *         in the end
 *         space complexity-O(N)
 *
 */
public class MergeSort {

	private int[] array;
	private int[] tmparray;
	private int length;

	public void sort(int[] arrayc) {
		this.array = arrayc;
		length = arrayc.length;
		this.tmparray = new int[length];
		mergesort(0, length - 1);

	}

	void mergesort(int lowerindex, int higherindex) {
		if (lowerindex < higherindex) {
			int middle = lowerindex + (higherindex - lowerindex - 1) / 2;
			// below step sorts the left side of array
			mergesort(lowerindex, middle);
			// below step sorts the right side of array
			mergesort(middle + 1, higherindex);
			// now merge both sides
			mergeparts(lowerindex, middle, higherindex);

		}
	}

	void mergeparts(int lowerindex, int middle, int higherindex) {

		for (int i = lowerindex; i <= higherindex; i++) {
			tmparray[i] = array[i];
		}

		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;
		while (i <= middle && j <= higherindex) {
			if (tmparray[i] <= tmparray[j]) {
				array[k] = tmparray[i];
				i++;
			} else {
				array[k] = tmparray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tmparray[i];
			k++;
			i++;
		}

	}
	
	public static void main(String a[]){
		MergeSort me = new MergeSort();
		 int[] arrayc= {5,98,465,123,7,13,65};
		
		me.sort(arrayc);	
		for(int j:arrayc){
			System.out.println(j);
			System.out.println(" ");
		}

}
}
