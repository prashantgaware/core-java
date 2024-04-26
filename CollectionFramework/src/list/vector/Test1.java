package list.vector;

import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(0, null);
		System.out.println(v1);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.addAll(v1);
		v2.add(2, 10);
		System.out.println(v2);
		System.out.println(v2.capacity());
		System.out.println(v2.isEmpty());
		System.out.println(v2.removeAll(v1));
		System.out.println(v2);
		

	}

}
