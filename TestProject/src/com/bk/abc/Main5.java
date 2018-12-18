package com.bk.abc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main5 {
	public static void main(String args[]) {
		
		String s = "2018-12-04";
		DateFormat df = new SimpleDateFormat("yy-MM-dd");
		DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat df2 = new SimpleDateFormat("dd-MM-yy");
		DateFormat df3 = new SimpleDateFormat("dd-MM-yyyy");
	    
	    System.out.println("Insert Date: ");
	    Scanner scanner = new Scanner( System.in );
	    String input = scanner.nextLine();
		
		
		try {
			Date d = df.parse(input);
			System.out.println(df1.format(d));
		}
		catch(ParseException pe) {
			System.out.println("Date parse Exception: "+pe);
		}
	}
}
