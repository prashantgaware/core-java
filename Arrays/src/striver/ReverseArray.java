package striver;

public class ReverseArray {
	
	private static void reverseArray(int[] nums) {
		int start = 0, end = nums.length - 1;
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		reverseArray(nums);
		for (int item : nums) {
			System.out.print(item + "  ");
		}
	}

}
