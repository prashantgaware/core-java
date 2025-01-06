public class PowerOfN {
	public int power(int a, int b) {
		if (b >= 1) {
			return a * power(a, b-1);
		} else
			return 1;
	}
	
	public static void main(String[] args) {
		PowerOfN p = new PowerOfN();
		System.out.println(p.power(3,3));
	}
}
