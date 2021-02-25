package library;

public abstract class Book {

	private int bookID;
	private String title;
	private String yearPublished;
	private String genre;
	public boolean inLibrary;
	
	// parent class of book
    public Book(String title, String yearPublished, String genre) {
    	this.title = title;
    	this.yearPublished = yearPublished;
    	this.genre = genre;
    }
  
    // getters and setters
    public String getTitle() {
    	return title;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    
    //////// fix this? //////////
    public String getYearPublished() {
    	return yearPublished;
    }
    
    public void setYearPublished(String newInfo) {
    	this.yearPublished = newInfo;
    }
    
    public String getGenre() {
    	return genre;
    }
    
    public void setGenre(String genre) {
    	this.genre = genre;
    }  
    
    public int getBookID() {
    	return bookID;
    }
    
    public void setBookID(int BookID) {
    	this.bookID = BookID;
    }
    // inLibrary true/false
}
