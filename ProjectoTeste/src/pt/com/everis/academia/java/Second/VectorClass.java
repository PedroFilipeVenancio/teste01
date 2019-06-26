package pt.com.everis.academia.java.Second;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector ok = new Vector(3,10);
		ok.add("1");
		ok.add("1");
		ok.add("1");
		ok.add("1");
		
		System.out.println(ok.capacity());
		ok.clear();
		System.out.println(ok.capacity());
		ok.trimToSize();
		System.out.println(ok.capacity());
		ok.add("345");
		System.out.println(ok.capacity());

	}

}
