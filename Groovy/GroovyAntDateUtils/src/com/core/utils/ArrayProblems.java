package com.core.utils;
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

import groovy.ui.SystemOutputInterceptor;

public class ArrayProblems {
	
	
	
	
	 public static void main(String args[] ) throws Exception {
		 
		 int mainArray[] = {1,2,3,4,5,6,7};
		 
		 int rotation = 2;
		 int size = 7;
		 
/*		 for(int i = 0; i < rotation; i++){
			 rotateOneByOne(mainArray , size);
		 }
*/		 
		 mainArray = usingTempStorage(mainArray, rotation);
		 
	    }

	 private static int[] usingTempStorage(int[] mainArray, int rotation) {
		
		 int tempArray [] = new int[rotation];
		for(int i = 0; i < rotation; i++){
			tempArray[i] = mainArray [i];
		}
		List<Integer> ll = new LinkedList<Integer>(); 
		for(int a : tempArray){
			System.out.println(a);
		}
		return tempArray;
		
		
		
	}

	private static void rotateOneByOne(int array[], int size){
		 int i , temp;
		 temp = array[0];
		 for (i = 0; i < size - 1; i++){
			 array[i] = array[i+1];
			 array[i] = temp;
		 }
	 }
}
