package dsa.arrays;

import java.util.Scanner;

// Swap using temp

public class Test11 {
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
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
