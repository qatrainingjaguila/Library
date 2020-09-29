package main;

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

}
