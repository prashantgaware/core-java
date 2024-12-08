package java8.default_methods;

public class DefaultClassOne implements InterfaceOne {

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
	
}
