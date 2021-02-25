package library;

public class Journal extends Book{
	
	private String author;
	
	public Journal(String title, String string,  String genre, String author) {
		super(title, string, genre);
		this.setAuthor(author);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Journal [author = " + author + ", Title = " + getTitle() + ", YearPublished = " + getYearPublished()
				+ ", Genre = " + getGenre() + ", ID = " + getBookID() + "]";
	}
}
