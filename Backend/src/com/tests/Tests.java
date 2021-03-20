package com.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class Tests {


	@Test
	public void testQuery() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/aerolineas?" + "user=root&password=1234");
		String query = "SELECT * FROM aerolineas.cliente";
		String query2 ="SELECT * FROM sakila.actor";
		PreparedStatement p = conn.prepareStatement(query2);
		ResultSet resultSet;
		List<Object> paramList = new ArrayList<Object>();
/*
		paramList.add("Germany");
		p.setString(1, paramList.get(0).toString());
*/
		System.out.println("ejecutando query: " + p);
		resultSet = p.executeQuery();
		ResultSetMetaData rsmd = resultSet.getMetaData();
		
		int columnsNumber = rsmd.getColumnCount();
		while (resultSet.next()) {
			for (int i = 1; i <= columnsNumber; i++) {
				if (i > 1)
					System.out.print("");
				String columnValue = resultSet.getString(i);
				System.out.print("Columna: " + rsmd.getColumnName(i) + " Valor: " + columnValue + "\n");
				// System.out.println(columnValue+"\n");

			}
			System.out.println("\n");
		}
	}

}
