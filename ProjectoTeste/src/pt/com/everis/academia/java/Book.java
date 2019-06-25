package pt.com.everis.academia.java;

public class Book {
//	public static String isbn = "isbn123";
	private String isbn;
	
	public Book(String isbn) {
		this.isbn = isbn;
	}
	
	
//	By me	
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println(getClass());
//		System.out.println(this);
//		System.out.println(obj);
//		if (this == obj) {
//			return true;
//		}
//		
//		if (obj == null) {
//			return false;
//		}
//		
//		if (getClass() != obj.getClass()) {
//			return false;
//		}
//		
//		Book other = (Book) obj;
//		
//		if (isbn == null) {
//			if (other.isbn != null) {
//				return false;
//			}
//		} else if (!isbn.equals(other.isbn)) {
//			return false;
//		}
//		return true;		
//	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}



	public static void main(String[] args) {
			
		Book book1 = new Book("isbn123");
		Book book2 = new Book("isbn123");
		
		System.out.println(book1.equals(book2));

	}

}
