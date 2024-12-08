package java8.static_methods;

public class ClassBTest {
	
	public static void main(String[] args) {
		ClassB ca = new ClassB();
		ca.getName();
		
		// Here, we wont be able to access static method, bcos static doesn't 
		// belong to class instance/object.
//		ca.printNames();
		
		// We will be able to access static methods with interface reference.
		// In this scenario, we wont be getting any error like default methods
		// bcos static methods gets invoked with their interface references
		
		InterfaceA.printNames();
		InterfaceB.printNames();
	}
	
}
