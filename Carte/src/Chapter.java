
import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private Book book;
	private String name;
	private List<SubChapter> subChapters = new ArrayList<>();
	
	public Chapter() {
		
	}
	
	public Chapter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setBook(Book book) {
		this.book = book;
	}

	public List<SubChapter> getSubChapters() {
		return subChapters;
	}

	public void setSubChapters(List<SubChapter> subChapters) {
		this.subChapters = subChapters;
	}

	public void print() {
		
	}

	public int createSubChapter(String string) {
		SubChapter subChapterObj = new SubChapter(string);
		subChapters.add(subChapterObj);
		return subChapters.indexOf(subChapterObj);
	}
	
	public Book getBook() {
		return book;
	}

	public SubChapter getSubChapter(int indexSubChapterOneOne) {
		return subChapters.get(indexSubChapterOneOne);
	}
}
