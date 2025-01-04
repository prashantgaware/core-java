public class PrintNaturalNumsOneToN {
	public void print(int n) {
		if (n <= 0) {
			return;
		} else {
			print(n-1);
			System.out.println(n + " ");
		}
	}
	
	public static void main(String[] args) {
		PrintNaturalNumsOneToN pn = new PrintNaturalNumsOneToN();
		pn.print(10);
	}
}