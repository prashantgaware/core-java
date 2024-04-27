package list.vector;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		
		List<Integer> v1 = new Vector<Integer>();
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(0, 5);
		System.out.println(v1);
		
		List<Integer> v2 = new Vector<Integer>();
		v2.addAll(v1);
		v2.add(2, 10);
		System.out.println(v2);
		System.out.println(((Vector<Integer>) v2).capacity());
		System.out.println(v2.isEmpty());
		//System.out.println(v2.retainAll(v1));
		System.out.println(v2);
		System.out.println(v2.indexOf(v2));
		//System.out.println(v2.listIterator());
		
		System.out.println(v1.size());
		System.out.println(v2.size());
		v1.clear();
		System.out.println(v1.size());
		
		Object[] obj = v2.toArray();
		System.out.println(Arrays.toString(obj));
		

		List<Integer> v3 = new Vector<Integer>();
		
		
	}

}
