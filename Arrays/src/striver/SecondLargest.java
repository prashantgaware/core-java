package striver;

import java.util.Arrays;

public class SecondLargest {
	
	private static int secondLargest(int[] array) {
		int lengthOfArray = array.length;
		int largest = array[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 1; i < lengthOfArray; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			}
		}
		
		return secondLargest;
	}
	
	private static int secondLargestBrute(int[] array) {
		Arrays.sort(array);
		return array[array.length - 2];
	}

	public static void main(String[] args) {
		int[] array = {1,5,8,2,4,80};
		System.out.println("Second Largest element : " + secondLargest(array));
		System.out.println("Second Largest element : " + secondLargestBrute(array));
	}
}
