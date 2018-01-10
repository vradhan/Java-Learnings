package com.interfaceExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class SuperClass {
	static int a=0;
	public void whosThere(){
		System.out.println("who's there" + a+++ "-a");
	}
}

class MiddleClass extends SuperClass{
	static int a=0;
	public void imTheMiddle(){
		System.out.println("i'm the middle "+ a+++ "-a");
	}
}

public class MainClass extends MiddleClass implements SampleInterface {
	
	MainClass (int a){
		System.out.println(a);
	}
	MainClass (){
		this(25);
	}

	public static void main(String[] args) {
		//SampleInterface si = new MainClass();
		//System.out.println(si.add(4, 5));
		
		/*MiddleClass mc = new MainClass();
		mc.imTheMiddle();
		mc.whosThere();
		
		MiddleClass mc1 = (MiddleClass) new MainClass();
		mc1.imTheMiddle();
		mc1.whosThere();
		
		SuperClass sc =(SuperClass) new MiddleClass();
		sc.whosThere();
		
		SuperClass sc1 = new MainClass();
		sc1.whosThere();*/
		
		MainClass mClass = new MainClass();
		stringList = mClass.addElementsIntoList((List<? super Object>) stringList);
		mClass.iterateOverList((List<? super Object>) stringList);
		
	}
	
	public void imTheMain(){
		System.out.println("i'm the main");
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	static List<?> stringList;
	static List<Integer> intList;
	
	public List<?> addElementsIntoList(List<? super Object> unKnownList){
		unKnownList = new ArrayList<Object>();
		unKnownList.add((Object)new String("abc"));
		return unKnownList;
	}
	
	public void iterateOverList(List<? super Object> unKnownList){
		unKnownList = new ArrayList<Object>();
		System.out.println(unKnownList.size());
		ListIterator<Object> it = unKnownList.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
}
