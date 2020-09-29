package main;

import java.util.Date;

public class Newspaper extends LibraryItem{
	
	private Date dateOfPaper;

	public Newspaper(String isbn, String title, String author, Date dateOfPaper) {
		super(isbn, title, author);
		this.dateOfPaper = dateOfPaper;
	}

}
