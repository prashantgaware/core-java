package dsa.arrays;

import java.util.Scanner;

// Check whether arrays is sorted or not.

public class Test3 {
	
	static boolean isSorted(int[] arr) {
		boolean check = true;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				check = false;
				break;
			}
		}
		
		return check;
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
			
			System.out.println("Is Soretd : "+isSorted(arr));
		}

	}

}
