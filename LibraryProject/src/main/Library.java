package main;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.HashMap;

public class Library {
	
	private Map<Integer,LibraryItem> libraryItems;
	private Map<Integer,Person> members;	
	
	public void addItem(LibraryItem item) { 
		
		this.getAllItems().put(item.getITEM_ID(),item);
	}
	
	public void addMember(Person person) {
		this.getAllMembers().put(person.getMEMBER_ID(),person);
	}
	
	public void removeItemByID(int ID) {
		libraryItems.remove(ID);
	}
	
	public void removeMemberByID(int ID) {
		members.remove(ID);
	}
	
	public void update(Scanner input, int id) {
		if (libraryItems.containsKey(id)) {
			libraryItems.get(id).update(input);
		}
		else {
			System.out.println("ID not found");
		}
	}
	
	public void updatePerson(int id, Scanner input) {
		if (members.containsKey(id)) {
			members.get(id).update(input);
		}
		else {
			System.out.println("ID not found");
		}
	}
	
	public void outputAllItems() {
		for (Entry<Integer,LibraryItem> record: libraryItems.entrySet()) {
			System.out.print("ID: " + record.getKey());
			System.out.print(" " + record.getValue().getTitle());
			System.out.print(" " + record.getValue().getAuthor());
			System.out.println(" ISBN: " + record.getValue().getISBN());
		}
	}
	
	public void outputAllMembers() {
		for (Entry<Integer,Person> person: members.entrySet()) {
			System.out.print("ID: " + person.getKey());
			System.out.print(" " + person.getValue().getFirstName());
			System.out.println(" " + person.getValue().getLastName());
		}
	}
	
	public void checkout(int itemID,int memberID) {
		
		if ((this.getAllItems().containsKey(itemID)) && (this.getAllMembers().containsKey(memberID))){
			
			this.getAllMembers().get(memberID).getCheckedOutItems().getAllItems().put(itemID,this.getAllItems().get(itemID));
			
			this.getAllItems().remove(itemID);
		}
		
	}
	
	public void checkInItem(int itemID,int memberID) {
		
		if ((this.getAllMembers().containsKey(memberID))){ //If MemberID exists in Members check items
		
		if (this.getAllMembers().get(memberID).getCheckedOutItems().getAllItems().containsKey(itemID)){ //if members checked out items contains item ID
			
			this.getAllItems().put(itemID,this.getAllMembers().get(memberID).getCheckedOutItems().getAllItems().get(itemID));
			
			this.getAllMembers().get(memberID).getCheckedOutItems().getAllItems().remove(itemID);
		}
		}
	}
	

	public Library() {
		
		this.libraryItems = new HashMap<>();
		this.members = new HashMap<>();
	}
	
	public Map<Integer,LibraryItem> getAllItems() {
		return libraryItems;
	}
	
	public Map<Integer,Person> getAllMembers() {
		return members;
	}
}
