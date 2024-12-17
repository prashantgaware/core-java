package striver;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,4,6,8,3,7};
		System.out.println(lSearch(arr, 3));
	}
	
	static int lSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		
		return -1;
	}

}
