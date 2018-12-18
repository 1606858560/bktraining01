package com.bk.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main10 {
	public static void main(String[] args) {
		
		System.out.println("Insert source file path:");
		Scanner sourceScanner = new Scanner( System.in );
	    String sourceFilePath = sourceScanner.nextLine();
	    File sourceFile = new File(sourceFilePath);
	    
	    if(sourceFile.exists()) {
			System.out.println("Source File is there.");
		} else {
			System.out.println("Source File is absent.");
		}
	    
	    System.out.println(" ");
		System.out.println("File Target: ");
		
	    Scanner targetScanner = new Scanner( System.in );
	    String targetFilePath = targetScanner.nextLine();
//		String targetFilePath = "/home/adminuser/Documents/sortedrecords.csv";
		File targetFile = new File(targetFilePath);	
		
		if(targetFile.exists()) {
			System.out.println("Target File is there.");
		} else {
			System.out.println("Target File is absent.");
		}
	    
		
		System.out.println(" ");
		Map<Integer, Students> nameMap = new HashMap<Integer, Students>();
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(sourceFile);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] lines = line.split(",");
				Students sts = new Students(Integer.parseInt(lines[0]), lines[1], lines[2], lines[3], lines[4]);
				nameMap.put(sts.getNo(), sts);
				System.out.println(line);
				
			}
			
		} catch(FileNotFoundException fnfe) {
			System.out.println(fnfe);
		} catch(IOException ioe) {
			System.out.println(ioe);
		} finally {
			try {
				fr.close();
				br.close();
			} catch(IOException ioe1) {
				
			}
			
		}
		
		Collection<Students> Students = nameMap.values();
		
		List list = new ArrayList(Students);
			
		
		System.out.println(" ");
		System.out.println("Compare By: ");
		System.out.println("1. Date of Birth");
		System.out.println("2. First Name");
		System.out.println("3. Roll Number");
		System.out.println(" ");
		System.out.println("Insert option:");

		
		Scanner optionScanner= new Scanner(System.in);
		int option = optionScanner.nextInt();
		
		if(option == 1) {
			Collections.sort(list,new StudentCompare());
		} else if(option == 2) {
			Collections.sort(list,new FirstCompare());
		} else if(option == 3) {
			Collections.sort(list,new NoCompare());
		} else {
			Collections.sort(list,new StudentCompare());
		}			
		
		System.out.println(" ");
		System.out.println("Collection Result: ");
		
		try (FileWriter fileWriter = new FileWriter(targetFilePath)){
			for (Iterator<Students> it = list.iterator(); it.hasNext();)
			{
				Students sts = (Students)it.next();
				System.out.println("Rol Number: "+sts.getNo());
				System.out.println("First Name: "+sts.getFirst());
				System.out.println("Last Name: "+sts.getLast());
				System.out.println("Email: "+sts.getEmail());
				System.out.println("Date of Birth: "+sts.getDob());
				
				fileWriter.write(sts.getNo() + ";"+sts.getFirst() + ";"+sts.getLast() + ";"+sts.getEmail() + ";"+sts.getDob()+"\n");
				fileWriter.flush();
			}
		} catch (Exception e){
			System.out.println(e);
		}

	}
}
  