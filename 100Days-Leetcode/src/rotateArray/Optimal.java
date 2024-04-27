package rotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class Optimal {
	
	static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

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
			
			rotate(arr,k);
			System.out.println(Arrays.toString(arr));
		}
	}

}
