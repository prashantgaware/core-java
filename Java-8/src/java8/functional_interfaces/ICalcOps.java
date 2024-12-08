package java8.functional_interfaces;

@FunctionalInterface
public interface ICalcOps {
	
	double calculator(int a, int b);
	
	default void printCalc() {
		System.out.println("ICalcOps.printCalc()");
	}
	
	static void typeOfOps() {
		System.out.println("ICalcOps.typeOfOps()");
	}
	
}
