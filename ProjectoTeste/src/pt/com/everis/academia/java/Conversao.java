package pt.com.everis.academia.java;

public class Conversao {

	static long teste = 9999999999999999L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 3.1415;
		int mau = (int) teste;
		System.out.println(mau);
		
		float teste2 = 4.4f;
		double d = teste2;
		
		Integer i = new Integer("5");
		Integer i2 = new Integer(10);
		System.out.println(i + " e " +i2);
		
		Character c = new Character('1');
		System.out.println(c);
		
		Boolean b = new Boolean("true");
		System.out.println(b);

	}

}
