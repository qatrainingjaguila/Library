package main;

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
	
	public Person(String firstName,String lastName,String address,String postcode) {
		this.MEMBER_ID = noOfMembers;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postcode = postcode;
		noOfMembers++;
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

	
}
