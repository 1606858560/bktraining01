package com.bk.abc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MainClass02 {
	public static ComboPooledDataSource getDataSource() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/college");
		cpds.setUser("root");
		cpds.setPassword("");
		
		cpds.setMinPoolSize(5);
		cpds.setAcquireIncrement(1);
		cpds.setMaxPoolSize(10);
		cpds.setMaxIdleTime(1000);
		
		return cpds;
		
	}
	public static void main(String args[]) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			ComboPooledDataSource ds = MainClass02.getDataSource();
			connection= ds.getConnection();
			String selectQuery = "select * from students";
			pstmt =  connection.prepareStatement(selectQuery);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			Thread.sleep(15000);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("This is the exception " +e);
		}						
	}
}
