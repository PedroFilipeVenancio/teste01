package pt.com.everis.academia.java.Second;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(1));
		list.add(2);
		System.out.println(list.toString());
		
		List ok = new ArrayList();
		ok.add(1);
		ok.add("a");
		ok.add("b");
		ok.add(7);
		ok.add(8);
		ok.forEach(n -> System.out.println(n));
		System.out.println(ok);
		ok.removeIf(n -> (n instanceof String ));
		System.out.println(ok);

	}

}
