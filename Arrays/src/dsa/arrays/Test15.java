package dsa.arrays;

import java.util.Scanner;

// Reverse Array : Two pointer method

public class Test15 {
	
	static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			swapInArray(arr, start, end);
			start++;
			end--;
		}
	}
	
	static void swapInArray(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
			
			reverseArray(arr);
			printArray(arr);
			
		}

	}

}
