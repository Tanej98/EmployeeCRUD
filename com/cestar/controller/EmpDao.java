package com.cestar.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDao {
	public Connection getConnection() {
		
		Connection con = null;
		
		String url = "jdbc:mysql://localhost:3306/cestar_db";
		String user = "root";
		String pwd = "";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pwd);
			
			System.out.println("Connected");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
}
