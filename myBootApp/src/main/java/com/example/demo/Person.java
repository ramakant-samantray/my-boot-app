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
	
	

}
