package pt.com.everis.academia.java_third;

public class SimulaArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ok1 = 10;
		int ok2 = 0;

		
		try {
			System.out.println(ok1/ok2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("deu erro manel!");
			e.printStackTrace();
		}

	}

}
