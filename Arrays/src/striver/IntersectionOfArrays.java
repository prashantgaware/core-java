package striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfArrays {
	
	static List<Integer> intersectionOfArrays(int[] a, int[] b) {
		List<Integer> intersection = new ArrayList<Integer>();
		int i = 0, j = 0, n1 = a.length, n2 = b.length;
		while (i < n1 && j < n2) {
			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j]) 
				j++;
			else {
				if (intersection.size() == 0 || intersection.get(intersection.size() - 1) != a[i]) 
					intersection.add(a[i]);
				i++; 
				j++;
			}
		}
		
		return intersection;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5, 6};
        List<Integer> result = intersectionOfArrays(arr1, arr2);
        System.out.print("Intersection of arrays: " + Arrays.toString(result.toArray()));
	}

}
