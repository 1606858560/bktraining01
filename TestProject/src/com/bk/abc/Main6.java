package com.bk.abc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Date;

public class Main6 {
	public static void main(String args[]) {
		
		String s = "2018-12-04";
		DateFormat targetDf = null;
		
		System.out.println("Choose date format default is dd/MM/yyyy:");
		System.out.println("1. yyyy-MM-dd");
		System.out.println("2. dd-MM-yy");
		System.out.println("3. dd-MM-yyyy");
		
		Scanner optionScanner= new Scanner(System.in);
		
		int option = optionScanner.nextInt();
		
		if(option == 1) {
			targetDf = new SimpleDateFormat("yyyy-MM-dd");
		} else if(option == 2) {
			targetDf = new SimpleDateFormat("dd-MM-yy");
		} else if(option == 3) {
			targetDf = new SimpleDateFormat("dd-MM-yyyy");
		} else {
			targetDf = new SimpleDateFormat("dd/MM/yyyy");
		}

	    System.out.println("Insert Date: ");
	    Scanner scanner = new Scanner( System.in );
	    String input = scanner.nextLine();
	    
	    System.out.println("Target pattern ");
	    String input1 = scanner.nextLine();
		
		DateFormat tDF = null;
		try {
			tDF= new SimpleDateFormat(input1);
			Date d = targetDf.parse(input);
			System.out.println(tDF.format(d));	
		}
		catch(ParseException pe) {
			 Date d = new Date();
			 System.out.println(d.toString());
			//System.out.println("Date parse Exception: "+pe);
		}
	}
}
