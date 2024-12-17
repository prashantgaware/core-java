package striver;

import java.util.Arrays;

public class MoveZeroesToEnd {
	
	static void moveZeroesBrute(int[] arr) {
		int lengthOfArray = arr.length;
		int[] temp = new int[lengthOfArray];
		int idx = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			if (arr[i] != 0) {
				temp[idx++] = arr[i];
			}
		}
		
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
	}
	
	static void moveZeroesBetter(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,0,7,0,0,3};
		int[] arr2 = {1,0,2,0,7,3,0,0,3};
		moveZeroesBrute(arr);
		System.out.println(Arrays.toString(arr));
		moveZeroesBetter(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
