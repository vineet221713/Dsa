package com.vineet;

public class LList {
	Node head , tail;
	int size ;
	
	public LList() {
		head=tail=null;
		size=0;
	}
	
	class Node{
		int data ;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public void add(int data) {
		Node node = new Node(data);
		
		if(head==null) {
			head= tail=node;
			
		}
		else
			tail.next=node;
		    tail = node;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Node node1 = new Node(1);
//		Node node2 = new Node(2);
//		Node node3 = new Node(3);
//		Node node4 = new Node(4);
//		
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		
//		System.out.println(node1.next.next.data);
		
	

	}

}
