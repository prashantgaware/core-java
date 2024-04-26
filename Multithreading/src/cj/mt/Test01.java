package cj.mt;

public class Test01 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Run Method");
	}

	public static void main(String[] args) {
		
		Test01 test01 = new Test01();
		test01.start();
		
		System.out.println("Main Thread Executed.");
		
	}

}
