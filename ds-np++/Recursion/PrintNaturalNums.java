public class PrintNaturalNums {
	public void print(int n) {
		if (n <= 0) {
			return;
		} else {
			System.out.println(n + " ");
			print(n-1);
		}
	}
	
	public static void main(String[] args) {
		PrintNaturalNums pn = new PrintNaturalNums();
		pn.print(10);
	}
}