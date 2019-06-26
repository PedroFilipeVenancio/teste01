package pt.com.everis.academia.java.Second;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
	private Integer id;

	public ComparatorTest(Integer id) {
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
		return "ComparatorTest [id=" + id + "]";
	}

	public static void main(String[] args) {
		ComparatorTest[] array = new ComparatorTest[5];
		array[0] = new ComparatorTest(1);
		array[1] = new ComparatorTest(3);
		array[2] = new ComparatorTest(5);
		array[3] = new ComparatorTest(2);
		array[4] = new ComparatorTest(4);

		Arrays.sort(array, new Comparator<ComparatorTest>() {
			@Override
			public int compare(ComparatorTest p1, ComparatorTest p2) {
				return p1.getId().compareTo(p2.getId());
			}
		});

		System.out.println(Arrays.toString(array));
	}

}
