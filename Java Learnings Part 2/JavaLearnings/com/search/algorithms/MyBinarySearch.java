package com.search.algorithms;

/*
 * 
 * half interval search algo
 * requires a collection that is already sorted(Quicksort or mergesort)
 * searches the collection using a key
 * if the key is smaller than the element in the array(essentially the middle element key),
 * a sub array is formed and search is done.
 * 
 * Worst case=>O(log n)
 * best case scenario=>O(1)
 */

public class MyBinarySearch {

	public static int myarray[]={ 14, 54, 79, 464, 21, 4, 68, 456, };

	public static void main(String a[]) {
		 int array[] = { 14, 54, 79, 464, 21, 4, 68, 456, };
		MyBinarySearch bs = new MyBinarySearch();
		bs.sort(myarray);
		
		for (int i = 0; i < myarray.length; i++) {
			System.out.println("my array is" + myarray[i]);
		}
		System.out.println(" ");
		
		
		
		//System.out.println("sorted array is"+array);
		
		//System.out.println("the position of 68 element is " + bs.binarySearch(array, 68));

		System.out.println("the position of 54 element is " + bs.binarySearch(myarray, 54));
		
		System.out.println("the position of 54 element using linear search is"+bs.linearSearch(myarray, 54));
		
		System.out.println("the position of 54 element using recursivebinarySearch search is"+bs.recursivebinarySearch(myarray, 0, myarray.length-1, 54));
		
	}

	public int binarySearch(int[] inputArr, int key) {
		int start = 0;
		int end = inputArr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			System.out.println("middle value is" + mid);
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
				System.out.println("end value is" + end);

			} else {
				start = mid + 1;
				System.out.println("start value is" + end);

			}
		}
		return -1;

	}
	/*
	 * searches the array linearly one by one
	 * Has time complexity of O(N) at best & worst 
	 * 
	 */
	
	public int linearSearch(int tmpArray[], int key){
		
		int length=tmpArray.length;
		
		for(int i=0;i<length;i++){
			if(tmpArray[i]==key){
				return i;
			}
			
		}
		return -1;
	}
	public void recursiveBS(int array[], int key){
		
		int end=array.length-1;
		recursivebinarySearch(array, 0, end, key);
		
	}
	
	public int recursivebinarySearch(int arr[],int start,int end,int key){
		if(start<end){
			int mid=start+(end-start)/2;
			if(key<arr[mid]){
				return recursivebinarySearch(arr, start, mid, key);
			}
			if(key>arr[mid]){
				return recursivebinarySearch(arr, mid+1, end, key);
			}
			else{
				return mid;
			}
		}
		return -1;
		
	}
	
	public void  sort(int tmpArr[]){
		myarray=tmpArr;
		int end=tmpArr.length;
		quicksort(0,end-1);
	}

	private void quicksort(int lowerindex, int higherindex) {
		int i=lowerindex,j=higherindex;
		int pivot=myarray[lowerindex+(higherindex-lowerindex)/2];
		
		while(i<=j){
			while(myarray[i]<pivot){
				i++;
			}
			while(myarray[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangenums(i,j);
				i++;
				j--;
			}
			
			if(lowerindex<j){
				quicksort(lowerindex,j);
			}
			if(i>higherindex){
				quicksort(i,higherindex);
			}
		}
		
		
	}

	private void exchangenums(int i, int j) {
		int temp=myarray[i];
		myarray[i]=myarray[j];
		myarray[j]=temp;
		
	}
	
	

}
