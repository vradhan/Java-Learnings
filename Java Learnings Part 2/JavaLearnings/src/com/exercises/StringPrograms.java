package com.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	//find the read command from list of linux commands ending in rar or zip or tgz
	
	public static long nullCheck(String a) throws ParseException{
		long l;
		int i = 10;
		l = !a.isEmpty() ? (long) Double.parseDouble(a) : 0L;

		String year = "01-JAN-2017";
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-yyyy");
		Date yeardate= sdf.parse(year);
		System.out.println(yeardate);
		return l;
		
		
	}
	
	public static int reverseStringUsingDiffApproach(){
		String a;
		int b,c = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number to be reversed :");
		a = input.next();
		b=a.length();
		
		for (int i=a.length()-1;i>=0;i--)
		{
			System.out.println(a.charAt(i));
						
		}
		System.out.println("The reverse is :"+c);
		return c;


	}
	
	public static Object[] reverseStringUsingObject(Object []a){
		String b[]=new String[a.length];
		b=(String[]) Arrays.copyOf(a, a.length);
		System.out.println("length of b-->"+b.length);
		List<String> reverse=new ArrayList<String>();
		
		for(int i=b.length-1;i>=0;i--){
			reverse.add(b[i]);
		}
		b=(String[]) reverse.toArray();
		return b;
	}
	
	public static String findReadCommand(String line){
		
		String lines[]=line.split("\n");
		int count=0;
		for(String str:lines){
		String regex="rx.*(zip|rar|tgz)";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		if(m.find()){
			count=count+1;
		}
		}
		return String.valueOf(count);
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
 	//check for 1st non repeated character
	public static String checkForNonRepeatedCharacter() {
		String input = "vishnuradhan";
		Character nonRepeatedCharacter=null;
		for (char i : input.toCharArray()) {
			if (input.indexOf(i) == input.lastIndexOf(i)) {
				nonRepeatedCharacter=i;
				break;
			}
		}
		return nonRepeatedCharacter.toString();
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
	 
	 //find index of second integer in the 1st one
		public static int findIndexOfProgram(int A, int B){
			String one=String.valueOf(A);
			String two=String.valueOf(B);
			int position=0;
			if(one.contains(two)){
				System.out.println("yes present");
				position=one.indexOf(two);
			}
			else {
				position=-1;
			}
			
			return Integer.valueOf(position);
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
		 
	 public static void main(String []a) throws ParseException{
		 //permuteString("","String");
		 //System.out.println(reverse("String"));
		 //System.out.println(reverseString("String"));
		 //duplicateCharacters("aabc");
		 String str="dealer demo(91000s)";
		// patternMatcher(str);
		 System.out.println("check for non repeated character:--"+checkForNonRepeatedCharacter());
			
		 String line ="rw - delete_this.rar\nrx - vishnu.zip\nrx - abc.tgz\nrw - def.zip\n";
		 //System.out.println("command line progranm:="+findReadCommand(line));
		 //System.out.println("find index of program:=="+findIndexOfProgram(1853786,-8));
		 String sentence[]=new String[]{"See", "Spot", "Run"};
		/* reverseStringUsingObject(sentence);
		 for(Object str32:reverseStringUsingObject(sentence)){
			 System.out.println((String)str32);
		 }
		 
		 */
		 //reverseStringUsingDiffApproach();
		 System.out.println(nullCheck(""));
	 }
	 static ArrayList<String> listOfEnums;
	private static void patternMatcher(String str) {
		//\\w+\\s+\\([0-9a-zA-Z^]\\)
		String spa[]=str.split("\\(");
		System.out.println(spa.length);
		System.out.println(spa[1]);
		System.out.println(spa[1].substring(0, spa[1].length()-1));
		Pattern pattern = Pattern.compile("\\(\\w+\\)");
		String split[]=pattern.split(str);
		 Matcher matcher = pattern.matcher(str);
		 boolean isMatch = matcher.find();
		 String input = matcher.group(0).replace("(", "");
		// System.out.println(input.replace(")", ""));
		 //System.out.println();
		 
		
	}
		
	

}
