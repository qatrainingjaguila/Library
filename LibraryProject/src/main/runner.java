package main;

public class runner {

	public static void main(String[] args) {
		
		Library library1 = new Library();
		//create new library
		
		Book book1 = new Book(0001,"Harry Potter","JK Rowling",1997);
		Map map1 = new Map(00003,"Europe","Chris Columbus","A map of Europe");
		Newspaper news1 = new Newspaper(197628374, "The SUN", "Katie Hopkins", "Piers Morgan");
		//create new library items
		
		library1.addItem(book1);
		library1.addItem(map1);
		library1.addItem(news1);
		//add item
		
		library1.removeItemByID(0);
		//remove item
		
		//library1.getItemByID(0);
		//update item
		
		Person person1 = new Person("John", "Smith", "The Mall", "SW1 1AA");
		library1.getAllMembers().put(person1.getMEMBER_ID(),person1);
		//create person
		
		library1.removeMemberByID(0);
		//delete person
		
		//update person
		
		//checkout item
		
		//checkin item

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
