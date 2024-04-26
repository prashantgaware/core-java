package list.vector;

import java.util.Enumeration;
import java.util.Vector;

class Address{
	
	String hNo;
	String city;
	String street;
	String phNo;
	
	public Address(String city, String street, String hNo, String phNo) {
		this.city = city;
		this.hNo = hNo;
		this.street = street;
		this.phNo = phNo;
	}
	
}

class Customer {
	String name;
	int age;
	Address address;
	
	public Customer(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String toString() {
		return (
				"Name: " +name+"\nAge: "+age+"\nHouse No: "+address.hNo+
				"\nStreet: "+address.street+"\nCity: "+address.city+"\nPhone No: "+address.phNo				
				);
	}
}

public class VectorSizeCapacityDemo {
	
	public static void main(String[] args) {
		
		Vector<Object> v1 = new Vector<Object>();
		int size = v1.size();
		System.out.println(size);
		System.out.println(v1.capacity());
		
		Customer c1 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c2 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c3 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c4 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c5 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c6 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c7 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c8 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		Customer c9 = new Customer("Edwin", 20, new Address("11", "WS", "London", "0987"));
		
		v1.add(c1);
		v1.add(c2);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		v1.add(c3);
		v1.add(c4);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		v1.add(c5);
		v1.add(c6);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		

		v1.add(c7);
		v1.add(c8);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		v1.add(c9);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		v1.add(c1);
		v1.add(c2);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		v1.add(c1);
		v1.add(c2);
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("Size : "+v1.size());
		System.out.println();
		
		Enumeration<Object> e = v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
			System.out.println();
		}
	}

}
