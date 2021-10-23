
public class Author {
	private String name;
	private Book book;
	
	public Author() {
		
	}
	
	public Author(String name) {
		this.name = name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}

	
	public String getName() {
		return name;
	}
	public Book getBook() {
		return book;
	}


	public void print() {
		
	}
}