package cj.mt;

class MyThread extends Thread {
	
	@Override
	public void run() {
	    for (int i = 20; i >= 1; i--) {
	        System.out.print(i + " ");
	    }
	}
	
}

class Test2 {
	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		mt.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.print(i + " ");
		}
			
	}

}

