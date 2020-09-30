package main;

import java.util.Date;
import java.util.Scanner;

public class Newspaper extends LibraryItem{
	
	private String editor;

	public Newspaper(int isbn, String title, String author, String editor) {
		super(isbn, title, author);
		this.setEditor(editor);
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
				
		
		System.out.println("Please enter a new editor, or x followed by enter to skip");
		String editor = input.nextLine();
		if (editor.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setEditor(editor);
		}
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

}
