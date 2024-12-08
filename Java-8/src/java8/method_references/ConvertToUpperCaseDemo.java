package java8.method_references;

public class ConvertToUpperCaseDemo {

	public static void main(String[] args) {
//		Lambda expression
		IConvert convertOne = (val) -> {
			System.out.println("Lambda Expression");
			return val.toUpperCase();
		};
		System.out.println(convertOne.convertToUpperCase("Java 8 Learning"));
		
//		Methods reference
		System.out.println("Methods reference");
		IConvert convertTwo = String :: toUpperCase;
		System.out.println(convertTwo.convertToUpperCase("Java 8 Learning"));
	}
	
}
