package library;

public class Newspaper extends Book{
	
	private String publisher;
	
	public Newspaper(String title, String string, String genre, String publisher) {
		super(title, string, genre);
		this.setPublisher(publisher);
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Newspaper [publisher = " + publisher + ", Title = " + getTitle() + ", YearPublished = "
				+ getYearPublished() + ", Genre = " + getGenre() + ", ID = " + getBookID() + "]";
	}
}
