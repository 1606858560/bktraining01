package com.bk.abc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main2 {
	public static void main(String a[]) {
		
		//HashMap
		Map<Integer, String> nameMap = new HashMap<Integer, String>();
		nameMap.put(1, "Kalp");
		nameMap.put(2, "abc");
		
//		System.out.println("Insert Number: ");
//		Scanner anissa = new Scanner(System.in);
//		int i = anissa.nextInt();
//		System.out.println("Value is: "+nameMap.get(i));
//		System.out.println(" ");
		
		System.out.println("Result for HashMap:");
		
		Set<Integer> nameKeySet = nameMap.keySet();
		for(Integer nameKey: nameKeySet) {	
			System.out.println("ID is: "+nameKey+" and Value is: "+nameMap.get(nameKey));	
		}
		System.out.println("===");
		System.out.println(" ");
		
		
		//TreeMap
		Map<Integer, String> nameTreeMap = new TreeMap<Integer, String>();
		nameTreeMap.put(3, "Kalp");
		nameTreeMap.put(2, "abc");
		
		System.out.println("Result for TreeMap:");
		
		Set<Integer> nameKeySetTree = nameTreeMap.keySet();
		for(Integer nameKeyTree: nameKeySetTree) {
			System.out.println("ID is: "+nameKeyTree+" and Value is: "+nameTreeMap.get(nameKeyTree));
		}
		System.out.println("===");
		System.out.println(" ");
		
		//LikedHashMap
		Map<Integer, String> nameLinkedHashMap = new LinkedHashMap<Integer, String>();
		nameLinkedHashMap.put(3, "Kalp");
		nameLinkedHashMap.put(2, "abc");
		nameLinkedHashMap.put(1, "edw");
		
		System.out.println("Result for LinkedHashMap:");
		
		Set<Integer> nameKeySetLinkedHash = nameLinkedHashMap.keySet();
		for(Integer nameKeyLinkedHash: nameKeySetLinkedHash) {
			System.out.println("ID is: "+nameKeyLinkedHash+" and Value is: "+nameLinkedHashMap.get(nameKeyLinkedHash));
		}
		System.out.println("===");
		System.out.println(" ");
		
		//Student
		Student student = new Student("Anissa", "Jakarta", "Contoh", 1);
		Student student1 = new Student("Fariz","Jakarta","CS",2);
//		Student student4 = new Student("Ron","Jakarta","CS",4);
//		System.out.println(student);
		
		//Student Map
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

		studentMap.put(student.getRollno(), student);
		studentMap.put(student1.getRollno(), student1);
		studentMap.put(3, new Student("Adrian", "Jakarta", "Electronics", 3));
		studentMap.put(10, new Student("Kedak", "Jakarta", "Electronics", 10));
		
		Set<Integer> studentKey = studentMap.keySet();
		for(Integer sKey: studentKey) {
			System.out.println("ID is: "+sKey+" and Value is: "+studentMap.get(sKey));
		}

		System.out.println("Insert Roll Number: ");
		Scanner anissa = new Scanner(System.in);
		int i = anissa.nextInt();
		System.out.println("Value is: "+studentMap.get(i));
		System.out.println(" ");
	
		try {
			studentMap=null;
			studentMap.get(1);
		}
		catch(Exception e) {
			System.out.println("Failed");
		}
	}
	
	
}
