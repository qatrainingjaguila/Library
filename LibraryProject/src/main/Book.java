package main;

public class Book extends LibraryItem{
	private int year;
	
	public Book(int isbn, String title, String author,int year) {
		super(isbn, title, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
