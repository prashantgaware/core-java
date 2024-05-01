package dsa.ll.basics;

import java.util.Iterator;

// Implementation
public class Test3 {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static class LinkedList{
		Node head = null;
		Node tail = null;
		
		void insertAtEnd(int val) {
			Node temp = new Node(val);
			if(head == null) {
				head = temp;
			} else {
				tail.next = temp;
			}
			
			tail = temp;
		}
		
		void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " ");
				temp= temp.next;
			}
			System.out.println();
		}
		
		int size() {
			Node temp = head;
			int count = 0;
			while(temp != null) {
				count++;
				temp = temp.next;
			}
			return count;
		}

		void insertAtHead(int val) {
			Node temp = new Node(val);
			if(head == null) {
//				head = tail = temp;
				
				insertAtEnd(val); 		// Recursive
			} else {
				temp.next = head;
				head = temp;
			}
		}
		
		void inserAtIndex(int index, int val) {
			Node t = new Node(val);
			Node temp = head;
			
			for(int i=1; i<=index-1; i++) {
				temp = temp.next;
			}
			t.next = temp.next;
			temp.next = t;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insertAtEnd(1);
		ll.insertAtEnd(2);
		ll.insertAtEnd(3);
		ll.insertAtEnd(4);
		ll.insertAtEnd(4);
		ll.inserAtIndex(3, 9);
		ll.display();
		
		System.out.println(ll.size());
		ll.insertAtEnd(5);
		System.out.println();
		System.out.println(ll.size());
		ll.display();
		ll.insertAtHead(1);
		ll.insertAtHead(2);
		ll.insertAtHead(3);
		ll.insertAtHead(6);
		ll.display();
		
	}



	
}
