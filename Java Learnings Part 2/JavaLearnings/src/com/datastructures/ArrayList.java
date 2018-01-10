package com.datastructures;

import java.util.Arrays;

public class ArrayList<E> {

	private Object [] arrayList;
	private int length=0;
	private final int  DEFAULT_INITIALCAPACITY=10;
	
	
	ArrayList(Object value){
		arrayList=new Object[DEFAULT_INITIALCAPACITY];
	}
	
	public void add(Object e){
		if(length==arrayList.length){
			ensureCapacity();
			
		}
		arrayList[length++]=e;
		length++;
		
	}

	private void ensureCapacity() {
		int newsize=arrayList.length*2;
		arrayList=Arrays.copyOf(arrayList, newsize);
		
		
	}
	
	@SuppressWarnings("unchecked")
	public E get(int index){
		if(index>=length || index>0){
			throw new ArrayIndexOutOfBoundsException();
		}
		return (E) arrayList[index];
	}
}
