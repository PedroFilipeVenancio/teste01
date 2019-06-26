package pt.com.everis.academia.java.Second;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ok = new TreeSet<>();
		ok.add(100);
		ok.add(200);
		ok.add(300);
		ok.add(400);
		ok.add(500);
		System.out.println(ok.headSet(300));
		System.out.println(ok.tailSet(300));
		System.out.println(ok.subSet(200, 400));
		
		
		

	}

}
