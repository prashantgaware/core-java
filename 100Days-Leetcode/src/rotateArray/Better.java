package rotateArray;

import java.util.Scanner;

public class Better {

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
			
			int [] newArr = rotate(arr,k);
			for(int i=0; i<newArr.length; i++) {
				System.out.print(newArr[i]+"  ");
			}
			System.out.println();
		}

	}

	static int[] rotate(int[] arr, int k) {
		for(int i=0; i<k; i++) {
			leftSwapOfElement(arr);
		}
		
		return arr;
	}

	static void leftSwapOfElement(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = temp;
	}

}
