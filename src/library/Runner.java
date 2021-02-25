package library;

public class Runner {

	public static void main(String[] args) {
	
		// BOOKS //
		// create new instance of library
		Library library = new Library();
		
		// create a bunch of objects
		library.aquireBook(new Map("Yorkshire Dales", "2019", "map", "Yorkshire & Humber"));
		library.aquireBook(new Journal("The life of Captain Morgan", "1737", "travel", "Captain P. Eers Morgan"));
		library.aquireBook(new Newspaper("Jan-17", "2012", "news", "The Daily Woof"));
		library.aquireBook(new Newspaper("Oct-01", "2005", "news", "News of the Egg"));

    	// print list of everything in library
    	//library.printBooks();

    	// remove item from library
    	library.removeByTitle("Jan-17");
    	//library.printBooks();    	
    	
    	// update title
    	//library.updateBook(1, "title", "Forests of Yorkshire");
    	//library.printBooks();
    	
    	
    	// PEOPLE //		
		// create a bunch of objects
		library.registerHuman(new Human("Robert", "Bobertson", "442919"));
		library.registerHuman(new Human("Jimbob", "Brown", "7657658"));
		library.registerHuman(new Human("Umber", "Eller", "9890898"));
		library.registerHuman(new Human("Yel", "Ohsubmrine", "7657658"));
		

    	// print list of people
    	//library.printHumanList();
    	
    	// remove person
    	//library.removeHumanByID(4);
    	library.printHumanList();
    	
    	// update title
    	library.updateHuman(1, "surname", "Bobjim");
    	library.printHumanList();
    	
	}
}

//LIBRARY 
//Create a library system with functionality to manage items within the library. 


//EXPECTATIONS 
//Unit Tests Implemented. 
//-At least one Abstract Class must be implemented. 
//At least one Interface Class must be implemented. 
//-Each item should have at least 1 additional attributes unique to itself. 
//Method Overloading implemented. 
//-Method Overriding implemented. 
//Correct usage of access modifiers 
//Naming conventions adhered too 
//Commenting when appropriate. (Complex methods) 

//ITEMS  
//• -Maps 
//• -Newspapers 
//• -Journals 


//FUNCTIONS 
//All of the following: 
//• Check out item 
//• Check in item 
//• -Add item 
//• -Remove item 
//• -Update item 
//• -Register person 
//• -Delete person 
//• Update person 

//Implement an ID system in your library project, utilising a static integer variable. 



