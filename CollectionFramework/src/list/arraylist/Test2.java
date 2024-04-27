package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

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
		System.out.println(al1.contains(new A(4, 5)));
		System.out.println(al1);
		System.out.println();
		
		List<Object> al2 = new ArrayList<Object>();
		al2.addAll(al1);
		System.out.println(al2);
		al2.add(2, new A(1, 2));
		al2.add(null);
		System.out.println(al2);
		System.out.println(al2.get(2));
		System.out.println(al2.get(7));
		System.out.println();
		
	
		//Search
		
		System.out.println(al1.contains(1));
		System.out.println();
		System.out.println(al1.contains(new A(2, 4)));
		System.out.println(al2.containsAll(al1));
		System.out.println(al2.contains(new A(1, 2)));
		System.out.println(al2.contains(new A(4,5)));
		System.out.println(al1.contains(null));
		System.out.println();
		
		System.out.println(al2.indexOf(2));
		System.out.println(al2.lastIndexOf(2));
		System.out.println(al2.indexOf(null));
		
		System.out.println(al1.lastIndexOf(new A(1,2)));
		
		
		

	}

}
