package striver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArrays {
	
	static int[] unionBruteUsingSet(int[] arr1, int[] arr2) {
		Set<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			hs.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			hs.add(arr2[i]);
		}
		
		int[] union = new int[hs.size()];
		int idx= 0;
		for (int i : hs) {
			union[idx++] = i;
		}
		
		return union;
	}
	
	static List<Integer> unionArr(int[] arr1, int[] arr2) {
		List<Integer> union = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
					union.add(arr1[i]);
				i++;
			} else {
				if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
					union.add(arr2[j]);
				j++;
			}
		}
		
		while (i < n1) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
		
		return union;
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,5,6};
		int[] arr2 = {2,4,6,8};
		int[] union = unionBruteUsingSet(arr1, arr2);
		System.out.println(Arrays.toString(union));
		List<Integer> unionArr = unionArr(arr1, arr2);
		System.out.println(Arrays.toString(unionArr.toArray()));
	}
	
}
