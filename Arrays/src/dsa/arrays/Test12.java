package dsa.arrays;

import java.util.Scanner;

// Second Max element in array.

public class Test12 {
	
	static int firstRepeatingNumber(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j])
					return arr[i];
			}
		}
		return -1;
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
			
			System.out.println("First Repeating Number : " + firstRepeatingNumber(arr));
		}

	}

}
