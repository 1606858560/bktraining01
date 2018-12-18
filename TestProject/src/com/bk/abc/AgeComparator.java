package com.bk.abc;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if (o1.getEmployeeAge() > o2.getEmployeeAge()) {
			return 1;
		} else if(o1.getEmployeeAge() < o2.getEmployeeAge()) {
			return -1;
		} else {
		return 0;
		}
	}

}
