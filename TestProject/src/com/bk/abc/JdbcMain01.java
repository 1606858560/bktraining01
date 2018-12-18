package com.bk.abc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class JdbcMain01 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection = DriverManager.getConnections("jdbc:mysql://localhost:3306/bmtrainingsql1","root","sbadmin");
			
			Connection connection = null;
			
			Properties connectionProperties = new Properties();
			connectionProperties.setProperty("user", "adminuser");
			connectionProperties.setProperty("password", "adminuser");
			connectionProperties.setProperty("useSSL", "false");
			connectionProperties.setProperty("useLegacyDatetimeCode", "false");
			connectionProperties.setProperty("serverTimezone", "UTC");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", connectionProperties);
			
			String students = "select * from students";
			PreparedStatement ps = connection.prepareStatement(students);
			ResultSet rs = ps.executeQuery();
			
			ArrayList<String> list = new ArrayList<String>();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
				String record = String.valueOf(rs.getInt(1))+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6);
				list.add(record);
			}

		        for (int i = 0; i < list.size(); i++) {
		            System.out.println(list.get(i));
		        }
		        // print the number of contacts
		        //System.out.println("Number of contact: " + list.size());
		        
		        Scanner targetScanner = new Scanner( System.in );
			    //String targetFilePath = targetScanner.nextLine();
			    String targetFilePath = "/home/adminuser/Documents/stu.csv";
				File targetFile = new File(targetFilePath);	
			
				try {
					FileWriter fileWriter = new FileWriter(targetFilePath);
					for (int i = 0; i < list.size(); i++) {
			            fileWriter.write(list.get(i)+"\n");
			        }
					fileWriter.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException sqle) {
			System.out.println("SQL Exception");
		}
		
	}
}
