package dsa.arrays;

import java.util.Scanner;

// triplets : count the number of triplets whose sum is x.

public class Test7 {
	
	static int tripleSum(int[] arr, int target) {
		int result = 0;
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length-1; j++) {
				for(int k=i+2; k<arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						result++;
					}
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
			
			System.out.println("Pairs exists in array for target is : " + tripleSum(arr, target));
		}

	}

}
