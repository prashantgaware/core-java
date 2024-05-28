package com.cf.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArraList {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println(l1);
		l1.add(2, 90);
		System.out.println(l1);
	}

}
