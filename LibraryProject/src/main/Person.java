package main;

import java.util.Scanner;

public class Person {
	//checks out item
	//checks in item
	//means they need a data structure to store Library Items. Could use Library?
	private String firstName;
	private String lastName;
	private String address;
	private String postcode;
	private final int MEMBER_ID;
	private static int noOfMembers=0;
	private Library checkedOutItems;
	
	public Person(String firstName,String lastName,String address,String postcode) {
		this.MEMBER_ID = noOfMembers;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postcode = postcode;
		this.checkedOutItems = new Library();
		noOfMembers++;		
	}
	
	/*
	 * public boolean checkOutItem(Library library, Integer item_Id) { //NEEDS WORK
	 * 
	 * if (library.getAllItems().containsKey(item_Id)){
	 * 
	 * this.checkedOutItems.getAllItems().put(item_Id,library.getAllItems().get(
	 * item_Id));
	 * 
	 * library.getAllItems().remove(item_Id); } return true; }
	 * 
	 * public boolean checkInItem(Library library, Integer item_Id) { //NEEDS WORK
	 * 
	 * if (this.checkedOutItems.getAllItems().containsKey(item_Id)){
	 * 
	 * library.getAllItems().put(item_Id,this.checkedOutItems.getAllItems().get(
	 * item_Id));
	 * 
	 * this.checkedOutItems.getAllItems().remove(item_Id); } return true; }
	 */
	
	public void update(Scanner input) {
		
		System.out.println("Please enter a new firstName, or x followed by enter to skip");
		String firstName = input.nextLine();
		if (firstName.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setFirstName(firstName);
		}
		
		System.out.println("Please enter a new lastName, or x followed by enter to skip");
		String lastName = input.nextLine();
		if (lastName.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setLastName(lastName);
		}
		
		System.out.println("Please enter a new address, or x followed by enter to skip");
		String address = input.nextLine();
		if (address.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setAddress(address);
		}	
		
		System.out.println("Please enter a new postcode, or x followed by enter to skip");
		String postcode = input.nextLine();
		if (postcode.equalsIgnoreCase("x")) {
			System.out.println("Skipping..");;
		}
		else {
			this.setPostcode(postcode);
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public static int getNoOfMembers() {
		return noOfMembers;
	}

	public static void setNoOfMembers(int noOfMembers) {
		Person.noOfMembers = noOfMembers;
	}

	public int getMEMBER_ID() {
		return MEMBER_ID;
	}
	
	public Library getCheckedOutItems() {
		return this.checkedOutItems;
	}

	
}
