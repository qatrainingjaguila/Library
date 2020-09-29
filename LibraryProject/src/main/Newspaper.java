package main;

import java.util.Date;

public class Newspaper extends LibraryItem{
	
	private String editor;

	public Newspaper(int isbn, String title, String author, String editor) {
		super(isbn, title, author);
		this.editor = editor;
	}

}
