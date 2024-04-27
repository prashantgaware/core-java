package dsa.arrays;

import java.util.Scanner;

// triplets : count the number of triplets whose sum is x.

public class Test8 {
	
	static int findUnique(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		int result = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != -1) {
				result = arr[i];
			}
		}
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
			
			System.out.println("Unique Number : " + findUnique(arr));
		}

	}

}
