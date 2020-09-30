package main;

import java.util.Scanner;

public class Map extends LibraryItem{
	
	private String description;

	public Map(int isbn, String title, String author, String description) {
		super(isbn, title, author);
		this.description=description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public void update(Scanner input) {
		//TO DO
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
				
		
		System.out.println("Please enter a new description, or x followed by enter to skip");
		String description = input.nextLine();
		if (description.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setDescription(description);
		}
	}

}
