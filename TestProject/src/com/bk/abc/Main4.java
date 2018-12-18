package com.bk.abc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main4 {
	public static void main(String args[]) {
		
		String s = "2018-12-04";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat df1 = new SimpleDateFormat("yy-MM-dd");
		
		try {
			Date d = df.parse(s);
			System.out.println(df.format(d));
		}
		catch(ParseException pe) {
			System.out.println("Date parse Exception: "+pe);
		}
	}
}
