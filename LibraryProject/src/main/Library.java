package main;
import java.util.Map;
import java.util.HashMap;

public class Library {
	
	private Map<Integer,LibraryItem> libraryItems;
	private Map<Integer,Person> members;
	
	public void addItem(LibraryItem item) { 
		
		this.getAllItems().put(item.getITEM_ID(),item);
	}
	
	public void removeItem(int ID) {
		System.out.println("Please enter a valid ITEM ID");
		libraryItems.remove(ID);
	}
	
	public Library() {
		
		this.libraryItems = new HashMap<>();
		this.members = new HashMap<>();
	}
	
	public Map<Integer,LibraryItem> getAllItems() {
		return libraryItems;
	}
}
