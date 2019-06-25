package pt.com.everis.academia.java;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comparacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pai o1 = new Pai();
		Filho o2 = new Filho();
		
		System.out.println(o1 instanceof Pai);
		
		System.out.println(o1 instanceof Filho);
		
		System.out.println(o1 instanceof Interface);
		
		System.out.println(o2 instanceof Pai);
		
		System.out.println(o2 instanceof Filho);
		
		System.out.println(o2 instanceof Interface);
		
		List<String> ok= new ArrayList<String>();
		ok.add("ok1");
		ok.add("ok2");
		ok.add("ok");
		
		ok.forEach((ele) -> {
			System.out.println(ok);
		});
		

	}

}
