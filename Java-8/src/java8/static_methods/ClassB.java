package java8.static_methods;

public class ClassB implements InterfaceA, InterfaceB {

	@Override
	public String getName() {
		System.out.println("ClassA.getName()");
		return "";
	}
	
}
