/**
 * Generated on Sat May 30 21:27:36 UTC 2020 by ObjGen 3.0
 */
package com.AppBackend.domain;

import java.io.Serializable;

public class Aerolinea implements Serializable{

	private static final long serialVersionUID = -4066101569874565022L;


	String Nombre;

	Object Vuelos = new Object();

	public Aerolinea(String nombre, Object vuelos) {
		super();
		Nombre = nombre;
		Vuelos = vuelos;
	}

	public Aerolinea() {
		super();
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String value) {
		this.Nombre = value;
	}

	public Object getVuelos() {
		return this.Vuelos;
	}

	public void setVuelos(Object value) {
		this.Vuelos = (Object) value;
	}

	@Override
	public String toString() {
		return "Aerolinea [Nombre=" + Nombre + ", Vuelos=" + Vuelos + "]";
	}
}
