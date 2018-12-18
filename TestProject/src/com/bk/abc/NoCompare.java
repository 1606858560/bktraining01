package com.bk.abc;

import java.util.Comparator;

public class NoCompare implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		if (o1.getNo() > o2.getNo()) {
			return 1;
		} else if(o1.getNo() < o2.getNo()) {
			return -1;
		} else {
		return 0;
		}
	}

}