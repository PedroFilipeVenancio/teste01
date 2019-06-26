package pt.com.everis.academia.java;

public class aexercicio {
	
	public static int X (int n) {
		int result = 1;
		for (int i = 2; i <= n; i++) {
			result *=i;
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num = 6;
		for (int i = 0; i < num; i++) {
			System.out.println(X(i));
		}
		
//		int valor = 1;
//		switch (valor) {
//		case 0:
//			System.out.println("haha");
//		case 1:
//			System.out.println("haha");
//		case 2:
//			System.out.println("wth ?");
//			
//
//		default:
//			System.out.println("hum...");
//			break;
//		}

	}

}
