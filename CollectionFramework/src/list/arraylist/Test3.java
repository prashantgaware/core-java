package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

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
//		System.out.println(al2.get(2));
//		System.out.println(al2.get(7));
		System.out.println();
		
	
		int index = al2.indexOf(new A(1, 2));
		if(index >= 0) {
			A a1 = (A) al2.get(index);
			a1.setX(a1.getX()+5);
			a1.setY(a1.getY()+5);
			System.out.println(al2);
		}
		

	}

}
