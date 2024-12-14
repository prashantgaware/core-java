package striver;

public class CheckIfSorted {
	
	private static boolean isSorted(int[] nums) {
		int lenghtOfArray = nums.length;
		for (int i = 0; i < lenghtOfArray; i++) {
			for (int j = i+1; j < lenghtOfArray; j++) {
				if (nums[i] > nums[j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	static boolean isSortedBetter(int[] arr) {
		int lengthofArray = arr.length;
		boolean sorted = true;
		for (int i = 1; i < lengthofArray; i++) {
			if (arr[i] < arr[i-1]) {
				sorted = false;
				break;
			}
		}
		
		return sorted;
	}

	public static void main(String[] args) {
		int[] nums = {1,4,5,7,3};
		System.out.println("Is sorted : " + isSorted(nums));
		System.out.println("Is sorted : " + isSortedBetter(nums));
	}
}
