package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

// Returning smallest and largest element of array in a array.

public class Test5 {
	
	static int[] smallestAndLargestElement(int[] arr) {
		
		Arrays.sort(arr);
		int[] result = {arr[0], arr[arr.length-1]};
		
		return result;
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
			
			int[] ans = smallestAndLargestElement(arr);
			System.out.println("Smallest : "+ans[0]);
			System.out.println("Largest : "+ans[1]);
		}

	}

}
