package com.datastructures;


public class DoublyLinkedList {
	
	public static void main(String a[]){
	
	DoublyLinkedListImpl lm= new DoublyLinkedListImpl();
	lm.addFirst("15");
	lm.addLast("25");
	System.out.println("size is"+lm.size());
	System.out.println(lm);
	
	}
}
	
	class DoublyLinkedListImpl{
		
		DoublyNode head;
		DoublyNode tail;
		int listsize;
		
		DoublyLinkedListImpl(){
			head=new DoublyNode(null);
			tail=new DoublyNode(null);
			listsize=0;
		}
		
		public int size(){
			return listsize;
		}
		
		public boolean isEmpty(){
			return listsize==0;
		}
		
		public void addFirst(Object data){
			DoublyNode tmp=new DoublyNode(data,null, null);
			DoublyNode current=head;
			
			if(current.getNext()==null){
				current=tmp;
				tail=current;
			}
			else{
				current.setPrev(tmp);
				tail.setNext(current);
				current=tmp;
			}
			listsize++;
			
		}
		
		public void addLast(Object data){
			DoublyNode tmp= new DoublyNode(data,null,null);
			DoublyNode current=head;
			
			if(current.getNext()==null){
				current=tmp;
				tail=current;
			}
			else{
				current.setNext(tmp);
				tail.setPrev(tmp);
				tail=tmp;
			}
			listsize++;
			}
		
	}


class DoublyNode{
	DoublyNode next;
	DoublyNode prev;
	Object data;
	
	public DoublyNode getPrev() {
		return prev;
	}
	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
		
	}
	public DoublyNode getNext() {
		return next;
	}
	public DoublyNode setNext(DoublyNode next) {
		return this.next = next;
	}
	
	
	DoublyNode (Object dataValue){
		next=null;
		prev=null;
		data=dataValue;
	}
	DoublyNode (Object dataValue, DoublyNode nextValue, DoublyNode prevValue){
		data=dataValue;
		next=nextValue;
		prev=prevValue;
	}
	
	
}
