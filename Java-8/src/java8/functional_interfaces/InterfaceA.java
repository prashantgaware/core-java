package java8.functional_interfaces;

@FunctionalInterface
public interface InterfaceA {
	void printName();
	
	default void myName() {
		System.out.println("InterfaceA.myName()");
	}
	
	static void yourName() {
		System.out.println("InterfaceA.yourName()");
	}
}
