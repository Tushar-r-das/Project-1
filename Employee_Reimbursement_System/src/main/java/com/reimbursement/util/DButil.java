package com.reimbursement.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DButil {

	public static  Connection getConnection()  throws Exception{
		
		FileInputStream fileStream = new FileInputStream("database.properties"); 
		Properties properties = new Properties(); 
		properties.load(fileStream);
		String url = properties.getProperty("url");	
		String id = properties.getProperty("id"); 
		String pwd = properties.getProperty("pwd"); 
	    Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/revaturefsd1","root","Tushardas@2311"); 
 
	    return con;
}
}

