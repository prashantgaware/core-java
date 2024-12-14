package striver;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
	
	static int removeDuplicatesBrute(int[] arr) {
		Set<Integer> hs = new HashSet<>();
		for (int item : arr) {
			hs.add(item);
		}
		
		return hs.size();
	}
	
	private static int removeDuplicatesOptimal(int[] array) {
		int i = 0;
		for (int j = i+1; j < array.length; j++) {
			if (array[i] != array[j]) {
				array[i+1] = array[j];
				i++;
			}
		}
		
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,2,3,3,4,5,5,5};
		System.out.println("Remove duplicates : " + removeDuplicatesBrute(array));
		System.out.println("Remove duplicates : " + removeDuplicatesOptimal(array));
	}

}
