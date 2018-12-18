package com.bkmandiri.helloworld;

public class Kalp extends Person {
		
	@Override 
	void walk() {
		
		System.out.println("Kalp is walking");
	}
	
	void walk(String name) {
		
		System.out.println(name+"Kalp is walking...");
	}
}
