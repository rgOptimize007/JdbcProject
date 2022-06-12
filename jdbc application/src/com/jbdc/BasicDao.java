package com.jbdc;

import java.util.Scanner;

public class BasicDao {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll no: ");
		int rollNo = sc.nextInt();
		JdbcConnection jdbcObj = new JdbcConnection();
		Student std = jdbcObj.getConnection(rollNo);
		System.out.println(std);
		sc.close();

	}

}
