package com.utils.ConexionDB;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQL {

	private String driver;
	private String url;
	private String username;
	private String password;

	private Connection connection = null;

	public MySQL() throws IOException {
		//TODO: reemplazar por datos de nuestra base
		//TODO: traer datos desde properties
		  this.driver = "com.mysql.jdbc.Driver"; 
		  this.url = "jdbc:mysql://localhost/testdb"; 
		  this.username = "root"; 
		  this.password = "1234";
		 
		Properties p = new Properties();
		//InputStream in = testMySQLConn.class.getClassLoader().getResourceAsStream("db.properties");
		//p.load(in);
		//this.url = p.getProperty("db.url");
		//this.username = p.getProperty("db.user");
		//this.password = p.getProperty("db.password");
		//this.driver = p.getProperty("db.driver");
	}

	public Connection getConnection() {
		if (this.connection == null) {
			try {
				Class.forName(this.driver);

				this.connection = DriverManager.getConnection(this.url, this.username, this.password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return this.connection;
	}

	public void closeConnection() {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
