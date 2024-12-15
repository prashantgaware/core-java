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
	
	public static void main(String[] args) {
		int[] arr = {1,2,0,7,0,0,3};
		moveZeroesBrute(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
