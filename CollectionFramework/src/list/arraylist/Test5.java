package list.arraylist;

import java.util.ArrayList;

// Insert

import java.util.List;

public class Test5 {

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
		al1.add(null);
		
		System.out.println(al1);
		System.out.println();
		
		

	}

}
