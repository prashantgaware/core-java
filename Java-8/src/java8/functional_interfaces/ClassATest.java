package java8.functional_interfaces;

public class ClassATest {
	public static void main(String[] args) {
		FunctionalClassA ca = new FunctionalClassA();
		ca.printName();
		
//		OR
		
//		FunctionalInterface
//		Here, we have directly given the implementation of 
//		printName() instead of giving it in implemented class
		InterfaceA ia = () -> {
			System.out.println("ClassATest.main() : A");
		};
		ia.printName();
		
		InterfaceA ab = () -> {
			System.out.println("ClassATest.main() : B ");
		};
		ab.printName();
		
	}
}
