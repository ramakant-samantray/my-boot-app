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
<<<<<<< HEAD
		System.out.println("ramakant is addin file");
=======
		System.out.println("one more guy did it");
>>>>>>> 655c1ed8797ace1228c70ef9ba47256ee5a04dc3
	}

}
