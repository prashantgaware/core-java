package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		List<Object> al1 = new ArrayList<Object>();
		
		System.out.println(al1.size());
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(0, 0);
		al1.add(new A(4, 5));
		al1.add(2, new A(2, 4));
		System.out.println(al1);
		System.out.println();
		
		List<Object> al2 = new ArrayList<Object>();
		al2.addAll(al1);
		System.out.println(al2);
		al2.add(2, new A(1, 2));
		System.out.println(al2);
		System.out.println(al2.get(2));
		System.out.println(al2.get(7));
		System.out.println();
		
//		String s1 = al2.get(2);  => Error : 
		
//		Object obj = al2.get(3);
//		String str = (String)obj;    ClassCastException
		
		Object obj = al2.get(3);
		if(obj instanceof String) {
			String str = (String)obj;
			System.out.println(str);
		}		
		System.out.println();
		

	}

}
