package com.bk.abc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.ListIterator;

public class MainClass {
	
	public static void main(String args[]) {
			
		MainClass mc = new MainClass();
		mc.toString();
		String a = "a";
		int num = 2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n = scanner.nextInt();
		List<Integer> numberList = new ArrayList<Integer>(n);
		
		System.out.println("Enter number one each line");
		for(int i=0; i<n; i++) {
			numberList.add(scanner.nextInt());
		}
		
		System.out.println("Numbers are");
		System.out.println(numberList);
		
		Set<String> s = new HashSet<>();
		TreeSet<String> ts = new TreeSet<>();
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		s.add("India"); 
        s.add("Australia"); 
        s.add("South Africa"); 
        
        ts.add("India"); 
        ts.add("Australia"); 
        ts.add("South Africa");
        
        lhs.add("India"); 
        lhs.add("Australia"); 
        lhs.add("South Africa");
        
        System.out.println(s);
        System.out.println(ts);
        System.out.println(lhs);
		
        for(String s1 : s) {
        	System.out.println(s1);
        }
        
		mc.findEvens(numberList);
		mc.findPrimes(numberList);
		mc.findDivided(numberList, num);
	}
	
	public void findEvens(List al1) {
		int number;
		for (int i = 0; i < al1.size(); i++) {
			if ((int) al1.get(i) % 2 == 0) {
				System.out.println("Even numbers are: "+al1.get(i));
			}
		}
	}
	
	public void findPrimes(List al2) {
		for (int i = 0; i < al2.size() - 1; i++) {
			if (isPrime((int)al2.get(i))) {
				System.out.println("Prime numbers are: "+al2.get(i));
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
			System.out.println("Result of divided by "+(int) num+" is "+(int)al3.get(i) / num);
             
		}
	}
}
