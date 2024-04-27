package dsa.arrays;

import java.util.Scanner;

// Find the occurrence of element in array.

public class Test2 {
	
	static int occurenceOfElement(int[] arr, int x) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter Number of Elements: ");
			int n = scanner.nextInt();
			int[] arr = new int[n];
			
			System.out.println("Enter array elements: ");
			for(int i=0; i<n; i++) {
				arr[i] = scanner.nextInt();
			}
			
			System.out.println("Element : ");
			int x = scanner.nextInt(); 
			
			System.out.println(occurenceOfElement(arr, x));
		}

	}

}
