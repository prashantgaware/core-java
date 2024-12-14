package striver;

public class LargestElement {
	
	private static int getLargest(int[] arr) {
		int lengthOfArray = arr.length;
		int maxElement = Integer.MIN_VALUE;
		for (int i = 0; i < lengthOfArray; i++) {
			if (arr[i] > maxElement) {
				maxElement = arr[i];
			}
		}
		
		return maxElement;
	}
	
	public static void main(String[] args) {
		int[] array = {1,3,6,2,8,5};
		System.out.println(getLargest(array));
	}

}
