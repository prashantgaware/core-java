package java8.default_methods;

public class DefaultClassTwo implements InterfaceOne, InterfaceTwo {

	@Override
	public void printName() {
		defaultMethodTwo();
		System.out.println("DefaultClass.printName()");
	}

	@Override
	public String getName() {
		defaultMethodOne();
		System.out.println("DefaultClass.getName()");
		return "";
	}

	// Here we will have to override the default methods as both InterfaceOne and InterfaceTwo
	// have default methods having same name.
	@Override
	public void defaultMethodOne() {
		InterfaceTwo.super.defaultMethodOne();
	}
	
}
