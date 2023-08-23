package com.vineet;

import java.util.Arrays;

public class LinkedList {

  Node head,tail;
  int size ;
  
  public LinkedList() {
	  head= tail=null;
	  size = 0;
  }

class Node{
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data=data ;
		this.next= null;
		
	}
	
}

public void add(int data) {
	
	Node n = new Node(data);
	if(head ==null) {
		head = tail=n;
		
	}
	else {
		tail.next=n;
		tail = n;
		
	}
	size++;
}


	public static void main(String[] args) {
	
	LinkedList list = new LinkedList();
	list.add(1);
	list.add(2);
	list.add(4);
	list.add(0);

	}

}
