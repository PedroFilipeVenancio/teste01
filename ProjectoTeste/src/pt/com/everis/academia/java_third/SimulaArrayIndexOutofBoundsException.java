package pt.com.everis.academia.java_third;

import java.util.ArrayList;
import java.util.List;

public class SimulaArrayIndexOutofBoundsException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		List<String> ok = new ArrayList<String>();
		
		ok.add("valor 1");
		ok.add("valor 2");
		ok.add("valor 3");
		ok.add("valor 4");
		ok.add("valor 5");
		
//		ok.get(-1);
		
		try {
			ok.get(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new NullPointerException();
		}
		
	}

}
