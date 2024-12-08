package java8.default_methods;

public interface InterfaceOne {
	
	void printName();
	String getName();
	
	default void defaultMethodOne() {
		System.out.println("InterfaceOne.defaultMethodOne()");
	}
	
	default String defaultMethodTwo() {
		System.out.println("InterfaceOne.defaultMethodTwo()");
		return "";
	}

}
