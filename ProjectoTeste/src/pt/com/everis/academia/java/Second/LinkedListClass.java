package pt.com.everis.academia.java.Second;

import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new LinkedList();
		list.add(1);
		list.add("A");
		list.add("B");
		
		System.out.println(list.contains("A"));
		System.out.println(list.size());
		list.remove("A");
		System.out.println(list.size());
		

	}

}
