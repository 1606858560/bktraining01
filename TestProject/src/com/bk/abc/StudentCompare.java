package com.bk.abc;

import java.util.Comparator;

public class StudentCompare implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.getDob().compareTo(o2.getDob());
	}

}