package com.bkmandiri.helloworld;

public class Grading {
	int g1=98;
	
	public void Grade () {

		if (g1>95) {
			System.out.println("Passed A+");
		} else if (g1>85 && g1<=95) {
			System.out.println("Passed A");
		} else if (g1>80 && g1<=85) {
			System.out.println("Passed B+");
		}else if (g1>75 && g1<=80) {
			System.out.println("Passed B");
		}else if (g1>65 && g1<=55) {
			System.out.println("Passed C+");
		}else if (g1>55 && g1<=65) {
			System.out.println("Passed C");
		}else if (g1>40 && g1<=55) {
			System.out.println("Passed D");
		}else if (g1<40) {
			System.out.println("Fail");
		}
		
	}
}

