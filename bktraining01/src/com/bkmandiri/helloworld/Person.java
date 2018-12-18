package com.bkmandiri.helloworld;

public class Person {		
	
	String name;
	String country;
	static int b=20;
	final int old=22;
	
	public Person() {
		System.out.println("Constructor called.");
	}
	
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
	void walk() {
		System.out.println("Person is walking");
	}
	
	void walk(String name) {
		System.out.println(name+"Person is walking");
	}
	
	void breathe() {
		System.out.println(this.name+" is breathing");
	} 
	
	String talk(String message, String massage) {
		return message;
	}
	
}
