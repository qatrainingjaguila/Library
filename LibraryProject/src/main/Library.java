package main;
import java.util.Map;
import java.util.HashMap;

public class Library {
	private Map<Integer,LibraryItem> libraryItems = new HashMap<>();
	
	public void addItem(LibraryItem item) { 
		
		this.getAllItems().put(item.getITEM_ID(),item);
	}
	
	public Map<Integer,LibraryItem> getAllItems() {
		return libraryItems;
	}
}
