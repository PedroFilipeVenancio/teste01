package pt.com.everis.academia.java.Second;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest implements Comparable<ComparableTest>{

	private Integer id;

	public ComparableTest(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ComparableTest [id=" + id + "]";
	}
	

	
	@Override
	public int compareTo(ComparableTest o1) {
		return id.compareTo(o1.getId());
		
	}
	
	public static void main(String[] args) {
		ComparableTest[] array = new ComparableTest[5];
		array[0] = new ComparableTest(1);
		array[1] = new ComparableTest(3);
		array[2] = new ComparableTest(5);
		array[3] = new ComparableTest(2);
		array[4] = new ComparableTest(4);
			
		Arrays.sort(array);	
		System.out.println(Arrays.toString(array));
			
	}
}
