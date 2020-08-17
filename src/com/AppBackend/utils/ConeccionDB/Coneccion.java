package com.AppBackend.utils.ConeccionDB;
import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Coneccion {
//test3
	public Connection getConnection() {
		
		try {
			Properties properties1 = new Properties();
			FileInputStream ingreso = new FileInputStream("src/util/coneccion.properties");	
		    properties1.load(ingreso);
			Class.forName(properties1.getProperty("db.driver"));
			Connection coneccion1 = DriverManager.getConnection(properties1.getProperty("db.url"),properties1.getProperty("db.user"),properties1.getProperty("db.password"));
	        	 
			if(!coneccion1.isClosed()) {
				System.out.println("coneccion realizada con exito a la base de datos");
			}
			return coneccion1;
			
		     } catch (SQLException |FileNotFoundException e) {		
			    e.printStackTrace();
			    System.out.println("no es posible la coneccion a la base de datos");
		     }
			   catch (ClassNotFoundException e ) {
				  e.printStackTrace();
			      System.out.println("no se encontro el driver");
				  
				  
	     	 } catch (IOException e) {	
	 			e.printStackTrace();
	 			System.out.println("no se encontro el archivo properties");
			 }		
		    
			return null;
	
	}	
}
