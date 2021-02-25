package library;

import java.util.ArrayList;

public class Library {
	
	
	// BOOKS //
	
	private ArrayList<Book> library = new ArrayList<>();
	private int bookCount = 1;
	
	// add book
	public boolean aquireBook(Book book) {
		book.setBookID(bookCount++);
		//book.inLibrary = True;
		return this.library.add(book); 
	} 
	
	// remove book
	public boolean removeBook(Book book) { 
		return this.library.remove(book);
	} 
	
	// search for book name and remove
	public boolean removeByTitle(String title) {
		for (Book b : this.library) {
			if (b.getTitle() == title) {
				return this.removeBook(b);
			}
		}
		return false;
	}
	
	// update
	public boolean updateBook(int bookID, String toChange, String newInfo) {
		switch (toChange) {
		case "title": 
			for (Book b : this.library) {		
				if (b.getBookID() == bookID) {
					System.out.println("..." + b.getTitle() + " found, title changing to " + newInfo + "...");
					b.setTitle(newInfo);
					return true;
				}  else {
					return false;
				}
			}
		case "publicationDate":
			for (Book b : this.library) {		
				if (b.getBookID() == bookID) {
					System.out.println("..." + b.getTitle() + " found, published year changing from" + b.getYearPublished() + " to " + newInfo + "...");
					b.setYearPublished(newInfo);
					return true;
				} else {
					return false;
				}
			}
		case "genre":
			for (Book b : this.library) {		
				if (b.getBookID() == bookID) {
					System.out.println("..." + b.getTitle() + " found, genre changing from " + b.getGenre() + " to " + newInfo + "...");
					b.setGenre(newInfo);
					return true;
				} else {
					return false;
				}
			}
			/*
			 * case "author": for (Book b : this.library) { if (b.getBookID() == bookID) {
			 * System.out.println("............." + b.getTitle() +
			 * " found, author changing from " + b.getAuthor() + " to " + newInfo +
			 * "............."); b.setAuthor(newInfo); return true; } else { return false; }
			 * }
			 * 
			 * case "area": for (Book b : this.library) { if (b.getBookID() == bookID) {
			 * System.out.println("............." + b.getTitle() +
			 * " found, area changing from " + b.getArea() + " to " + newInfo +
			 * "............."); b.setArea(newInfo); return true; } else { return false; } }
			 * case "publisher": for (Book b : this.library) { if (b.getBookID() == bookID)
			 * { System.out.println("............." + b.getTitle() +
			 * " found, publisher changing from " + b.getPublisher() + " to " + newInfo +
			 * "............."); b.setPublisher(newInfo); return true; } else { return
			 * false; } }
			 */
			
			
	
			
		default:
			System.out.println("Please specify (ID of publication, element you want to change, replacement)");
			System.out.println("e.g (4, publicationDate, 2021) - this will change the book with ID 4's publication date to 2021.");
			System.out.println("elements you can change:  title | publicationDate | genre | area | author | publisher");
		
		}
		return false;

	}
	
	// print all books
	public void printBooks() { 
		System.out.println(this.library);
	}
	
	// print all with inLibrary == True
	public void printBooksInLibrary() { 
		for (int i = 0; i < Library.size(); i++) {
			Book indiv = Library.get(i);
			System.out.println(indiv.toString());
			//if (indiv.getInLibrary() == True) {
			//	System.out.println(indiv.toString());
			//}
		}
	}
	

	
	// PEOPLES //
	
	private ArrayList<Human> humanList = new ArrayList<>();
	private int humanCount = 1;
	
	// add book
	public boolean registerHuman(Human human) {
		human.setHumanID(humanCount++);
		//book.inLibrary = True;
		return this.humanList.add(human); 
	} 
	
	// remove book
	public boolean removeHuman(Human human) { 
		return this.humanList.remove(human);
	} 
	
	// search for human by ID and remove
	public boolean removeHumanByID(int humanID) {
		for (Human h : this.humanList) {
			if (h.getHumanID() == humanID) {
				return this.removeHuman(h);
			}
		}
		return false;
	}
	
	// print all books
	public void printHumanList() { 
		System.out.println(this.humanList);
	}
	// update
	public boolean updateHuman(int humanID, String toChange, String newInfo) {
		switch (toChange) {
		case "forename": 
			for (Human h : this.humanList) {		
				if (h.getHumanID() == humanID) {
					System.out.println("..." + h.getForename() + " " + h.getSurname() + " found, forename changing to " + newInfo + "...");
					h.setForename(newInfo);
					return true;
				}  else {
					return false;
				}
			}
		case "surname": 
			for (Human h : this.humanList) {		
				if (h.getHumanID() == humanID) {
					System.out.println("..." + h.getForename() + " " + h.getSurname() + " found, changing surname to " + newInfo + "...");
					h.setSurname(newInfo);
					return true;
				}  else {
					return false;
				}
			}
			
		case "contactNumber": 
			for (Human h : this.humanList) {		
				if (h.getHumanID() == humanID) {
					System.out.println("..." + h.getForename() + " " + h.getSurname() + " found, changing contact number to " + newInfo + "...");
					h.setContactNumber(newInfo);
					return true;
				}  else {
					return false;
				}
			}
			
		default:
			System.out.println("Please specify (ID of person, element to change, replacement element)");
			System.out.println("e.g (2, surname, Wallops) - this will change the person with ID 4's surname to Wallops.");
			System.out.println("elements you can change:  forename | surname | contactNumber");
		
		}
		return false;

	}
	
}
