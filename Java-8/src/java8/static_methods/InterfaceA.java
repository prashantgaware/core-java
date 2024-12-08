package java8.static_methods;

public interface InterfaceA {
	
	String getName();
	
	static void printNames() {
		System.out.println("InterfaceA.printNames()");
	}

}
