package library;

public class Map extends Book{
	
	private String area;
	
	public Map(String title, String yearPublished,  String genre, String area) {
		super(title, yearPublished, genre);
		this.setArea(area);
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Map [area = " + area + ", Title = " + getTitle() + ", YearPublished = " + getYearPublished()
				+ ", Genre = " + getGenre() + ", ID = " + getBookID() + "]";
	}
}
