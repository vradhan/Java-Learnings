package Collections;

import java.util.*;

public class ListDuplicates {
	
	public static void main(String a[]){
	ArrayList<String> al=new ArrayList<String>();
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("a");
	al.add("b");
	al.add("c");
	al.add("a");
	al.add("b");
	al.add("c");
	
	
	System.out.println(al.toString());
	System.out.println(Collections.frequency(al, "a"));
	int index=Collections.binarySearch(al, "c");
	
	HashSet<String> hs= new HashSet<String>(al);
	System.out.println(hs.toString());
	
	
}
}