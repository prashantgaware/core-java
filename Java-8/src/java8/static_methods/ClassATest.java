package java8.static_methods;

public class ClassATest {
	
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		ca.getName();
		
		// Here, we wont be able to access static method, bcos static doesn't 
		// belong to class instance/object.
//		ca.printNames();
		
		// We will be able to access static methods with interface reference.
		InterfaceA.printNames();
	}
	
}
