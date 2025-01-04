class Demo {
	int count = 0;
	public void m1() {
		if (count == 10)
			return;
		else {
			System.out.println("Hello, everyone:  count:" + count);
			count++;
			m1();
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}
}