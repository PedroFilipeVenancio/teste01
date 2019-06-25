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
		
		Character c = new Character('f');
		System.out.println(c);
		
		Boolean b = new Boolean("true");
		System.out.println(b);
		
		Byte by = new Byte((byte) 1 );
		System.out.println(by);
		
		Long lo = new Long(43);
		System.out.println(lo);
		System.out.println(lo.longValue());
		System.out.println(lo.doubleValue());
		System.out.println(lo.intValue());
		System.out.println(lo.floatValue());
		
		Double d2 = new Double(3.14555);
		System.out.println(d2.floatValue());
		
		Float f2 = new Float(3.4);
		System.out.println(f2.doubleValue());
		
		System.out.println(f2.compareTo((float) f2.doubleValue()));
		System.out.println(f2.getClass());
		System.out.println(f2.isNaN());

	}

}
