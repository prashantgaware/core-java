package dsa.arrays;

import java.util.Scanner;

// Find the occurrence of element in array.

public class Test1 {
	
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
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Element : ");
		int x = sc.nextInt(); 
		
		System.out.println(occurenceOfElement(arr, x));

	}

}
