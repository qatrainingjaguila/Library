package main;

import java.util.Scanner;

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
	
	@Override
	public void update(Scanner input) {
		
		
		System.out.println("Please enter a new isbn, or x followed by enter to skip");
		String isbn = input.nextLine();
		if (isbn.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			int result = Integer.parseInt(isbn);
			this.setISBN(result);
		}
		
		System.out.println("Please enter a new title, or x followed by enter to skip");
		String title = input.nextLine();
		if (title.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setTitle(title);
		}
		
		System.out.println("Please enter a new author, or x followed by enter to skip");
		String author = input.nextLine();
		if (author.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setAuthor(author);
		}
		
		
		
		System.out.println("Please enter a new year, or x followed by enter to skip");
		String year = input.nextLine();
		if (year.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			int result = Integer.parseInt(year);
			this.setYear(result);
		}
		
		
	}

}
