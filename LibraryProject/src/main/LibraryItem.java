package main;

public abstract class LibraryItem {
	private final int ITEM_ID;
	private static int numberOfItems = 0;
	private int ISBN;
	private String title;
	private String author;


	public LibraryItem(int isbn, String title, String author) {
		super();
		this.author = author;
		this.ISBN = isbn;
		this.title = title;
		this.ITEM_ID = numberOfItems;
		numberOfItems++;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getITEM_ID() {
		return ITEM_ID;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
	
