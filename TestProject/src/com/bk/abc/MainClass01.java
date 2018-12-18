package com.bk.abc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String args[]) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection = DriverManager.getConnections("jgdbc:mysql://localhost:3306/bmtrainingsql1","root","sbadmin");
			
			Properties connectionProperties = new Properties();
			connectionProperties.setProperty("user", "adminuser");
			connectionProperties.setProperty("password", "adminuser");
			connectionProperties.setProperty("useSSL", "false");
			connectionProperties.setProperty("useLegacyDatetimeCode", "false");
			connectionProperties.setProperty("serverTimezone", "UTC");
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", connectionProperties);
			
			//Statement statement = connection.createStatement();
			//ResultSet resultSet = statement.executeQuery("select * from book");
			
			PreparedStatement preparedStatement = connection.prepareStatement("select * from students where rol_no=?");
			preparedStatement.setInt(1, 101);
			ResultSet resultSet=preparedStatement.executeQuery();
			
//			statement.execute("");
//			statement.executeUpdate("");
			
			Scanner targetScanner = new Scanner( System.in );
		    //String targetFilePath = targetScanner.nextLine();
		    String targetFilePath = "/home/adminuser/Documents/stu.csv";
			File targetFile = new File(targetFilePath);	
			
			try {
				FileWriter fileWriter = new FileWriter(targetFilePath);
				System.out.println(resultSet);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6));
			}
			ResultSetMetaData rsmd = resultSet.getMetaData();
			
			connection.close();
		} catch(SQLException sqle) {
			System.out.println("SQLException: "+sqle);
		} catch (ClassNotFoundException cnfe) {
			System.out.println("ClassNotFoundException: "+cnfe);
		}
	}
}
