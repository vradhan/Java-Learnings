package com.hackerrank.practiceprograms;

public class BigSorting {

	String sortedNumbers[];
	int length;

	public String[] sortBigNumbers(String numbers[]) {
		int i = 0;
		sortedNumbers= new String[numbers.length];
		for (String str : numbers) {
			sortedNumbers[i] = str;
			i++;
		}
		length = numbers.length;
		quickSort(0, length - 1);
		return sortedNumbers;
	}
	
	private Long solveBigNumber(String str){
		String numberToReturn;
		String longValue = String.valueOf(Long.MAX_VALUE);
		if(str.length() > longValue.length()){
			numberToReturn = str.substring(0, longValue.length());
			return Long.parseLong(numberToReturn);
		}
		return Long.parseLong(str);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j = higherIndex;

		long pivot = Long.parseLong(sortedNumbers[lowerIndex + (higherIndex - lowerIndex) / 2]);
		while (i <= j) {
			
			if (solveBigNumber(sortedNumbers[i]) < pivot) {
				i++;
			}
			
			if (solveBigNumber(sortedNumbers[j]) > pivot) {
				j--;
			}

			if (i <= j) {
				exchangeNumbers(i, j);
				i++;
				j--;
			}
		}

		if (lowerIndex < j) {
			quickSort(lowerIndex, j);
		}
		if (i < higherIndex) {
			quickSort(i, higherIndex);
		}

	}

	private void exchangeNumbers(int i, int j) {
		long temp = solveBigNumber(sortedNumbers[i]);
		sortedNumbers[i] = sortedNumbers[j];
		sortedNumbers[j] = String.valueOf(temp);

	}

	public static void main(String a[]) {
		String numbers[] = { "6", "31415926535897932384626433832795", "1", "3", "10", "3", "5" };
		BigSorting bs = new BigSorting();
		long startTime = System.nanoTime();
		bs.sortBigNumbers(numbers);
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("duration is -->"+duration);
		for(String str : bs.sortedNumbers){
			System.out.println(str);
		}
	}

}
