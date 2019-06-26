package pt.com.everis.academia.java;

import java.util.Arrays;

public class ArrayTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[3];
		System.out.println(array);
		
		array[0]=1;
		array[1]=2;
		array[2]=3;
		System.out.println(Arrays.toString(array));
		
		int[] sorter = new int[5];
		sorter[0] = 7;
		sorter[1] = 4;
		sorter[2] = 11;
		sorter[3] = 9;
		sorter[4] = 22;
		
		System.out.println(Arrays.toString(sorter));
		Arrays.sort(sorter);
		System.out.println(Arrays.toString(sorter));
		
		int[] novo = Arrays.copyOfRange(sorter, 1, 3);
		System.out.println(Arrays.toString(novo));
		

	}

}
