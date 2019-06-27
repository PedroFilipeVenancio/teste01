package pt.com.everis.academia.java_third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SimulaFileNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader ok = null;
		
		try {
			ok = new BufferedReader(new FileReader("/temp/ok"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
