package main;

public class LibraryItem {
	private final int ITEM_ID;
	private static int numberOfItems = 0;
	private String ISBN;
	private String Title;

	public LibraryItem(String isbn, String title) {
		super();
		this.ISBN = isbn;
		this.Title = title;
		this.ITEM_ID = numberOfItems;
		numberOfItems++;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getITEM_ID() {
		return ITEM_ID;
	}

}
	
