package com.cestar.model;

public class EmpRunner {

	public static void main(String[] args) {
		Employee emp1 = new Employee(222, "Jackson", "646-111-2222", "Markham", "Jackson@gmail.com");
		
		System.out.println(emp1);
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
		    System.out.println("Error: MySQL JDBC driver not found.");
		}

	}

}
