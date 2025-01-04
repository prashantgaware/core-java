public class SumOfNumbers {
	public int sum(int n) {
		if (n < 0)
			return 0;
		return n + sum(n-1);
	}
	
	public static void main(String[] args) {
		SumOfNumbers sum = new SumOfNumbers();
		System.out.println(sum.sum(10));
	}
}