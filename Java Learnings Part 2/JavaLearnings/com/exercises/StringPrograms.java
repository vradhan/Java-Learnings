package com.exercises;

import java.util.*;

import org.xml.sax.HandlerBase;

public class StringPrograms {
	//reverse a string 
	public static String reverse(String source){
		int length=source.length();
		if(source==null || source==""){
			return "";
		}
		String reverse="";
		for(int i=length-1;i>=0;i--){
			reverse+=source.charAt(i);
		}
		return reverse;
	}
	
	//reverse a string recursively
 public static String reverseString(String source){
		 
		 String reverse="";
		 if(source.length()==1 ){
			 return source;
		 }else{
			 reverse+=source.charAt(source.length()-1)+reverseString(source.substring(0,source.length()-1));
			 return reverse;
		 }
		 
		 
	 }
 //check palindrome of a string
	public static boolean palindrome(String source){
		String original=source;
		boolean result=false;
		if(original.equals(reverse(source))){
			result=true;
		}
		return result;
	}
	//duplicate characters in a string
	public static void duplicateCharacters(String source){
		
		Map<Character, Integer> dupmap= new HashMap<Character,Integer>();
		char cha[]=source.toCharArray();
		
		for(Character ch:cha){
			if(dupmap.containsKey(ch)){
				dupmap.put(ch,dupmap.get(ch)+1);
			}
			else{
				dupmap.put(ch, 1);
			}
		}
		Set<Character> set=dupmap.keySet();
		for(Character ch:set){
			System.out.println(ch+"..."+dupmap.get(ch));
		}
		
	}
	//permuation of a string using recursion
	 public static void permuteString(String beginningString, String endingString) {
		    if (endingString.length() <= 1)
		      System.out.println(beginningString + endingString);
		    else
		      for (int i = 0; i < endingString.length(); i++) {
		        try {
		          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
		          //System.out.println("new string"+newString);
		          permuteString(beginningString + endingString.charAt(i), newString);
		        } catch (StringIndexOutOfBoundsException exception) {
		          exception.printStackTrace();
		        }
		      }
	 }
	 //duplicate string in a line
	 public Map<String,Integer> wordcount(String file){
		 Map<String, Integer> wordmap= new HashMap<String,Integer>();
		 String line=null;
		 while(file!=null){
			 line=file;
			 StringTokenizer st= new StringTokenizer(line, "");
			 while(st.hasMoreTokens()){
				 String tmp=st.nextToken();
				 if(wordmap.containsKey(tmp)){
					 wordmap.put(tmp,wordmap.get(tmp)+1);
				 }
				 else{
					 wordmap.put(tmp, 1);
				 }
			 }
		 }
		 return wordmap;
	 }
	 
	 public static void methodA(int i){
		 System.out.println(i);
	 }
		 
	 public static void main(String []a){
		 //permuteString("","String");
		 System.out.println(reverse("String"));
		 System.out.println(reverseString("String"));
		 duplicateCharacters("aabc");
		 methodA(null);
		 
	 }
		
	

}
