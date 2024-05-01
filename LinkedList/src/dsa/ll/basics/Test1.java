package dsa.ll.basics;

public class Test1 {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	

	public static void main(String[] args) {
		
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(4);
		Node e = new Node(5);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		displayLL(a);
		System.out.println();
		displayLLRecursion(a);
		System.out.println();
		displayLLRecursionReverse(a);
	}

	public static void displayLLRecursion(Node head) {
		if(head == null)
			return;
		System.out.print(head.data + " ");
		displayLLRecursion(head.next);
	}
	
	public static void displayLLRecursionReverse(Node head) {
		if(head == null)
			return;
		displayLLRecursion(head.next);
		System.out.print(head.data + " ");
	}

	public static void displayLL(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

}
