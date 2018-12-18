package com.bk.abc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main7 {
	public static void main(String args[]) {
		
		String s = "2018-12-04";
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    
	    System.out.println("Insert Date: ");
	    Scanner scanner = new Scanner( System.in );
	    String input = scanner.nextLine();
		
		try {
			Date d = df.parse(input);
			System.out.println(d);
			System.out.println("Input Format: ");
			String inputFormat = scanner.nextLine();
			
			System.out.println(new SimpleDateFormat(inputFormat).format(d));
		}
		catch(ParseException pe) {
			System.out.println("Date parse Exception: "+pe);
		}
	}
}
