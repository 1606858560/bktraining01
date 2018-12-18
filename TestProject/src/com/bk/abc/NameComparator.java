package com.bk.abc;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o1.getEmployeeName().length() > o2.getEmployeeName().length()) {
			return 1;
		} else if(o1.getEmployeeName().length() < o2.getEmployeeName().length()) {
			return -1;
		} else {
			return 0;
		}
	}

}
