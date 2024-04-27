package dsa.arrays;

import java.util.Scanner;

// Second Max element in array.

public class Test10 {
	
	static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	static int findSecondMax(int[] arr) {
		
		int max = findMax(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == max) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		
		int secondMax = findMax(arr);
		return secondMax;
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
			
			System.out.println("Second Max Element : " + findSecondMax(arr));
		}

	}

}
