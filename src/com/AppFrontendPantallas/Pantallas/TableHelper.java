package com.AppFrontendPantallas.Pantallas;

public class TableHelper {

	public static String[] getColumnNames() {
		return new String[] {"Nombre", "Apellido", "Pasatiempo", "A�os Practica", "Soltero/a"};
	}
	
	public static Object[][] getData() {
		return new Object[][] {/*{"Maria", "Campione", "Esquiar", new Integer(4), Boolean.FALSE},
								{"Lucas", "Hum", "Patinar", new Integer(10), Boolean.FALSE},
								{"Carla", "Gonzales", "Escalar", new Integer(2), Boolean.FALSE},
								{"Marcos", "Esposito", "Nadar", new Integer(8), Boolean.TRUE},
								{"Angela", "Perez", "Correr", new Integer(1), Boolean.TRUE}
							   */};
	}	
	
}
