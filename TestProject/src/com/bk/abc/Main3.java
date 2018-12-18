package com.bk.abc;

public class Main3 {
	public static void main(String args[]) {
	
		try {
//			int c=divideParent();
			divide();
			System.out.println("Main Method ");
		} 
		catch(ArithmeticException e) {
			System.out.println("Catch Block"+e);
		} 
		catch(Exception e2) {
			System.out.println("Main Method Catch Block not accessed: "+e2);
		}
		finally {
			System.out.println("Finally Block");
		}	
		
	}
	
	public static void divideParent() {
		divide();
	}
	
	public static int divide() throws ArithmeticException{
		int c=-1;
		try {
			int a=0;
			int b=10;
			throw new ArithmeticException("My message");
//			c=b/a;
//			System.out.println("Divide Method: "+c);
//			return c;
		}
		catch(Exception e) {
			System.out.println("Divide Method Catch Block "+e);
			return c;
		}
	}
}