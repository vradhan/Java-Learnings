package com.datastructures;

public class LinkedList {
	public static void main(String a[]) {

		LinkedListImpl llist = new LinkedListImpl();

		llist.add("11");
		llist.add("12");
		llist.add(25);
		llist.add(2);
		llist.add(50);
		llist.add(45);

		llist.findMiddleElemet();
		System.out.println("list is :" + llist);
		System.out.println("list size is " + llist.size());
		System.out.println("list at 2 is : " + llist.get(2));
	}
}

class LinkedListImpl {
	Node head;
	private static int listcount;

	LinkedListImpl() {
		if(head!=null){
		head = new Node(null);
		}
		listcount = 0;
	}

	private static int getCounter() {
		return listcount;
	}

	private static void incrementCounter() {
		listcount++;
	}

	private void decrementCounter() {
		listcount--;
	}

	public Node findMiddleElemet() {
		Node current = head;
		int length = 0;
		Node middle = head;
		while (current.getNext() != null) {
			length++;
			
			if (length % 2 == 0) {
				middle = middle.getNext();
			}
			current = current.getNext();
			
			if (length % 2 == 1) {
				middle = middle.getNext();
			}
		}
		if(current.getNext()==null){
			System.out.println("the element at the 3rdposition from the end of the list is::=="+middle.getNext());
		}
		return middle.getNext();

	}

	public void add(Object data) {	

		Node current = head;
		Node temp = new Node(data);

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		incrementCounter();
	}

	public int size() {
		return getCounter();
	}

	public Object get(int index) {

		if (index <= 0) {
			return null;
		}
		Node current = head.getNext();
		for (int i = 1; i < index; i++) {
			if (current.getNext() == null) {
				return null;
			}
			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size()) {
			return false;
		}

		Node current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (current.getNext() == null)
					return false;

				current = current.getNext();
			}
			current.setNext(current.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
			return true;

		}
		return false;
	}

}

class Node {

	private Object data;
	private Node next;

	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}

	public Node(Object dataValue, Node nextValue) {
		data = dataValue;
		next = nextValue;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
