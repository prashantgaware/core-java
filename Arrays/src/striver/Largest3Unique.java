package striver;

import java.util.ArrayList;
import java.util.List;

/* Largest three distinct elements in an array
 
 	Given an array arr[], the task is to find the top three largest distinct integers present in the array.

	Note: If there are less than three distinct elements in the array, then return the available distinct numbers in descending order.
	
	Examples :
	
	Input: arr[] = [10, 4, 3, 50, 23, 90]
	Output: [90, 50, 23]
	
	
	Input: arr[] = [10, 9, 9]
	Output: [10, 9]
	There are only two distinct elements
	
	
	Input: arr[] = [10, 10, 10]
	Output: [10]
	There is only one distinct element
	
	
	Input: arr[] = []
	Output: []
	
 * */

public class Largest3Unique {
	public static void main(String[] args) {
		int[] arr = {12, 13, 1, 10, 34, 1};
        List<Integer> res = get3LargestUniq(arr);
        for (int x : res) {
            System.out.print(x + " ");
        }
        System.out.println();
	}
	
	static List<Integer> get3LargestUniq(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		int fis = -1, sec = -1, thd = -1;
		
		for (int x : arr) {
			if (x > fis) {
				thd = sec;
				sec = fis;
				fis = x;
			} else if (x > sec && x != fis) {
				thd = sec;
				sec = x;
			} else {
				thd = x;
			}
		}
		
		if (fis == -1) return result;
		result.add(fis);
		if (sec == -1) return result;
		result.add(sec);
		if (thd == -1) return result;
		result.add(thd);
		
		return result;
	}
}
