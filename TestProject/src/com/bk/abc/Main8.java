package com.bk.abc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main8 {
	public static void main(String args[]) {
		try {
			dateTest();
		} catch(ParseException pe) {
			System.out.println("a");
		}
	}
	
	public static void dateTest() throws ParseException {
		
		String ds = "2018-10-10";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.parse(ds);
	}
}
