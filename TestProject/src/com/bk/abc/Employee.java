package com.bk.abc;

import java.util.*;

class Employee {
   private String name;
   private int age;
   private int salary;
   Employee() {
   }

   Employee(String n, int a, int s) {
      name = n;
      age = a;
      salary = s;
   }

   public String getEmployeeName() {
      return name;
   }

   public int getEmployeeAge() {
      return age;
   }
   
   public int getEmployeeSalary() {
	      return salary;
	   }

@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
}

   // Overriding the compare method to sort the age 
//   public int compare(Employee n, Employee n1) {
//      return n.name - n1.name;
//   }
//   
//   public int compare(Employee a, Employee a1) {
//	      return a.age - a1.age;
//	   }
//   
//   public int compare(Employee s, Employee s1) {
//	      return s.salary - s1.salary;
//	   }
}

