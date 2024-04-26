package cj.mt;

class Test3 implements Runnable{
	
	@Override
	public void run() {
		for (int i = 20; i >= 1; i--) {
			System.out.println(i + ": Run() ");
		}
	}
	
	public static void main(String[] args) {
		
		Test3 t = new Test3();
//		t.run();
		
		Thread th = new Thread(t);
		th.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(i + ": Method() ");
		}
		
		
		
		//System.out.println("Main Thread");
			
	}

}

