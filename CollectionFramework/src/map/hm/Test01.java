package map.hm;

import java.util.HashMap;

import list.arraylist.A;

public class Test01 {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();
		
		System.out.println(hm.put("a", 1));
		System.out.println(hm.put("a", 2));
		System.out.println(hm.put("b", 3));
		System.out.println(hm.put("c", 2));
		System.out.println(hm.putIfAbsent(new A(2,3), 4));
		System.out.println(hm.putIfAbsent(new A(2,3), 4));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm);
	}

}
