import java.util.*;

public class AscendingSort {
	public static void sort(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static void sortFor(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,6,8,3,2,4};
		sortFor(arr);
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}