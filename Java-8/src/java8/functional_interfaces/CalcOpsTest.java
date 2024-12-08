package java8.functional_interfaces;

public class CalcOpsTest {

	public static void main(String[] args) {
		
		int a = 10, b = 15;
		ICalcOps addition = (int x, int y) -> {
			return a + b;
		};
		System.out.println(addition.calculator(a, b));
		
		ICalcOps subtraction = (int x, int y ) -> {
			return a-b;
		};
		System.out.println(subtraction.calculator(a, b));
		
		ICalcOps multiplication = (x, y) -> a*b;
		System.out.println(multiplication.calculator(a, b));
		
		ICalcOps division = (x, y) -> x/y;
		System.out.println(division.calculator(a, b));
	}
	
}

