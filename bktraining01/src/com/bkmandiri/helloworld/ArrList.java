package com.bkmandiri.helloworld;

import java.util.*;

public class ArrList {

	public static void main(String args[]) {
		// create an array list

		ArrList arrl = new ArrList();
		
		ArrayList al = new ArrayList();
//      System.out.println("Initial size of al: " + al.size());

//		ArrayList<Integer> mylist = new ArrayList<Integer>();
//		while (sc.hasNextInt()) {
//		    int i = sc.nextInt();
//		    mylist.add(i);
//		}
		// add elements to the array list
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
//      al.add(1, "A2");
//      System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);

		arrl.findEvens(al);
		arrl.findPrimes(al);
		arrl.findDivided(al, 3);

		// Remove elements from the array list
//      al.remove("F");
//      al.remove(2);
//      System.out.println("Size of al after deletions: " + al.size());
//      System.out.println("Contents of al: " + al);
	}

	public void findEvens(List al1) {
		int number;
		for (int i = 0; i < al1.size(); i++) {
			if ((int) al1.get(i) % 2 == 0) {
				System.out.println(al1.get(i));
			}
		}
	}

	public void findPrimes(List al2) {
		

		for (int i = 0; i < al2.size() - 1; i++) {
			if (isPrime((int)al2.get(i))) {
				System.out.println(al2.get(i));
			}
		}
	}

	public static boolean isPrime(int x) {
		boolean itIs = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				itIs = false;
			}
		}
		return itIs;
	}

	public void findDivided(List al3, int num) {
		for (int i = 0; i < al3.size(); i++) {
			System.out.println((int)al3.get(i) / num);
			Scanner input=new Scanner(System.in);
			 String a =input.nextLine();
             
		}
	}
	
}
