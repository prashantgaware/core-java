package striver;

public class OccurencesOfElement {
	
	static int occurences(int[] arr, int target) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == target) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,3,4};
		System.out.println(occurences(arr, 3));
	}
	
}
