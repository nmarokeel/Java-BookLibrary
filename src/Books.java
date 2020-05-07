//Naramsin Marokeel, CIS340, 3pm, A7
import java.util.ArrayList;

public class Books {
	
	//Variables used across methods
	private String bookName;
	private int year;
	private int count;
	private ArrayList<Library> bookList;
	
	//Default constructor
	public Books() {
		bookList = new ArrayList<>();
	}
	
	//add method to add the temporary books to the array list
	public Library add() {
		Library tmpBook= new Library();
		bookList.add(tmpBook);
		count++;
		return tmpBook;
	}
	
	//Add method to add the books from the library class ot the booklist
	public void add(Library library) {
		bookList.add(library);
	}
	
	//ArrayList for the books in the library
	public ArrayList<Library> getBookList(){
		return bookList;
	}

	//GETTER for bookName
	public String getBookName(){
	return bookName;
	}
	
	
	//GETTER for book count
	public int getCount(){
	return count;
	}
	
	//GETTER for year
	public int getYear(){
	return year;
	}
	
	//Print booklist method
	public void printRoster() {
		System.out.printf("\n%-45s %-45d",getBookName(),getYear());
	}
	
	//SETTER for bookName
	public void setBookName(String bookName){
	this.bookName = bookName;
	}

	//SETTER for book count
	public void setCount(int count){
	this.count = count;
	}
	
	//SETTER for year that changes book years greater than 2019 to 1990
	public void setYear( int year){
		if(year >2019) {
			this.year = 1990;
		}
		else {
			this.year = year;
		}
		System.out.printf("Title '%s' added to the library",bookName);
	}	
}

