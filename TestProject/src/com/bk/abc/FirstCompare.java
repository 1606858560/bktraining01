package com.bk.abc;

import java.util.Comparator;

public class FirstCompare implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.getFirst().compareTo(o2.getFirst());
	}

}