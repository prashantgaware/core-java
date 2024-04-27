package dsa.arrays;

import java.util.Scanner;

// Swap without temp

public class Test14 {
	
	static void swap(int a, int b) {
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a : "+a+", "+"b: "+b);
	}
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			swap(a, b);
		}

	}

}
