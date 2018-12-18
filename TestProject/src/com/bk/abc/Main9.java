package com.bk.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main9 {
	public static void main(String[] args) {
		File f = new File("/home/adminuser/Documents/me.txt");
		
		if(f.exists()) {
			System.out.println("File is there.");
		} else {
			System.out.println("File absent.");
		}
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
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
		
	}
}
 