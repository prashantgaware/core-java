package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class Better2 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter length of array : ");
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			System.out.println("Enter Array Elements:");
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enetr the position : ");
			int k = sc.nextInt();
			
			rotate(arr,k);
			System.out.println(Arrays.toString(arr));
		}

	}

	public static void rotate(int[] arr, int order) {
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("Illegal argument!");
		
		}
		for (int i = 0; i <= order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
	}

}
