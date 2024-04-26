package list.vector;

import java.util.Collections;
import java.util.Vector;

public class VectorSortExample2 {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(5);
        vec.add(2);
        vec.add(4);
        vec.add(3);
        
        System.out.println("Before Sort : ");
        System.out.println(vec);
        System.out.println("After Sort : ");
        Collections.sort(vec);
        System.out.println(vec);
	}

}
