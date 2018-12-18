package com.bk.abc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

	   public static void main(String args[]) {
	      // Takes a list o Employee objects
	      List<Employee> list = new ArrayList<Employee>();

	      list.add(new Employee("Shaggy", 3, 200));
	      list.add(new Employee("Lacy", 2, 300));
	      list.add(new Employee("Roger", 10, 500));
	      list.add(new Employee("Thomase", 4, 600));
	      list.add(new Employee("Tammyyaa", 1, 400));
	      //Collections.sort(list);   // Sorts the array list

	      for(Employee n: list)   // printing the sorted list of names
	         System.out.println(n);

//	      for(Employee a: list)   // printing the sorted list of names
//		         System.out.println(a.getEmployeeAge());
//	      
//	      for(Employee s: list)   // printing the sorted list of names
//		         System.out.println(s.getEmployeeSalary());
	      
	      // Sorts the array list using comparator
	      Collections.sort(list, new NameComparator());
	      System.out.println(" ");
	      
	      for(Employee n: list)   // printing the sorted list of names
		         System.out.println(n);
	      
	      Collections.sort(list, new AgeComparator());
	      System.out.println(" ");
	      
	      for(Employee n: list)   // printing the sorted list of names
		         System.out.println(n);
	      
	      Collections.sort(list, new SalaryComparator());
	      System.out.println(" ");
	      
	      for(Employee n: list)   // printing the sorted list of names
		         System.out.println(n);
	      
//	      for(Employee a: list)   // printing the sorted list of ages
//	         System.out.print(a.getEmployeeName() +" : "+ a.getEmployeeAge() +" : "+ a.getEmployeeSalary()+", ");
	   }
	}