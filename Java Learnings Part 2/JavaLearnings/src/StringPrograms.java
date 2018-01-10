

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class StringPrograms {
	
	private static void findDuplicateWords(String line){
		
		//StringTokenizer tokens = 
		
		Map <String,Integer> wordMap = new HashMap<String,Integer>();
		
	}
	
	 public static void print(String s) {
		    System.out.printf("(Object: %d) >%s<%n", System.identityHashCode(s), s);
		  }
	 
	 public static void createMutableString(String s) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		    print(s);

		    String stringClass = new String("abc");
		    final Field valueField = stringClass.getClass().getDeclaredField("length");
		    valueField.setAccessible(true);
		    valueField.set(stringClass, 20);;

		    final char[] value = (char[]) valueField.get(s);
		   // value[0] = 'i';
		    //value[10] = 's';
		    print(s);

		  //  System.arraycopy("Mutable String".toCharArray(), 0, value, 0, 14);
		  //  print(s);

		    valueField.set(s, "Mutable String".toCharArray());
		    print(s);
	 }
	 
	 public static void main(String y[]) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException{
		 //createImmutableString("Immutable String");

		/* int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		 int reverseMatrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		 swapMatrixValues(matrix,1,7);
		 swapMatrixValues(matrix,3,9);
		 for(int i = 0; i <matrix.length; i++){
			 for(int j = 0; j <matrix[i].length; j++){
				 System.out.println("arryay is : -"+matrix[i][j]);
			 }
		 }
		 
		 //reverseTheMatrix(reverseMatrix);
*/	 
		 findOccurancesWithoutCollections("paypal india");
		 //printFristThreeCharacters("paypal india");
	 }
	 
	 private static void reverseTheMatrix(int[][] reverseMatrix) {
		 for(int i = reverseMatrix.length; i >=reverseMatrix.length; i--){
			 for(int j = reverseMatrix[i].length; j >=reverseMatrix[i].length; j--){
				 System.out.println(reverseMatrix[i][j]);
			 }
		 }
		
	}

	public static void swapMatrixValues(int matrix[][],int a, int b){
		
		 List<Integer> swapIndexes = new ArrayList<Integer>();
		 for(int i = 0; i <matrix.length; i++){
			 for(int j = 0; j <matrix[i].length; j++){
				 if(matrix[i][j] == a || matrix[i][j] == b){
					 swapIndexes.add(i);
					 swapIndexes.add(j);
				 }
			 }
		 }
		 swapValuesInMatrix(matrix, swapIndexes);
		
	 }
	
	public static void findOccurancesWithoutCollections(String s){
		s = s.replaceAll("\\s+", "");
		
		char c[] = s.toCharArray();
		
		/*for (int i = 0; i < s.length(); i++) {
			if(s.indexOf(c[i]))
		}*/
		System.out.println("returns duplicate characters\n");
		for(char ch : c){
			if(s.indexOf(ch) != s.lastIndexOf(ch)){
				System.out.println(ch);
			}
		}
		System.out.println("\nreturns unique characters\n");
		for(char ch : c){
			if(s.indexOf(ch) == s.lastIndexOf(ch)){
				System.out.println(ch);
			}
		}

	}
	
	public static void printFristThreeCharacters(String s){
		s = s.replaceAll("\\s+", "");
		char c[] = s.toCharArray();
		int a = 0;
		for(int i = 0; i < c.length; i++){
			if(a%3 == 0){
				System.out.println("\n");
			}
			System.out.println(c[i]);
			a++;
		}
	}

	private static void swapValuesInMatrix(int[][] matrix, List<Integer> swapIndexes) {
		int temp = matrix[swapIndexes.get(0)][swapIndexes.get(1)];
		 matrix[swapIndexes.get(0)][swapIndexes.get(1)] = matrix[swapIndexes.get(2)][swapIndexes.get(3)];
		 matrix[swapIndexes.get(2)][swapIndexes.get(3)] = temp;
	}
}
