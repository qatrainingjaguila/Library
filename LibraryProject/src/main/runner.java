package main;

import java.util.Scanner;

public class runner {
	
	public static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		Library library1 = new Library();
		//create new library
		
		Book book1 = new Book(0001,"Harry Potter","JK Rowling",1997);
		Map map1 = new Map(00003,"Europe","Chris Columbus","A map of Europe");
		Newspaper news1 = new Newspaper(197628374, "The SUN", "Katie Hopkins", "Piers Morgan");
		Book book2 = new Book(0001,"Harry Potter 2","JK Rowling",1997);
		Book book3 = new Book(0001,"Harry Potter 3","JK Rowling",1997);
		Book book4 = new Book(0001,"Harry Potter 4","JK Rowling",1997);
		//create new library items
		
		library1.addItem(book1);
		library1.addItem(map1);
		library1.addItem(news1);
		library1.addItem(book2);
		library1.addItem(book3);
		library1.addItem(book4);
		//add item
		
		System.out.println("Library Items:");
		library1.outputAllItems();
		//output all items
		
		library1.removeItemByID(1);
		//remove item
		
		System.out.println("Library Items post removal:");
		library1.outputAllItems();
		//output all items
		
		library1.update(input, 0);
		//update item
		
		System.out.println("Library Items:");
		library1.outputAllItems();
		//output all items
		
		
		Person person1 = new Person("John", "Smith", "The Mall", "SW1 1AA");
		Person person2 = new Person("Adam", "Smith", "The Mall", "SW1 1AA");
		//create person
		
		library1.addMember(person1);
		library1.addMember(person2);
		//register person
		
		library1.removeMemberByID(1);
		//delete person
		
		library1.updatePerson(0, input);
		//update person
		
		System.out.println("");
		library1.checkout(0, 0);
		//checkout item
		System.out.println("");
		
		System.out.println("Library Items:");
		library1.outputAllItems();
		//output all items
		
		System.out.println("Checked out Items:");
		person1.getCheckedOutItems().outputAllItems();
		//output checked out items
		
		
		library1.checkInItem(0, 0);
		//check in item
		
		System.out.println("Library Items post check in:");
		library1.outputAllItems();
		//output all items
		
		System.out.println("Checked out Items post check in:");
		person1.getCheckedOutItems().outputAllItems();
		//output checked out items	
		
		input.close();
	}
/*
 * Create a library system with functionality to manage items and people within
 *  * the library. 
 *  
 *  Rules: - At least one Abstract Class must be implemented. 
 * - Each item should have at least 1 additional attribute unique to itself. 
 * - Use of polymorphism and inheritance
 * - Correct usage of access modifiers - Naming conventions adhered to
 * - Commenting only where necessary. At least 3 of the
 * following items: 
 * - Books - Maps - Government documents - Media resources
 * (Camera etc.) - Newspapers - Journals - Magazines - Dissertations - Theses
 * 
 * 
 * ALL of the following: - Check out item - Check in item - Add item - Remove
 * item - Update item - Register person - Delete person - Update person
 * 
 * Implement an ID system in your Item class, utilizing a static integer
 * variable. }
 */
}
