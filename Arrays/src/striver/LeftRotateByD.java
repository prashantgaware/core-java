package striver;

import java.util.Arrays;

public class LeftRotateByD {

	static void leftRotateByDBrute(int[] arr, int d) {
		for (int i = 0; i < d; i++) {
			LeftRotateByOne.leftRotate(arr);
		}
	}
	
	static void leftRotateBetter(int[] arr, int d) {
		d = d % arr.length;
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		
		int count = 0;
		for (int i = d; i < arr.length; i++) {
			arr[count++] = arr[i]; 
		}
		
		for (int i = 0; i < temp.length; i++) {
			arr[count++] = temp[i];
		}
	}
	
	static void leftRotateOptimal(int[] arr, int d) {
		d = d % arr.length;
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	
	private static void reverse(int[] arr, int low, int high) {
		while (low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,5,6,7,8};
		leftRotateBetter(arr1, 3);
		System.out.println(Arrays.toString(arr1));
		int[] arr2 = { 1,2,4,3,5,7,3};
		leftRotateByDBrute(arr2, 3);
		System.out.println(Arrays.toString(arr2));
		int[] arr3 = {2,3,5,3,5,6,4};
		leftRotateOptimal(arr3, 4);
		System.out.println(Arrays.toString(arr3));
	}
	
}
