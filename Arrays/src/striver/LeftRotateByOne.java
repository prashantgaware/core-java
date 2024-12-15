package striver;

public class LeftRotateByOne {
	
	static void leftRotate(int[] arr) {
		int n = arr.length;
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i-1] = arr[i];
		}
		arr[n-1] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6};
		leftRotate(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
