package list.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorSortExample1 {

	public static void main(String[] args) {

		Vector<String> vec = new Vector<>();
		vec.add("White");
        vec.add("Green");
        vec.add("Black");
        vec.add("Orange");

        System.out.println("The vector elements are:");
        System.out.println();
        Enumeration<String> e = vec.elements();
        while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
        System.out.println();
        
        System.out.println("After Sort : ");
        System.out.println();
        Collections.sort(vec);
        Enumeration<String> e2 = vec.elements();
        while (e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
	}

}
