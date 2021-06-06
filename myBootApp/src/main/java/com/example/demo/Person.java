package com.example.demo;

public class Person {
	private String firstname;
	private String hobby;
	
	
	
	public Person(String firstname, String hobby) {
		super();
		this.firstname = firstname;
		this.hobby = hobby;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getHobby() {
		return hobby;
	}



	public void setHobby(String hobby) {
		this.hobby = hobby;
	}



	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", hobby=" + hobby + "]";
	}
	
	public void getMessage() {
		System.out.println("here stash is completed");
		System.out.println("example of conflicts");
		System.out.println("ramakant is addin file");
		System.out.println("one more guy did it");
		System.out.println("===========================================");
		System.out.println("other added in dev branch");
		//System.out.println("im other guy");
		//System.out.println("im ramakant");
		System.out.println("from ramakant");

	}

}
