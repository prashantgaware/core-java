package dsa.arrays;

import java.util.Scanner;

// Target pair sum.

public class Test6 {
	
	static int pairSum(int[] arr, int target) {
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] + arr[j] == target) {
					result++;
				}
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
			
			System.out.println("Enter target : ");
			int target = scanner.nextInt();
			
			System.out.println("Pairs exists in array for target is : " + pairSum(arr, target));
		}

	}

}
