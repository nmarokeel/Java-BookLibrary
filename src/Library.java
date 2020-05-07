//Naramsin Marokeel, CIS340, 3pm, A7

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	//Creating variables to be used in the program for methods
	Scanner scanner = new Scanner(System.in);
	private ArrayList<Books> bookList = new ArrayList<>();
	private Books myBooks;
	
	//Default Constructor
	public Library() {
	}
	

	//Method to add books for the Library
	public void addBooks(){
	Books tmpBook = new Books();
	System.out.print("\nEnter book name: ");
	tmpBook.setBookName(scanner.nextLine());
	System.out.print("Enter Book year: ");
	tmpBook.setYear(Integer.parseInt(scanner.nextLine()));
	
	bookList.add(tmpBook);

	}
	
	//Displaying the bookList
	public void displayBooks() {
		for(Books s : bookList)
			s.printRoster();
		}
	
	//Method for header display
	private void displayHeader(){
		System.out.println("\t\t\tNew Library System\t\t\t");
	}
	
	//Method to load the library and display the book list
	public void loadLibrary() {
		displayHeader();
		System.out.print("\nHow many new books do you want to add to the Library: ");
		int count = Integer.parseInt(scanner.nextLine());
		for(int i = 0; i<count;i++) {
			addBooks();
			myBooks = new Books();
		}
		System.out.print("\n\nBooks added. Press enter to continue\n");
		scanner.nextLine();
		displayHeader();
		System.out.println();
		System.out.printf("%-46s%-47s","Title","Year");
		displayBooks();
		
		//Closing scanner
			scanner.close();
	}

	public static void main(String[] args) {
		
		Library myLibrary = new Library();
		myLibrary.loadLibrary();
	}
	

}
