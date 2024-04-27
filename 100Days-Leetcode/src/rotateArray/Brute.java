package rotateArray;

import java.util.Scanner;

public class Brute {
	
	static void rotateArray(int[] arr) {
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		rotateArray(arr);
		System.out.println();
		
	}

}
