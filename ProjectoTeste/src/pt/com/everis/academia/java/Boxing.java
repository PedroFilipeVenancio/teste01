package pt.com.everis.academia.java;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(125);
		
//		Integer j = new Integer(125);
		Integer j = i;
		System.out.println(i==j);
		i++;
		System.out.println(j);
		j++;
		System.out.println(i==j);
		System.out.println(i.equals(j));
		System.out.println(i);
		System.out.println(j);

	}

}
